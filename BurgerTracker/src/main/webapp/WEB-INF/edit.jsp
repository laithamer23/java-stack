<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/update/${burgertraker.id}" method="post" modelAttribute="burgertraker">
 	<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="burgername">Burger Name</form:label>
			<form:errors path="burgername" />
			<form:input path="burgername" class="table table-hover" />
		</p>
		<p>
			<form:label path="resturantname">Resturent Name</form:label>
			<form:errors path="resturantname" />
			<form:input path="resturantname" class="table table-hover" />
		</p>
		<p>
			<form:label path="rating">Rating</form:label>
			<form:errors path="rating" />
			<form:input type="rating" path="rating" class="table table-hover" />
		</p>
		<p>
			<form:label path="note">Note</form:label>
			<form:errors path="note" />
			<form:textarea path="note" class="table table-hover" />
		</p>
		<input type="submit" value="Submit" class="table table-hover" />
	</form:form>
</body>
</html>