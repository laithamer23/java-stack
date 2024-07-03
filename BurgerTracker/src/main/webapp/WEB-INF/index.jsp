<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>
<meta charset="UTF-8">
<title>Burger Traker</title>
</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Burger Name</th>
				<th scope="col">Resturent Name</th>
				<th scope="col">Rating</th>
				<th scope="col">Action</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="BurgerTracker" items="${allburgertraker}">
				<tr>

					<td><c:out value="${BurgerTracker.burgername}"></c:out></td>
					<td><c:out value="${BurgerTracker.resturantname}"></c:out></td>
					<td><c:out value="${BurgerTracker.rating}"></c:out></td>
					<td id="derstroy"><a href="/edit/${BurgerTracker.id}">Edit</a></td>
						
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/create" method="post" modelAttribute="burgertraker">

		<p>
			<form:label path="burgername">Burger Name</form:label>
			<form:errors path="burgername"/>
			<form:input path="burgername" class="table table-hover"/>
		</p>
		<p>
			<form:label path="resturantname">Resturent Name</form:label>
			<form:errors path="resturantname" />
			<form:input path="resturantname" class="table table-hover"/>
		</p>
		<p>
			<form:label path="rating">Rating</form:label>
			<form:errors path="rating"/>
			<form:input type="rating" path="rating" class="table table-hover"/>
		</p>
		<p>
			<form:label path="note">Note</form:label>
			<form:errors path="note"/>
			<form:textarea path="note" class="table table-hover"/>
		</p>
		<input type="submit" value="Submit" class="table table-hover" />
	</form:form>
</body>
</html>