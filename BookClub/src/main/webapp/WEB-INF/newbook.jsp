<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<form:form action="/home" method="get">
             	<input type="submit" value="Back to my shelf!" class="btn btn-primary" />
			</form:form>
	<div class="input-group input-group-lg">
		<form:form action="/books" method="post" modelAttribute="book">
			<p>
				<form:label path="title">Title</form:label>
				<form:errors path="title"/>
				<form:input path="title"/>
			</p>
			<p>
				<form:label path="authorname">Author Name</form:label>
				<form:errors path="authorname"/>
				<form:textarea path="authorname"/>
			</p>
			

			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>