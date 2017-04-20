<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<style type="text/css">
	.loginForm{
		width: 500px;
		height: 500px;
		margin: 0px auto;
		margin-top: 1%;
	}
	h4{
		width: 500px;
		margin: 0px auto;
		margin-top: 6%;
	}
</style>
</head>
<body>
	<input id="principal" type="hidden" value="<shiro:principal property="username"/>" />
	<shiro:guest>
		<h4>Login Page</h4>
		<form class="loginForm" action="${baseurl}/login.html" method="POST">
			username: <input type="text" name="username" /> <br> <br> password: <input type="password" name="password" /> <br> <br> <input type="submit" value="Submit" /> <a href="${baseurl}/first.html">goback!</a>
		</form>
	</shiro:guest>
</body>
	<script type="text/javascript">
		$(function(){
			var principal = $("#principal").val();
			if (principal) {
				window.location="${baseurl}/login.html";
			}
		});
	</script>
</html>