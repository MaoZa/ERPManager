<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*"%>
<script language="javascript">
	function check(myform) {
		if (myform.sdate.value == "") {
			alert("请输入开始日期");
			myform.sdate.focus();
			return false;
		}
		if (CheckDate(myform.sdate.value)) {
			alert("您输入的开始日期不正确！\n 请注意日期格式或闰年！");
			myform.sdate.focus();
			return false;
		}
		if (myform.edate.value == "") {
			alert("请输入结束日期");
			myform.edate.focus();
			return false;
		}
		if (CheckDate(myform.edate.value)) {
			alert("您输入的结束日期不正确！\n 请注意日期格式或闰年！");
			myform.edate.focus();
			return false;
		}
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>物资管理系统</title>
<link rel="stylesheet" href="Css/style.css">
<script src="JS/function.js"></script>
</head>
<body onLoad="clockon(bgclock)">
	<table width="757" height="174" border="0" align="center"
		cellpadding="0" cellspacing="0">
		<tr>
			<td height="133" align="center" valign="top"><%@include
					file="top.jsp"%></td>
		</tr>
		<tr>
			<td><table width="100%" height="26" border="0" cellpadding="0"
					cellspacing="0" background="images/area_bg.jpg"
					style="background-size: 100% 100%;">
					<tr>
						<td width="26%" align="right"><div id="bgclock"
								class="word_white"></div></td>
						<td width="4%">&nbsp;</td>
						<td width="70%" valign="bottom">当前位置：查询统计 &gt; 部门汇总
							&gt;&gt;&gt;</td>
					</tr>
				</table>
				<table width="100%" height="385" border="0" cellpadding="0"
					cellspacing="0" bgcolor="#FFFFFF">
					<tr>
						<td width="5" valign="top" background="images/left.gif">&nbsp;</td>
						<td align="center" valign="top">&nbsp;
							<table width="96%" height="487" border="0" cellpadding="0"
								cellspacing="0">
								<tr>
									<td align="center" valign="top">
										<form name="myform" method="post" action="ifDeal/branchTotal">
											<table width="98%" border="0" cellpadding="0" cellspacing="0"
												bgcolor="#E3F4F7" class="tableBorder">
												<tr>
													<td align="center">&nbsp;<img src="images/search.gif"
														width="45" height="28"></td>
													<td><input name="flag" type="checkbox" id="flag"
														value="b" checked style="display: none"> 统计时间： 从 <input
														name="sdate" type="text" id="sdate"> 到 <input
														name="edate" type="text" id="edate">
														(日期格式为：2006-07-05) <input name="Submit" type="submit"
														class="btn_grey" value="统计" onClick="return check(myform)"></td>
												</tr>
											</table>
										</form>
										<table width="98%" height="30" border="0" cellpadding="0"
											cellspacing="0" bordercolor="#FFFFFF">
											<tr>
												<td height="36" align="center">没有符合条件的部门领用信息！</td>
											</tr>
										</table> 
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td align="center">message</td>
											</tr>
										</table>
										<table width="98%" border="1" cellpadding="0" cellspacing="0"
											bordercolor="#FFFFFF" bordercolordark="#D2E3E6"
											bordercolorlight="#FFFFFF">
											<tr align="center" bgcolor="#e3F4F7">
												<td width="12%">部门</td>
												<td width="27%">物资名称[规格]</td>
												<td width="4%">单位</td>
												<td width="7%">单价</td>
												<td width="8%">领用数量</td>
												<td width="9%">领用金额</td>
												<td width="9%">报损数量</td>
												<td width="8%">报损金额</td>
												<td width="8%">在用数量</td>
												<td width="8%">在用金额</td>
											</tr>
											<c:forEach items="${branchDamages }" var="branchDamage">
											<tr>
												<td style="padding: 5px;">${branchDamage.branchname }</td>
												<td style="padding: 5px;">${branchDamage.goodsname }[${branchDamage.goodsunit }]</td>
												<td align="center" style="padding: 5px;">${branchDamage.goodsunit }</td>
												<td align="center" style="padding: 5px;">${branchDamage.goodsprice }</td>
												<td align="center" style="padding: 5px;">${branchDamage.lyamount }</td>
												<td style="padding: 5px;">${branchDamage.goodsprice * branchDamage.lyamount }</td>
												<td style="padding: 5px;">${branchDamage.bsamount }</td>
												<td style="padding: 5px;">${branchDamage.goodsprice * branchDamage.bsamount }</td>
												<td style="padding: 5px;">${branchDamage.zyamount }</td>
												<td style="padding: 5px;">${branchDamage.goodsprice * branchDamage.zyamount }</td>
											</tr>
											</c:forEach>
										</table>
									</td>
								</tr>
							</table>

						</td>
						<td width="10" valign="top" background="images/right.jpg">&nbsp;</td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td height="55" valign="top" background="images/bottom.jpg"><%@include
					file="copyright.jsp"%></td>
		</tr>
	</table>
</body>
</html>

