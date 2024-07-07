<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome:${user.userName}</h1>
	<form:form action="/" method="get">
		<input type="submit" value="logout" class="btn btn-primary"/>
	</form:form>
	
	<form:form action="/newbook" method="get">
             	<input type="submit" value="Add a to my shelf!" class="btn btn-primary"/>
			</form:form>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Author Name</th>
				<th scope="col">Posted By</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="Book" items="${books}">
				<tr>
					<td><c:out value="${Book.id}"></c:out></td>
					<td><a href="/show/ ${Book.id}"> <c:out value="${Book.title}"></c:out></a></td>
					<td><c:out value="${Book.authorname}"></c:out></td>
					<td><c:out value="${Book.user.userName}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>