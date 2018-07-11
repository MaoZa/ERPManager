<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${goods.ifdel }">
	<script language="javascript">
		alert("您的操作有误！请先恢复这个物资");
		window.location.href = "/goods/goodsRequest";
	</script>
</c:if>
<script language="javascript">
	function mycheck(form1) {

		if (form1.spec.value == "") {
			alert("请填写物资规格!");
			form1.spec.focus();
			return false;
		}
		if (form1.unit.value == "") {
			alert("请填写单位信息!");
			form1.unit.focus();
			return false;
		}
		if (form1.price.value == "") {
			alert("请填写物资单价!");
			form1.price.focus();
			return false;
		}
		if (isNaN(form1.price.value)) {
			alert("您输入的单价信息错误，请重新输入!");
			form1.price.focus();
			return false;
		}
		if (form1.producer.value == "") {
			alert("请填写生产厂家!");
			form1.producer.focus();
			return false;
		}
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>物资管理系统</title>
<link rel="stylesheet" href="Css/style.css">
</head>

<body onLoad="clockon(bgclock)">
	<table width="757" height="174" border="0" align="center"
		cellpadding="0" cellspacing="0">
		<tr>
			<td height="133" align="center" valign="top"><%@ include
					file="top.jsp"%></td>
		</tr>
		<tr>
			<td>
				<table width="100%" height="26" border="0" cellpadding="0"
					cellspacing="0" background="images/area_bg.jpg"
					style="background-size: 100% 100%;">
					<tr>
						<td width="26%" align="right"><div id="bgclock"
								class="word_white"></div></td>
						<td width="4%">&nbsp;</td>
						<td width="70%" valign="bottom">当前位置：基础信息 &gt; 物资管理 &gt;
							修改物资信息 &gt;&gt;&gt;</td>
					</tr>
				</table>
				<table width="100%" height="385" border="0" cellpadding="0"
					cellspacing="0" bgcolor="#FFFFFF">
					<tr>
						<td width="5" valign="top" background="images/left.gif">&nbsp;</td>
						<td align="center" valign="top">&nbsp;
							<form name="form1" method="post" action="/goods/goodsModifyTrue"
								onSubmit="return mycheck(form1)">
								<table width="96%" height="203" border="0" cellpadding="0"
									cellspacing="0" bordercolor="#FFFFFF"
									bordercolorlight="#DDDDDA" bordercolordark="#FFFFFF">
									<tr>
										<td width="31%" align="center">物资名称：<input name="id"
											type="hidden" size="60" value="${goods.id }"></td>
										<td width="69%" align="left"><input name="name"
											type="text" id="name" size="60" readonly="yes"
											value="${goods.name }"></td>
									</tr>
									<tr>
										<td align="center">规&nbsp;&nbsp;&nbsp;&nbsp;格：</td>
										<td align="left"><input name="spec" type="text" id="spec"
											size="50" value="${goods.spec }"></td>
									</tr>
									<tr>
										<td align="center">单&nbsp;&nbsp;&nbsp;&nbsp;位：</td>
										<td align="left"><input name="unit" type="text" id="unit"
											value="${goods.unit }"></td>
									</tr>
									<tr>
										<td align="center">单&nbsp;&nbsp;&nbsp;&nbsp;价：</td>
										<td align="left"><input name="price" type="text"
											id="price" value="${goods.price }"> (元)</td>
									</tr>
									<tr>
										<td align="center">生产厂家：</td>
										<td align="left"><input name="producer" type="text"
											size="50" id="producer" value="${goods.producer }>">
											<input name="ifdel" type="hidden" id="ifdel" value="0"></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td><input name="Submit" type="submit" class="btn_grey"
											value="保存"> &nbsp; <input name="Submit2" type="reset"
											class="btn_grey" value="重置"> &nbsp; <input
											name="Submit3" type="button" class="btn_grey" value="返回"
											onClick="window.location.href='/goods/goodsRequest'"></td>
									</tr>
								</table>
							</form>
						</td>
						<td width="10" valign="top" background="images/right.jpg">&nbsp;</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td height="55" valign="top" background="images/bottom.jpg"><%@ include
					file="copyright.jsp"%></td>
		</tr>
	</table>
</body>
</html>
