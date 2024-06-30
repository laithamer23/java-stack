<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table>>
      <tr>
            <th>ID</th>
            <th>Title</th>
            <th>description</th>
            <th>Language</th>
            <th>Number of Pages</th>
            
        </tr>
          <c:forEach var="book" items="${books}">
       <tr>
        <td><c:out value="${book.id}"></c:out></td>
        <td><c:out value="${book.title}"></c:out></p>
        <td><c:out value="${book.description}"></c:out></td>
        <td><c:out value="${book.language}"></c:out></td>
        <td><c:out value="${book.numberOfPages}"></c:out></td>
    </c:forEach>
	 </tr>
	 </table>
      
</body>
</html>