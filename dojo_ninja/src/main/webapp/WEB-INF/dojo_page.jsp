<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${dojo.name}"></c:out></h1>
<table class="table">
<tr>
<th>First Name</th>
<th>Last Name</th>v
<th>Age</th>
</tr>
<c:forEach var="one" items="${dojo.ninjas}">
<td><c:out value="${one.fname}"/></td>
<td><c:out value="${one.lname}"/></td>
<td><c:out value="${one.age}"/></td>
</c:forEach>
</table>


</body>
</html>