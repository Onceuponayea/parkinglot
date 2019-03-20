<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>智能停车场管理系统</title>



<link rel="stylesheet" href=<%=path + "/backstage/css/pintuer.css"%>>
<link rel="stylesheet" href=<%=path + "/backstage/css/admin.css"%>>


<script src=<%=path + "/backstage/js/jquery.js"%>></script>


<!--  <link rel="stylesheet" href="backstage/css/pintuer.css">
    <link rel="stylesheet" href="backstage/css/admin.css">
    <script src="backstage/js/jquery.js"></script>    -->
</head>
<body style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src=<%=path + "/backstage/images/y.jpg"%>
					class="radius-circle rotate-hover" height="50" alt="" />智能停车场管理系统
			</h1>
		</div>
		<div class="head-l">
			<a class="button button-little bg-green" href="personnew.html">个人信息</a>
			&nbsp;&nbsp; <a class="button button-little bg-red" href="login.html">
				<span class="icon-power-off"></span> 退出登录
			</a>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		<h2>
			<span class="icon-user"></span>基本设置
		</h2>
		<ul>
			<li><a href="pass.html" target="right"><span
					class="icon-caret-right"></span>修改密码</a></li>
			<li><a href="personnew.html" target="right"><span
					class="icon-caret-right"></span>个人资料</a></li>
		</ul>

		<c:forEach items="${map}" step="1" var="i">
			<h2>
				<span class="icon-pencil-square-o"></span>${i.key}
			</h2>
			<ul>
				<c:forEach items="${i.value}" step="1" var="j">
					<li><a href="<%=path%>${j.url}" target="right"><span
							class="icon-caret-right"></span>${j.menuName}</a></li>
				</c:forEach>
			</ul>
		</c:forEach>


	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})

			$(".icon-home").click(function() {
				$("#a_leader_txt").text("所有公告");
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})

		});
	</script>
	<ul class="bread">
		<li><a href=<%=path + "/info.jsp"%> target="right"
			class="icon-home"> 首页</a></li>
		<li><a href="##" id="a_leader_txt">公告信息</a></li>
	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0" src="info.jsp" name="right"
			width="100%" height="100%"></iframe>
	</div>
	<div style="text-align: center;"></div>
</body>
</html>