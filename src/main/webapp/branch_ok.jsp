<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>操作成功!</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<body>
<%int para=Integer.parseInt(request.getParameter("para"));
switch(para){
	case 1:
	%>
		<script language="javascript">
		alert("部门信息添加成功!");
		window.location.href="branch.do?action=branchQuery";
		</script>	
	<%	break;
	case 3:
	%>
		<script language="javascript">
		alert("部门信息删除成功!");
		window.location.href="branch.do?action=branchQuery";
		</script>		
	<%	break;
}
%>
</body>
</html>