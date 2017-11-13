<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>增加学生信息</title>
</head>
<body>
	<center>
		<form action="Add" name="add">
			序号:<input type="text" name="id" /> <br><br>
			班级:<input type="text" name="banji" /> <br><br>
			学号:<input type="text" name="username" />  <br><br>
			姓名:<input type="texe" name="name" /> <br><br>
			性别:<input type="radio" name="sex" value="男" />男 
				<input type="radio" name="sex" value="女" />女
				 <br><br>
			QQ号:<input type="text"name="qq" />  <br><br>
			密码:<input type="text" name="password" /> <br><br>
			<input	type="submit" value="提交"/> <br><br>
		</form>
	</center>
</body>
</html>