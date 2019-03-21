$(function() {
	// var path = $("#path").val();// 路径
	layui.use('laydate', function() {
		var laydate = layui.laydate;
		// 常规用法
		laydate.render({
			elem : '#beginDate'
		});
		laydate.render({
			elem : '#endTime'
		});
	});

	layui.use('table', function() {

		var table = layui.table;
		table.render({
			elem : '#test',
			url : 'findLogList',
			cellMinWidth : 80 // 全局定义常规单元格的最小宽度，layui 2.2.1 新增
			,
			page : true,
			height : "full-174",
			limits : [ 5, 10, 15, 20, 25 ],
			limit : 5,
			id : "logListTable",
			cols : [ [ {
				field : 'rowno',
				width : 95,
				title : '序号',
			// sort : true
			}, {
				field : 'logName',
				width : 150,
				title : '操作名称',
				sort : true
			}, {
				field : 'logTime',
				width : 180,
				title : '操作时间',
				sort : true
			}, {
				field : 'userBean',
				width : 126,
				title : '用户名',
				templet : '<div>{{d.userBean.userName}}</div>'
			}, {
				field : 'userBean',
				title : '真实姓名',
				width : 125,
				// minWidth : 100,
				templet : '<div>{{d.userBean.realName}}</div>'
			} // minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
			// , {
			// field : 'downloadFileTimes',
			// title : '下载文档数',
			// width : 120,
			// sort : true
			// // 是否排序
			// }, {
			// field : 'userState',
			// title : '用户状态',
			// width : 120,
			// sort : true
			// }
			] ]
		});

		var $ = layui.$, active = {
			reload : function() {
				var userName = $('#userName').val();
				var logName = $('#logName').val();
				var beginDate = $('#beginDate').val();
				var endTime = $('#endTime').val();
				var flag = true;
				if (beginDate != "") {
					if (endTime == "") {
						flag = false;
						layer.msg("结束日期不能为空！");
					} else {
						if (endTime < beginDate) {
							flag = false;
							layer.msg("结束日期不能小于开始日期！");
						}
					}
				}
				if (endTime != "") {
					if (beginDate == "") {
						flag = false;
						layer.msg("起始日期不能为空！");
					}
				}
				if (flag) {
					// 执行重载
					table.reload('logListTable', {
						page : {
							curr : 1
						// 重新从第 1 页开始
						},
						where : {
							userName : userName,
							logName : logName,
							beginDate : beginDate,
							endTime : endTime
						}
					});
				}

			}
		};

		$('.logTable .layui-btn').on('click', function() {
			var type = $(this).data('type');
			active[type] ? active[type].call(this) : '';
		});
	});

})
