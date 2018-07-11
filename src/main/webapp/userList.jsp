<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>物资管理系统</title>
<link rel="stylesheet" href="Css/style.css">
</head>

<body onLoad="clockon(bgclock)" >
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
          <td width="70%" valign="bottom">当前位置：系统管理 &gt; 用户管理 &gt;&gt;&gt;</td>
        </tr>
      </table>
<table width="100%" height="385" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" >
      <tr>
        <td width="5" valign="top" background="images/left.gif">&nbsp;</td>
        <td align="center" valign="top">&nbsp;
        <table width="96%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="right"><a href="userAdd.jsp">添加用户</a></td>
          </tr>
        </table>
<%
List list=(List)request.getAttribute("userList");
		if(list.size()<=0){%>
        <table width="96%" border="0" cellspacing="0" cellpadding="0" >
          <tr>
            <td  height="40" align="center" >暂无用户信息!</td>
          </tr>
		  </table>
		<%}else{%>
        <table width="96%" border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#FFFFFF" bordercolorlight="#DDDDDA" >
          <tr>
            <td align="center" bgcolor="#D7F6FB">用户名称</td>
            <td align="center" bgcolor="#D7F6FB">用户类型</td>
            <td width="10%" align="center" bgcolor="#D7F6FB">入库管理</td>
            <td width="10%" align="center" bgcolor="#D7F6FB">出库管理</td>
            <td width="10%" align="center" bgcolor="#D7F6FB">物资处理</td>
            <td width="10%" align="center" bgcolor="#D7F6FB">查询统计</td>
            <td width="10%" align="center" bgcolor="#D7F6FB">基础信息</td>
            <td width="10%" align="center" bgcolor="#D7F6FB">系统管理</td>
            <td width="6%" align="center" bgcolor="#D7F6FB">修改</td>
            <td width="6%" align="center" bgcolor="#D7F6FB">删除</td>
          </tr>
        <%
Iterator it=list.iterator();
int id=-1;
String name="";
int usertype=0;
Byte setInstorage=new Byte("0");
Byte setOutstorage=new Byte("0");
Byte setDeal=new Byte("0");
Byte setQuery=new Byte("0");
Byte setBasic=new Byte("0");
Byte setSys=new Byte("0");
while(it.hasNext()){
	UserForm userForm=(UserForm)it.next();
        id=userForm.getId();
        name=userForm.getName();
        usertype=userForm.getUsertype();
        setInstorage=userForm.getSetInstorage();
        setOutstorage=userForm.getSetOutstorage();
        setDeal=userForm.getSetDeal();
        setQuery=userForm.getSetQuery();
        setBasic=userForm.getSetBasic();
        setSys=userForm.getSetSys();
        if(!name.equals("mr")){
%>
          <tr>                              
            <td>&nbsp;<%=name %></td>
            <td align="center">&nbsp;<% if(usertype==1) out.print("管理员");else out.print("普通用户");%></td>
            <td align="center">&nbsp;
              <input name="checkbox" type="checkbox" class="noborder" value="checkbox" disabled="disabled" <%if(setInstorage.equals(new Byte("1"))){out.println("checked");}%>></td>
            <td align="center">&nbsp;
              <input name="checkbox" type="checkbox" class="noborder" value="checkbox" disabled="disabled" <%if(setOutstorage.equals(new Byte("1"))){out.println("checked");}%>></td>
            <td align="center">&nbsp;
              <input name="checkbox" type="checkbox" class="noborder" value="checkbox" disabled="disabled" <%if(setDeal.equals(new Byte("1"))){out.println("checked");}%>></td>
            <td align="center">&nbsp;
              <input name="checkbox" type="checkbox" class="noborder" value="checkbox" disabled="disabled" <%if(setQuery.equals(new Byte("1"))){out.println("checked");}%>></td>
            <td align="center">&nbsp;
              <input name="checkbox" type="checkbox" class="noborder" value="checkbox" disabled="disabled" <%if(setBasic.equals(new Byte("1"))){out.println("checked");}%>></td>
            <td align="center">&nbsp;
              <input name="checkbox" type="checkbox" class="noborder" value="checkbox" disabled="disabled" <%if(setSys.equals(new Byte("1"))){out.println("checked");}%>></td>
            <td align="center">&nbsp;<%if(usertype==1) out.print("---"); else{ %><a href="user/userMQuery&id=<%=id%>">修改</a> <% } %></td>
            <td align="center">
            <a href="user/userdel&id=<%=id%>&val=1">删除</a>            </td>
          </tr>
		  <%}
}%>
        </table>
		<%}%>
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
