<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>物资管理系统</title>
<link rel="stylesheet" href="Css/style.css">
</head>

<body onLoad="clockon(bgclock)">
<table width="757" height="174" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="133" align="center" valign="top"><%@ include file="top.jsp"%></td>
  </tr>
  <tr>
    <td>
      <table width="100%" height="26" border="0" cellpadding="0" cellspacing="0" background="images/area_bg.jpg" style="background-size:100% 100%;">
        <tr>
          <td width="26%" align="right"><div id="bgclock" class="word_white"></div></td>
          <td width="4%">&nbsp;</td>
          <td width="70%" valign="bottom">当前位置：基础信息 &gt; 供应商管理 &gt;&gt;&gt;</td>
        </tr>
      </table>
<table width="100%" height="385" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td width="5" valign="top" background="images/left.gif">&nbsp;</td>
        <td align="center" valign="top">&nbsp;
        <table width="96%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="right"><a href="providerAdd.jsp">添加供应商信息</a></td>
          </tr>
        </table>
        <c:if test="${empty providerList }">
	        <table width="96%" border="0" cellspacing="0" cellpadding="0">
	          <tr>
	            <td  height="40" align="center" >暂无供应商信息!</td>
	          </tr>
		 	</table>
		</c:if>
		<c:if test="${!empty providerList }">
        <table width="96%" border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#FFFFFF" bordercolorlight="#DDDDDA">
          <tr>
            <td width="24%" align="center" bgcolor="#D7F6FB">供应商名称</td>
            <td width="27%" align="center" bgcolor="#D7F6FB">地址</td>
            <td width="8%" align="center" bgcolor="#D7F6FB">邮政编码</td>
            <td width="16%" align="center" bgcolor="#D7F6FB">电话</td>
            <td width="14%" align="center" bgcolor="#D7F6FB">传真</td>
            <td width="5%" align="center" bgcolor="#D7F6FB">修改</td>
            <td width="6%" align="center" bgcolor="#D7F6FB">删除</td>
          </tr>
			<c:forEach items="${providerList }" var="provider">
		          <tr>
		            <td>&nbsp;<a href="provider/providerDetail/${provider.id }">${provider.name }</a></td>
		            <td>&nbsp;${provider.address }</td>
		            <td>&nbsp;${provider.postcode }</td>
		            <td>&nbsp;${provider.tel }</td>
		            <td>&nbsp;${provider.fax }</td>
		            <td>&nbsp;<a href="provider/providerMQuery/${provider.id }">修改</a></td>
		            <td align="center">
		            <a href="provider/providerdel/${provider.id }/1">删除</a>
		            </td>
		          </tr>
         	 </c:forEach>
        </table>
        </c:if>
		</td>
        <td width="10" valign="top" background="images/right.jpg">&nbsp;</td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="55" valign="top" background="images/bottom.jpg"><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>
