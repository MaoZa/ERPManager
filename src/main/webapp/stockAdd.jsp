<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script language="javascript">
function mycheck(form){
	if(form.principal.value==""){
		alert("请填写负责人姓名!");form.principal.focus();return false;
	}
}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>物资管理系统</title>
<link rel="stylesheet" href="Css/style.css">
</head>
<body onLoad="clockon(bgclock)" >
<table width="757" height="174" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="133" align="center" valign="top"><%@include file="top.jsp"%>
    </td>
  </tr>
  <tr>
    <td><table width="100%" height="26" border="0" cellpadding="0" cellspacing="0" background="images/area_bg.jpg" style="background-size:100% 100%;">
        <tr>
          <td width="26%" align="right"><div id="bgclock" class="word_white"> </div></td>
          <td width="4%">&nbsp;</td>
          <td width="70%" valign="bottom"> 当前位置：物资入库
            &gt;
            采购登记
            &gt;&gt;&gt; </td>
        </tr>
      </table>
      <table width="100%" height="385" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
        <tr>
          <td width="5" valign="top" background="images/left.gif">&nbsp;</td>
          <td align="center" valign="top">&nbsp;
            <form name="form1" method="post" action="/cart/add" onSubmit="return mycheck(form1)">
              <table width="96%" height="56" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#DDDDDA" bordercolordark="#FFFFFF">
                <tr>
                  <td width="35%" align="center" bgcolor="#D7F6FB">物资名称[规格]</td>
                  <td width="25%" align="center" bgcolor="#D7F6FB">生产厂家</td>
                  <td width="17%" align="center" bgcolor="#D7F6FB">单价</td>
                  <td width="17%" align="center" bgcolor="#D7F6FB">数量</td>
                  <td width="6%" align="center" bgcolor="#D7F6FB">操作</td>
                </tr>
                <tr>
                  <script language="javascript">
					  function checkStock(myform){
					  	if(myform.price.value<=0){
							alert("请输入单价!");myform.price.focus();return;
						}
					  	if(myform.number.value<=0){
							alert("请输入数量!");myform.number.focus();return;
						}
						myform.submit();
					  }
					  function ChangeItem(id){
					  	window.location.href="/instorage/changeGoods/"+id;
					  }
				  </script>
                  <td align="left"style="padding-left:10px">
                  	<select name="id" class="select" id="id" onChange="ChangeItem(this.value)">
						<c:forEach items="${goodslist }" var="goods">
                      		<c:if test="${goods.id == selectid}">
                      			<option value="${goods.id }" selected="selected">${goods.name } [${goods.spec }]</option>
                      		</c:if>
                      		<c:if test="${goods.id != selectid}">
                      			<option value="${goods.id }" >${goods.name } [${goods.spec }]</option>
                      		</c:if>
                     	</c:forEach>
                    </select>
                  </td>
                  <c:forEach items="${goodslist }" var="goods">
                  <c:if test="${goods.id == selectid }">
                  	<td align="left"style="padding-left:10px" >${goods.producer }</td>
	                <td align="center"><input name="price" type="text" id="price" size="10" value="${goods.price }">元 </td>
	                <td align="center"><input name="number" type="text" id="number" value="0" size="8" >${goods.unit }</td>
                  </c:if>
                  </c:forEach>
                  <td align="center"><a href="#" onClick="checkStock(form1)">采购</a> </td>
                </tr>
				<c:if test="${!empty stockgoods }">
				${stockgoods }
				<c:forEach items="${stockgoods }" var="stockgood">
					<tr>
	                  <td width="35%" align="left" style="padding-left:10px">${stockgood.tb_goods.name }</td>
	                  <td width="25%" align="left" style="padding-left:10px">${stockgood.tb_goods.producer }</td>
	                  <td width="17%" align="left" style="padding-left:15px">${stockgood.tb_goods.price }元</td>
	                  <td width="17%" align="left" style="padding-left:20px">${stockgood.number }&nbsp;[${stockgood.tb_goods.unit }]</td>
	                  <td width="6%" align="center"><a href="/cart/remove/${stockgood.id }">移去</a></td>
	                </tr>
				</c:forEach>
                </c:if>
              </table>
            </form>
            <form name="form2" method="post" action="/instorage/stockadd" onSubmit="return mycheck(form2)">
              <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td>&nbsp;</td>
                </tr>
              </table>
              <table width="96%" height="76" border="0" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#DDDDDA" bordercolordark="#FFFFFF" class="tableBorder">
                <tr>
                  <td width="14%" height="38" align="center">供应商名称：</td>
                  <td colspan="3" align="left"><select name="providerid" id="providerid">
                  <c:forEach items="${providerlist }" var="provider">
                      <option value="${provider.id }">${provider.name }</option>
                  </c:forEach>
                    </select>                  </td>
                  <td width="10%" align="left">合计金额：</td>
                  <td width="26%" align="left"><input name="totalpay" type="text" id="totalpay"  size="20" value="${amount }" readonly="yes" >
                    元 </td>
                </tr>
                <tr>
                  <td height="38" align="center"> 负&nbsp;&nbsp;责&nbsp;&nbsp;人：</td>
                  <td width="35%" align="left"><input name="principal" type="text" id="principal" size="20">                  </td>
                  <td width="8%" align="left">&nbsp;</td>
                  <td width="7%" align="left">&nbsp;</td>
                  <td align="left">操&nbsp;作&nbsp;员：</td>
                  <td align="left"><input name="username" type="text" id="username" value="${user.name }" size="20" readonly="yes"></td>
                </tr>
              </table>
              <table width="96%" height="76" border="0" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#DDDDDA" bordercolordark="#FFFFFF">
                <tr>
                  <td align="center">
				  <input name="Submit4" type="submit" class="btn_grey" value="保存">
                    &nbsp;
                    <input name="Submit22" type="button" class="btn_grey" value="重置" onClick="window.location.href='cart/clear';">
                    &nbsp;</td>
                </tr>
              </table>
            </form></td>
          <td width="10" valign="top" background="images/right.jpg">&nbsp;</td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td height="55" valign="top" background="images/bottom.jpg"><%@include file="copyright.jsp"%>
    </td>
  </tr>
</table>
</body>
</html>
