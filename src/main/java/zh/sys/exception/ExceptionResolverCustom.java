package zh.sys.exception;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import zh.sys.util.result.ExceptionResultInfo;
import zh.sys.util.result.ResultInfo;

public class ExceptionResolverCustom implements HandlerExceptionResolver {
	private static final Logger LOGGER = Logger.getLogger(ExceptionResolverCustom.class);

	private HttpMessageConverter<ExceptionResultInfo> jsonMessageConverter;

	public HttpMessageConverter<ExceptionResultInfo> getJsonMessageConverter() {
		return jsonMessageConverter;
	}

	public void setJsonMessageConverter(HttpMessageConverter<ExceptionResultInfo> jsonMessageConverter) {
		this.jsonMessageConverter = jsonMessageConverter;
	}

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		
		LOGGER.info("in...全局异常解析器================================");
		
		
		// 1.输出异常信息,根据异常信息进行处理
		LOGGER.info("捕获出现的异常信息================================");
		LOGGER.info(ex.getMessage());
		LOGGER.info("捕获出现的异常信息================================");
		// 2.获取出现异常的方法(执行该异常的方法)
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		String view = "/comm/globException";
		if (null == handlerMethod) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("exceptionResultInfo", "请求出错!");
			modelAndView.setViewName(view);
			return modelAndView;
		}
		Method method = handlerMethod.getMethod();
		LOGGER.info("获取出现异常的方法================================");
		LOGGER.info(method.getName());
		LOGGER.info("获取出现异常的方法================================");
		// 3.判断是否返回json(只要方法上包含responseBody注解，就表示返回json):查找方法是否包含@ResponseBody注解
		ResponseBody responseBody = AnnotationUtils.findAnnotation(method, ResponseBody.class);
		// 3.1如果是返回json异常
		if (responseBody != null) {
			return resolveJsonException(request, response, handler, ex);// 直接在显示页面中显示异常信息。
		}
		// 3.2.返回相应结果异常(不是json,通常为跳转页面)
		ExceptionResultInfo exceptionResultInfo = resoverExceptionCustom(ex);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exceptionResultInfo", exceptionResultInfo.getResultInfo().getMessage());
		modelAndView.setViewName(view);
		return modelAndView;
	}

	// 如果有@responsebody注解，将不是json的异常信息转json
	private ModelAndView resolveJsonException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		ExceptionResultInfo exceptionResultInfo = resoverExceptionCustom(ex);
		HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
		try {
			jsonMessageConverter.write(exceptionResultInfo, MediaType.APPLICATION_JSON, outputMessage);
		} catch (HttpMessageNotWritableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		LOGGER.info("out...全局异常解析器================================");
		return new ModelAndView();
	}

	// 异常信息解析方法
	private ExceptionResultInfo resoverExceptionCustom(Exception ex) {
		ResultInfo resultInfo = null;
		if (ex instanceof ExceptionResultInfo) {
			ExceptionResultInfo exceptionResultInfo = (ExceptionResultInfo) ex;
			resultInfo = exceptionResultInfo.getResultInfo();
		}else if(ex instanceof UnauthorizedException){
			ExceptionResultInfo exceptionResultInfo = new ExceptionResultInfo(new ResultInfo(ResultInfo.TYPE_RESULT_FAIL,0,ex.getMessage()));
			resultInfo = exceptionResultInfo.getResultInfo();
		}else if(ex instanceof AuthenticationException){
			ExceptionResultInfo exceptionResultInfo = new ExceptionResultInfo(new ResultInfo(ResultInfo.TYPE_RESULT_FAIL,0,ex.getMessage()));
			resultInfo = exceptionResultInfo.getResultInfo();
		}
		LOGGER.info("ExceptionResultInfo========异常错误信息============"+resultInfo.getMessage());
		return new ExceptionResultInfo(resultInfo);
	}
}
