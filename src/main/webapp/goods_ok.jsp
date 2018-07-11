<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>操作成功!</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<body>
<%int para=(Integer)request.getAttribute("para");
switch(para){
	case 1:
	%>
		<script language="javascript">
		alert("物资信息添加成功!");
		window.location.href="/goods/goodsRequest";
		</script>	
	<%	break;
	case 2:
	%>
		<script language="javascript">
		alert("物资信息修改成功!");
		window.location.href="/goods/goodsRequest";
		</script>		
	<%	break;
	case 3:
	%>
		<script language="javascript">
		alert("物资信息删除/恢复成功!");
		window.location.href="/goods/goodsRequest";
		</script>		
	<%	break;
}
%>
</body>
</html>