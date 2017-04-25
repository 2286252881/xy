<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/comm/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.tab {
	border: 1px solid gray;
}

.tab th {
	width: 10%;
	border: 1px solid gray;
	text-align: center;
}

.tab td {
	width: 10%;
	border: 1px solid gray;
	text-align: center;
}
</style>
<title>个人中心</title>
</head>
<body>
	<div style="width: 90%; margin: 10px auto;">
		<jsp:include page="menu.jsp"></jsp:include>
		<table style="margin-top: 10px;" class="tab">
			<tr>
				<th>用户名</th>
				<th>昵称</th>
				<th>创建日期</th>
				<th>家庭地址</th>
				<th>性别</th>
				<th>电话号码</th>
				<th>邮箱</th>
				<th colspan="3">操作</th>
			</tr>
			<c:forEach items="${us}" var="u">
				<tr>
					<td>${u.username}</td>
					<td>${u.truename}</td>
					<td><fmt:formatDate value="${u.createdate}"
							pattern="yyyy-mm-dd" /></td>
					<td>${u.useraddress}</td>
					<td><c:if test="${u.sex eq 1}">男</c:if>
						<c:if test="${u.sex eq 2}">女</c:if></td>
					<td>${u.phone}</td>
					<td>${u.email}</td>
					<td>删除、修改、授权</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>