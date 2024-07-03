<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<th>
		<td>name</td>
		<td>price</td>
		</th>
		<c:forEach var="fruit" items="${allfruits}">

			<tr>
				<td><c:out value="${fruit.name}"></c:out></td>
				<td><c:out value="${fruit.price}"></c:out></td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>


