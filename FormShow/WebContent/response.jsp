<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deneme Sayfasi</title>
</head>
<body >
	<%String isim = request.getParameter("isim");
		if(isim.length() == 0 ){%>
		<h1 style = \"color:red\">ad-soyad kisimlarini doldurmak zorundasiniz</h1>
	<%}else{ %>
		<TABLE BORDER=1 ALIGN=CENTER style = " margin-top:50px;margin-left: 0in">
			<TR BGCOLOR="#FFAD00">
			<TH>Parameter Name<TH>Parameter Value(s)
			<TR><TH>ISIM<TD></b> <%=request.getParameter("isim")  %>
			<TR><TH> SOYAD <TD> <%= request.getParameter("soyad") %>
			<TR><TH> CINSIYET <TD> <%=request.getParameter("check") %>
			<TR><TH> MESLEK <TD> <%= request.getParameter("meslek") %>
			<TR><TH> MESAJ  <TD> <%= request.getParameter("mesaj") %>
			<TABLE>
	<% }%>
</body>
</html>


