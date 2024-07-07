<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Login and Registration</title>
</head>
<body>
	<div class="container mt-5">

		<p>Book Clube</p>

		<form:form action="/users/new" method="post" modelAttribute="user">
			<div class="mb-3">
				<form:label path="userName">Name</form:label>
				<form:input class="form-control" path="userName"/>
				<small class="text-danger"><form:errors path="userName"/></small>
			</div>
			<div class="mb-3">
				<form:label path="email">Email</form:label>
				<form:input class="form-control" path="email"/>
				<small class="text-danger"> <form:errors path="email" /></small>
			</div>
			<p>
				<form:label path="password">Password</form:label>
				<form:input class="form-control" path="password" type="password"/>
				<small class="text-danger"> <form:errors path="password" /></small>
			</p>
			<p>
				<form:label path="confirm">Confirm PW</form:label>
				<form:input class="form-control" path="confirm"  type="password" />
				<small class="text-danger"> <form:errors path="confirm" /></small>
			</p>
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</form:form>

		<h3>Login</h3>
		<form:form action="/users/login" method="post"
			modelAttribute="newLogin">
			<div class="mb-3">
				<form:label path="email">Email</form:label>
				<form:input class="form-control" path="email"/>
				<small class="text-danger"> <form:errors path="email" /></small>
			</div>
			<p>
				<form:label path="password">Password</form:label>
				<form:input class="form-control" path="password"  type="password"/>
				<small class="text-danger"> <form:errors path="password"/></small>
			</p>
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</form:form>
	</div>
</body>
</html>