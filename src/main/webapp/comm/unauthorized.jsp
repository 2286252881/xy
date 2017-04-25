<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.content{
		width: 500px;
		margin: 0px auto;
		margin-top: 8%;
	}
</style>
</head>
<body>
	<div class="content">
		<span style="color: red;font-weight: bold;">${exceptionResultInfo}</span>&nbsp;<span style="color:blue" id="num"></span>秒后自动返回,您也可以点击这里>><a href="javascript:history.go(-1)" style="text-decoration: none;">返回</a>
	</div>
</body>
<script type="text/javascript">
	var i=5;
	document.getElementById('num').innerHTML=i;
	setTimeout('myrefresh()', 1000); //指定1秒刷新
	function myrefresh() {
		i--;
		document.getElementById('num').innerHTML=i;
		if(i==0){
			history.go(-1);
		}
		setTimeout('myrefresh()', 1000); //指定1秒刷新
	}
</script>
</html>