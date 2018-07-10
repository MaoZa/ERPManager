<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@ page import="com.dao.GoodsDAO" %>
<%@ page import="java.util.List" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>物资管理系统</title>
<link rel="stylesheet" href="Css/style.css">
</head>
<body onLoad="clockon(bgclock)">
<table width="1000" height="174" border="0" align="center" cellpadding="0" cellspacing="0" >
  <tr>
    <td height="133" align="center" valign="top"><%@ include file="top.jsp"%></td>
  </tr>
  <tr>
    <td>
      <table width="100%" height="26" border="0" cellpadding="0" cellspacing="0" background="images/area_bg.jpg" style="background-size:100% 100%;">
        <tr>
          <td width="26%" align="right"><div id="bgclock" class="word_white"></div></td>
          <td width="4%">&nbsp;</td>
          <td width="70%" valign="bottom" >当前位置：物资管理系统首页 &gt;&gt;&gt;</td>
        </tr>
      </table>
<table width="100%" height="385" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td width="5" valign="top" background="images/left.gif">&nbsp;</td>
        <td valign="top" background="images/main.jpg" style="background-size:100% 100%;">&nbsp;</td>
        <td width="10" valign="top" background="images/right.jpg">&nbsp;</td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="55" valign="top" background="images/bottom.jpg" style="background-size:100% 100%;"><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>
