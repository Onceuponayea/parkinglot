<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<html>
<head>
<meta charset="utf-8">
<title>日志查看界面</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href=<%=path + "/layui/css/layui.css"%>
	media="all">
<script src=<%=path + "/backstage/js/jquery.js"%>></script>
<script src=<%=path + "/layui/layui.js"%> charset="utf-8"></script>
<script src=<%=path + "/js/checklog.js"%> charset="utf-8"></script>
</head>
<body>
	<%-- 	<input type="hidden" id="path" value=<%=path%> /> --%>
	<div
		style="width: 52%; height: 450px; margin: 0 auto; border: 0px solid;">
		<div class="layui-form logTable">
			<div class="layui-inline">
				<label class="layui-form-label">搜索日志:</label>
			</div>
			<br /> <br />
			<div class="layui-inline">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-inline">
					<input class="layui-input" name="userName" id="userName"
						autocomplete="off">
				</div>
			</div>


			<div class="layui-inline">
				<label class="layui-form-label">操作名称</label>
				<div class="layui-input-inline">
					<select name="logName" id="logName">
						<option value="">请选择操作名称</option>
						<c:forEach items="${logNameList}" step="1" var="i">
							<option value="${i}">${i}</option>
						</c:forEach>
<!-- 						<option value="你的工号">你的工号</option> -->
<!-- 						<option value="你最喜欢的老师">你最喜欢的老师</option> -->
					</select>
				</div>
			</div>


			<br /> <br />
			<div class="layui-inline">
				<label class="layui-form-label">操作时间</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" id="beginDate"
						placeholder="yyyy-MM-dd">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">至</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" id="endTime"
						placeholder="yyyy-MM-dd">
				</div>
			</div>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button class="layui-btn" data-type="reload">搜索</button>
		</div>
		<table class="layui-hide" id="test"></table>
	</div>
</body>
</html>