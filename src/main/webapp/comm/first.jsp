<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

.fixed-nav-bar {
	position: fixed;
	margin-top: 10px;
	margin-bottom: 10px;
	top: 0;
	left: 0;
	z-index: 9999;
	width: 100%;
	height: 35px;
	background-color: black;
	padding-top: 8px;
	text-align: right;
	padding-right: 5%;
	color: white;
	top: 0;
}

.fixed-nav-bar a {
	color: gray;
}

.nav {
	width: 100%;
	margin: auto;
	margin-top: 55px;
	height: 40px;
	text-align: center;
}

.nav ul {
	float: left;
}

.nav .nav_navbar {
	width: 75%;
}

.nav .nav_search {
	width: 25%;
}

.nav .nav_navbar li {
	float: left;
	width: 8%;
	margin-left: 3%;
	list-style: none;
	line-height: 40px;
}

@media ( max-width :768px) {
	.nav .nav_navbar {
		width: 100%;
	}
	.nav .nav_navbar li {
		float: left;
		width: 15%;
		margin-left: 3.2%;
	}
	.nav .nav_search {
		display: none;
	}
}

.nav .nav_navbar li:hover {
	cursor: pointer;
	background-color: black;
	color: white;
	border-radius: 5px;
}

.yy {
	color: white;
	background-color: #dc3f3f;
	border-radius: 5px;
}

.nav .nav_search li {
	float: left;
	list-style: none;
}
.nav .nav_search li span {
	float: right;
	margin-top: -24px;
	margin-right: 10px;
}
.nav .nav_search li span:HOVER {
	cursor: pointer;
}
</style>
</head>
<body>
	<%-- <h4>First Page</h4>
	Welcom:
	<shiro:principal />
	<shiro:guest>visitor</shiro:guest>
	<shiro:hasRole name="admin">
		<br />
		<a href="${baseurl}/jsp/admin/admin.jsp">Admin Page</a>
		<br />
	</shiro:hasRole>
	<shiro:hasRole name="user">
		<br />
		<a href="${baseurl}/jsp/user/user.jsp">User Page</a>
		<br />
	</shiro:hasRole>
	<br />
	<a href="${baseurl}/testShiroAnnotation.html">Test ShiroAnnotation</a>
	<br />
	<br />
	<a href="${baseurl}/comm/login.jsp">login!</a>&nbsp;&nbsp;
	<a href="${baseurl}/logout.html">login out</a>
	<br /> --%>
	<!-- 导航栏部分 -->
	<div class="fixed-nav-bar">
		<input id="principal" type="hidden" value="<shiro:principal/>" /> 您好!
		<shiro:principal />
		<a id="logoutFlag" href="${baseurl}/logout.html">退出</a>
		<shiro:guest>请&nbsp;<a href="${baseurl}/comm/login.jsp">登录</a>&nbsp;或&nbsp;<a href="${baseurl}/comm/reg.jsp">注册</a>
		</shiro:guest>
	</div>
	<div class="nav">
		<ul class="nav_navbar" id="nav_navbar">
			<li>首页</li>
			<li>基金</li>
			<li>保险</li>
			<li>创投</li>
			<li>即讯</li>
		</ul>
		<ul class="nav_search">
			<li><input type="text" class="form-control" placeholder="金融资讯" /><span class="glyphicon glyphicon-search"></span></li>
		</ul>
		<div style="clear: both;"></div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		var principal = $("#principal").val();
		if (principal) {
			$("#logoutFlag").show();
		} else {
			$("#logoutFlag").hide();
		}
		$("#nav_navbar li:first-child").addClass('yy');
		$("#nav_navbar li").click(function() {
			$(this).addClass('yy');
			$(this).siblings('li').removeClass('yy');
		});
	});
</script>
</html>