<%@ page contentType="text/html; charset=utf-8" language="java"%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<body>
<script language="javascript">
if(confirm("真的要关闭系统吗？")){
	window.opener=null;
	window.close();
}else{
	history.back();
	}
</script>

</body>
</html>
