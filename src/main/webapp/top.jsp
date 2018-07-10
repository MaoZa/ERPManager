<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@page import="com.hxzy.pojo.Tb_user"%>
<%@ page import="java.util.List" %>
<%
	Tb_user user = (Tb_user)request.getAttribute("user");

%>
<%=user.getSetinstorage() %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/Css/style.css" rel="stylesheet" />
<script src="/JS/onclock.JS"></script>
<script src="/JS/menu.JS"></script>
<div class=menuskin id=popmenu
      onmouseover="clearhidemenu();highlightmenu(event,'on')"
      onmouseout="highlightmenu(event,'off');dynamichide(event)" style="Z-index:100;position:absolute;"></div>
<table width="1000" height="133" border="0" align="center" cellpadding="0" cellspacing="0" background="/images/topbg.jpg" style="background-size:100% 100%;">
  <tr>
    <td valign="top"><table width="99%" height="131" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="24%" height="109">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
        <td width="17%"><a href="quit.jsp">・ 关闭系统</a>          <br>
          <a href="#" onClick="quit()">・ 重新登录</a><br>
<script language="javascript">
	function quit(){
		if(confirm("真的要重新登录吗?")){
			window.location.href="/logout.jsp";
		}
	}
</script>
          <a href="pwsModify.jsp" >・ 修改密码</a> </td>
      </tr>
      <tr>
     
        <td align="center" class="word_Green">当 前 登 录 用 户 ：<%=user.getName()%></td>
        <td width="10%">&nbsp;</td>
        <td colspan="2"><table width="100%" height="19" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
            <td width="12%" style="color:#929291"><%if(user.getSetinstorage()){%><a onmouseover=showmenu(event,instoragemenu) onmouseout=delayhidemenu() class='word_white' style="CURSOR:hand">物资入库</a><%}else{%>物资入库<%}%></td>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
            <td width="12%" style="color:#929291"><%if(user.getSetoutstorage()){%><a onmouseover=showmenu(event,outstoragemenu) onmouseout=delayhidemenu() class='word_white' style="CURSOR:hand">物资出库</a><%}else{%>物资出库<%}%></td>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
            <td width="12%" style="color:#929291"><%if(user.getSetdeal()){%><a onmouseover=showmenu(event,dealmenu) onmouseout=delayhidemenu() class='word_white' style="CURSOR:hand">物资处理</a><%}else{%>物资处理<%}%></td>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
            <td width="12%" style="color:#929291"><%if(user.getSetquery()){%><a onmouseover=showmenu(event,querymenu) onmouseout=delayhidemenu() class='word_white' style="CURSOR:hand">查询统计</a><%}else{%>查询统计<%}%></td>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
            <td width="12%" style="color:#929291"><%if(user.getSetbasic()){%><a onmouseover=showmenu(event,baiscmenu) onmouseout=delayhidemenu() class='word_white' style="CURSOR:hand">基础信息</a><%}else{%>基础信息<%}%></td>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
            <td width="12%" style="color:#929291"><%if(user.getSetsys()){%><a onmouseover=showmenu(event,sysmenu) onmouseout=delayhidemenu() class='word_white' style="CURSOR:hand">系统管理</a><%}else{%>系统管理<%}%></td>
            <td width="4%"><img src="images/compart.gif" width="5" height="22"></td>
          </tr>
        </table></td>
        </tr>
    </table></td>
  </tr>
</table>

