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
	text-align: center;
}

.tab td {
	width: 10%;
	text-align: center;
}
</style>
<title>个人中心</title>
</head>
<body>
	<div style="width: 90%; margin: 10px auto;">
		<jsp:include page="menu.jsp"></jsp:include>
		<table style="margin-top: 10px;" class="tab layui-table">
			<tr>
				<th>编号</th>
				<th>用户名</th>
				<th>昵称</th>
				<th>创建日期</th>
				<th>家庭地址</th>
				<th>性别</th>
				<th>电话号码</th>
				<th>邮箱</th>
				<th colspan="3">操作</th>
			</tr>
			<c:forEach items="${us}" var="u" varStatus="n">
				<tr>
					<td>${n.index+1}</td>
					<td>${u.username}</td>
					<td>${u.truename}</td>
					<td><fmt:formatDate value="${u.createdate}"
							pattern="yyyy-mm-dd" /></td>
					<td>${u.useraddress}</td>
					<td><c:if test="${u.sex eq 1}">男</c:if> <c:if
							test="${u.sex eq 2}">女</c:if></td>
					<td>${u.phone}</td>
					<td>${u.email}</td>
					<td><a href="#" onclick="delUser(${u.id});">删除</a>&nbsp;&nbsp;<a
						href="#" onclick="searchRole(${u.id})">授权</a>&nbsp;</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
<script type="text/javascript">
	function delUser(userid){
		//询问框
		layer.confirm('确认删除该用户吗？', {
			btn : [ '确定', '取消' ]
		//按钮
		}, function() {
			$.ajax({
				type : "POST",
				url : "${baseurl}/delUser.html",
				data : {
					userid : userid,
				}
			});
			window.parent.location.reload();
		}, function() {
			layer.close();
		});
	}
	function searchRole(userid){
		layer.open({
		      type: 2,
		      title: '权限分配',
		      shadeClose: false,
		      shade: false,
		      area: ['300px', '300px'],
		      content: ['${baseurl}/toZtree.html','no']
		    });
	}
</script>
</html>