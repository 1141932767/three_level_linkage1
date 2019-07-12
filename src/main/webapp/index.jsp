<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script src="js/jquery-1.12.2.min.js"></script>

<script>
	$(function () {

		//发送ajax请求，加载所有省份数据
		$.get("getProvince",{},function (data) {
			//[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

			//1.获取select
			var province = $("#province");
			//2.遍历json数组
			$(data).each(function () {
				//3.创建<option>
				var option = "<option name='"+this.id+"'>"+this.name+"</option>";

				//4.调用select的append追加option
				province.append(option);
			});


		});

	});


</script>

</head>
<body>



<select id="province">
	<option>--请选择省份--</option>

</select>

</body>
</html>