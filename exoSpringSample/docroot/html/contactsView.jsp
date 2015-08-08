<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

<title>Contacts Portlet</title>
</head>
<body>
	<table border = "1">
<tr>
<th style="text-align:left">Name</th>
<th style="text-align:left">Email</th>
<th style="text-align:left">Phone</th>
</tr>
<c:forEach items = "${contacts}" var ="contact">
<tr>
<td>${contact.firstName}&nbsp;${contact.middleName}&nbsp;${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.phone}</td>
</tr>
</c:forEach>
</table>
</body>
</html>