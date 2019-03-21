<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>导航到停车场</title>
<style type="text/css">
body, html {
	width: 100%;
	height: 100%;
	margin: 0;
	font-family: "微软雅黑";
}

#allmap {
	height: 100%;
	width: 70%;
	float: left
}

#r-result, #r-result table {
	height: 100%;
	width: 30%;
	float: left
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=lxdDQ69hAOHRLieQsHvAI0PRsPM0vF7m"></script>
<script src=<%=path + "/backstage/js/jquery.js"%>></script>
</head>
<body>
	<div id="allmap"></div>
	<div id="r-result"></div>
	<div>
		<input type="hidden" id="cy" value="${city}" /> <input type="hidden"
			id="addr" value="${address}" />
	</div>
</body>
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var city = $("#cy").val();
	var address = $("#addr").val();
	map.centerAndZoom(city, 12);
	map.enableScrollWheelZoom(); //启用滚轮放大缩小，默认禁用
	map.enableContinuousZoom(); //启用地图惯性拖拽，默认禁用
	map.addControl(new BMap.NavigationControl()); //添加默认缩放平移控件
	map.addControl(new BMap.OverviewMapControl()); //添加默认缩略地图控件
	map.addControl(new BMap.OverviewMapControl({
		isOpen : true,
		anchor : BMAP_ANCHOR_BOTTOM_RIGHT
	})); //右下角区域，打开
	//单击获取点击的经纬度
	map.addEventListener("click", function(e) {
		map.clearOverlays();
		var myP1 = new BMap.Point(e.point.lng, e.point.lat); //起点
		var myP2 = address; //终点
		var myIcon = new BMap.Icon(
				"http://lbsyun.baidu.com/jsdemo/img/Mario.png", new BMap.Size(
						32, 70), { //小车图片
					imageOffset : new BMap.Size(0, 0)
				//图片的偏移量。为了是图片底部中心对准坐标点。
				});
		window.run = function() {
			var driving = new BMap.DrivingRoute(map, {
				renderOptions : {
					map : map,
					panel : "r-result",
					autoViewport : true
				}
			}); //驾车实例
			driving.search(myP1, myP2);
			driving
					.setSearchCompleteCallback(function() {
						var pts = driving.getResults().getPlan(0).getRoute(0)
								.getPath(); //通过驾车实例，获得一系列点的数组
						var paths = pts.length; //获得有几个点
						var carMk = new BMap.Marker(pts[0], {
							icon : myIcon
						});
						map.addOverlay(carMk);
						i = 0;
						function resetMkPoint(i) {
							carMk.setPosition(pts[i]);
							if (i < paths) {
								setTimeout(function() {
									i++;
									resetMkPoint(i);
								}, 100);
							}
						}
						setTimeout(function() {
							resetMkPoint(5);
						}, 100)

					});
		}

		setTimeout(function() {
			run();
		}, 1500);
	});
</script>

</html>
