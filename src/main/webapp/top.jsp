<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.hxzy.pojo.Tb_user"%>
<%@ page import="java.util.List"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/Css/style.css" rel="stylesheet" />
<script src="/JS/onclock.JS"></script>
<script src="/JS/menu.JS"></script>
<div class=menuskin id=popmenu
	onmouseover="clearhidemenu();highlightmenu(event,'on')"
	onmouseout="highlightmenu(event,'off');dynamichide(event)"
	style="Z-index: 100; position: absolute;"></div>
<table width="1000" height="133" border="0" align="center"
	cellpadding="0" cellspacing="0" background="/images/topbg.jpg"
	style="background-size: 100% 100%;">
	<tr>
		<td valign="top"><table width="99%" height="131" border="0"
				align="center" cellpadding="0" cellspacing="0">
				<tr>
					<td width="24%" height="109">&nbsp;</td>
					<td colspan="2">&nbsp;</td>
					<td width="17%"><a href="quit.jsp">・ 关闭系统</a> <br> <a
						href="#" onClick="quit()">・ 重新登录</a><br> 
						<script
							language="javascript">
							function quit() {
								if (confirm("真的要重新登录吗?")) {
									window.location.href = "/logout.jsp";
								}
							}
						</script> <a href="pwsModify.jsp">・ 修改密码</a></td>
				</tr>
				<tr>

					<td align="center" class="word_Green">当 前 登 录 用 户 ：${user.name }</td>
					<td width="10%">&nbsp;</td>
					<td colspan="2"><table width="100%" height="19" border="0"
							cellpadding="0" cellspacing="0">
							<tr>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
								<td width="12%" style="color: #929291">
									<c:if test="${user.setinstorage }">
									<a
									onmouseover=showmenu(event,instoragemenu)
									onmouseout=delayhidemenu() class='word_white'
									style="CURSOR: hand">物资入库</a>
									</c:if>
									<c:if test="${!user.setinstorage }">
									物资入库
									</c:if>
								</td>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
								<td width="12%" style="color: #929291">
									<c:if test="${user.setoutstorage }">
									<a
									onmouseover=showmenu(event,outstoragemenu)
									onmouseout=delayhidemenu() class='word_white'
									style="CURSOR: hand">物资出库</a>
									</c:if>
									<c:if test="${!user.setoutstorage }">
									物资出库
									</c:if>
								</td>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
								<td width="12%" style="color: #929291">
									<c:if test="${user.setdeal }">
									<a onmouseover=showmenu(event,dealmenu)
									onmouseout=delayhidemenu() class='word_white'
									style="CURSOR: hand">物资处理</a>
									</c:if>
									<c:if test="${!user.setdeal }">
									物资处理
									</c:if>
								</td>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
								<td width="12%" style="color: #929291">
									<c:if test="${user.setquery }">
									<a
									onmouseover=showmenu(event,querymenu)
									onmouseout=delayhidemenu() class='word_white'
									style="CURSOR: hand">查询统计</a>
									</c:if>
									<c:if test="${!user.setquery }">
									查询统计
									</c:if>
								</td>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
								<td width="12%" style="color: #929291">
									<c:if test="${user.setbasic }">
									<a
									onmouseover=showmenu(event,baiscmenu)
									onmouseout=delayhidemenu() class='word_white'
									style="CURSOR: hand">基础信息</a>
									</c:if>
									<c:if test="${!user.setbasic }">
									基础信息
									</c:if>
								</td>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
								<td width="12%" style="color: #929291">
									<c:if test="${user.setsys }">
									<a onmouseover=showmenu(event,sysmenu)
									onmouseout=delayhidemenu() class='word_white'
									style="CURSOR: hand">系统管理</a>
									</c:if>
									<c:if test="${!user.setsys }">
									系统管理
									</c:if>
								</td>
								<td width="4%"><img src="/images/compart.gif" width="5"
									height="22"></td>
							</tr>
						</table></td>
				</tr>
			</table></td>
	</tr>
</table>

