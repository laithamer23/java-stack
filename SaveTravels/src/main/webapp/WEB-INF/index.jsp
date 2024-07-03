<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Save Travels</title>
</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Expenses</th>
				<th scope="col">Vender</th>
				<th scope="col">Amount</th>
				<th scope="col">Action</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					
					<td><c:out value="${expense.name}"></c:out></td>
					<td><c:out value="${expense.vendor}"></c:out></td>
					<td><c:out value="${expense.amount}"></c:out></td>
					<td id="derstroy"><a href="edit/${expense.id}">Edit</a></td>
						<td><form action="/expense/${expense.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form>
						</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/create" method="post" modelAttribute="expense">
		
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" class="table table-hover" />
		</p>
		<p>
			<form:label path="vendor">Vendor</form:label>
			<form:errors path="vendor" />
			<form:input path="vendor" class="table table-hover" />
		</p>
		<p>
			<form:label path="amount">Amount</form:label>
			<form:errors path="amount" />
			<form:input type="number" path="amount" class="table table-hover" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea path="description" class="table table-hover" />
		</p>
		<input type="submit" value="Submit" class="table table-hover" />
	</form:form>
</body>
</html>