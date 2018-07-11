<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		alert("部门报损信息添加成功!");
		window.location.href="damage/damageaddquery";
		</script>	
	<%	break;
	case 2:
	%>
		<script language="javascript">
		alert("物资借出审批成功!");
		window.location.href="ifDeal/loanApproveQuery";
		</script>		
	<%	break;
	case 3:
	%>
		<script language="javascript">
		alert("物资借出归还成功!");
		window.location.href="ifDeal/loanBackQuery";
		</script>		
	<%	break;
}
%>
</body>
</html>