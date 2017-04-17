package zh.sys.util.result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultInfo {
	public static final int TYPE_RESULT_FAIL = 0;// 失败
	public static final int TYPE_RESULT_SUCCESS = 1;// 成功
	public static final int TYPE_RESULT_WARN = 2;// 警告
	public static final int TYPE_RESULT_INFO = 3;// 提示信息

	public ResultInfo() {
	}

	/**
	 * 消息提示类型
	 */
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	/**
	 * 提示代码
	 */
	private int messageCode;

	public int getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}

	/**
	 * 提示信息
	 */
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 提示信息明细列表
	 */
	private List<ResultInfo> details;

	public List<ResultInfo> getDetails() {
		return details;
	}

	public void setDetails(List<ResultInfo> details) {
		this.details = details;
	}

	/**
	 * 提交后得到到业务数据信息从而返回给页面
	 */
	private Map<String, Object> sysdata = new HashMap<String, Object>();

	public Map<String, Object> getSysdata() {
		return sysdata;
	}

	public void setSysdata(Map<String, Object> sysdata) {
		this.sysdata = sysdata;
	}

	/**
	 * 构造函数,根据提交信息代码messageCode获取提示信息
	 * 
	 * @param MESSAGE
	 */
	public ResultInfo(final int type, int messageCode, String message) {
		this.type = type;
		this.messageCode = messageCode;
		this.message = message;
	}

	public ResultInfo(final int type, int messageCode, String message, Map<String, Object> sysdata) {
		this.type = type;
		this.messageCode = messageCode;
		this.message = message;
		this.sysdata = sysdata;
	}

	public boolean isSuccess() {
		if (this.type == TYPE_RESULT_SUCCESS) {
			return true;
		}
		return false;
	}

}