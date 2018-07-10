<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@ page import="com.actionForm.ProviderForm" %>
<%@ page import="com.dao.ProviderDAO" %>
<%
ProviderDAO providerDAO=new ProviderDAO();
ProviderForm providerForm=(ProviderForm)providerDAO.query(Integer.parseInt(request.getParameter("id")));
if(providerForm==null){
%>
<script language="javascript">
alert("���Ĳ�������");
window.location.href="provider.do?action=providerQuery";
</script>
<%
}else{
  int id=providerForm.getId();
  String name=providerForm.getName();
  String address=providerForm.getAddress();
  String postcode=providerForm.getPostcode();
  String tel=providerForm.getTel();
  String fax=providerForm.getFax();
  String bankNo=providerForm.getBankNo();
  String bankName=providerForm.getBankName();
  String memo=providerForm.getMemo();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>���ʹ���ϵͳ</title>
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
          <td width="70%" valign="bottom">��ǰλ�ã�������Ϣ &gt; ��Ӧ�̹��� &gt; ��Ӧ����ϸ��Ϣ &gt;&gt;&gt;</td>
        </tr>
      </table>
<table width="100%" height="385" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td width="5" valign="top" background="images/left.gif">&nbsp;</td>
        <td align="center" valign="top">&nbsp;
		<form name="form1" method="post" action="provider.do?action=providerModify" onSubmit="return mycheck(form1)">
        <table width="96%" height="310" border="0" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#DDDDDA" bordercolordark="#FFFFFF">
          <tr>
            <td width="31%" align="center">��Ӧ�����ƣ�</td>
            <td width="69%" align="left"><input name="id" type="hidden" id="id" value="<%=id%>"><input name="name" type="text" id="name" size="60" readonly="yes" value="<%=name%>"></td>
            </tr>
         <tr>
            <td align="center">��&nbsp;&nbsp;&nbsp;&nbsp;ַ��</td>
            <td align="left"><input name="address" type="text" id="address" size="50" value="<%=address%>"></td>
            </tr>
         <tr>
           <td align="center">�������룺</td>
           <td align="left"><input name="postcode" type="text" id="postcode" value="<%=postcode%>"></td>
         </tr>
         <tr>
           <td align="center">��ϵ�绰��</td>
           <td align="left"><input name="tel" type="text" id="tel" value="<%=tel%>"></td>
         </tr>
         <tr>
           <td align="center">������룺</td>
           <td align="left">
             <input name="fax" type="text" id="fax" value="<%=fax%>">
             </td>
         </tr>
         <tr>
           <td align="center">�������У�</td>
           <td align="left"><input name="bankName" type="text" id="bankName" size="50" value="<%=bankName%>"></td>
         </tr>
         <tr>
           <td align="center">�����˺ţ�</td>
           <td align="left"><input name="bankNo" type="text" id="bankNo" value="<%=bankNo%>"></td>
         </tr>
         <tr>
           <td align="center">��&nbsp;&nbsp;&nbsp;&nbsp;ע��</td>
           <td align="left"><input name="memo" type="text" id="memo" size="60" value="<%=memo%>">
             </td>
         </tr>
         <tr>
           <td>&nbsp;</td>
           <td>
            &nbsp;
<input name="Submit3" type="button" class="btn_grey" value="����" onClick="window.location.href='provider.do?action=providerQuery'"></td>
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
    <td height="55" valign="top" background="images/bottom.jpg"><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>
<%} %>