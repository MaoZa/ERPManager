<%@ page contentType="text/html; charset=gb2312" language="java"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<head>
<title>物资管理系统</title>
<link href="Css/style.css" rel="stylesheet">
<script type="text/javascript">
	function check(form) {
		if (form.name.value == "") {
			alert("请输入用户名称!");
			form.name.focus();
			return false;
		}
		if (form.pwd.value == "") {
			alert("请输入密码!");
			form.pwd.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<form name="form1" method="post" action="user/login">
		<table align="center" background="images/login.jpg" width="1000"
			height="700" style="background-size: 100% 100%;">

			<tr>
				<td bgcolor="00FFFF"></td>
				<td>
					<table align="center">
						<tr>
							<td>管理账户：</td>
							<td><input name="name" type="text" id="name" size="25"></td>
						</tr>
						<tr>
							<td>登录密码：</td>
							<td><input name="pwd" type="password" id="pwd" size="25"></td>
						</tr>
						<tr>
							<td><input name="Submit" type="submit" class="btn_grey"
								value="确定" onClick="return check(form1)"></td>
							<td><input name="Submit3" type="reset" class="btn_grey"
								value="重置"></td>
						</tr>
					</table>
				</td>
				<td bgcolor="00FFFF"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>
