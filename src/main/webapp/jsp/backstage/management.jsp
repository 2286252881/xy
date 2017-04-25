<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/comm/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<body>
	<div>
		分类管理
		<br>
		添加分类：<a href="${baseurl}/toAddArticleType.html">添加分类</a>
		<br/>
		查询分类：<input type="text" />
		<br/>
		分类列表
		<div>
			<ul>
				<c:forEach items="${articletypes}" var="articleType">
					<li>${articleType.articletypename}</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>