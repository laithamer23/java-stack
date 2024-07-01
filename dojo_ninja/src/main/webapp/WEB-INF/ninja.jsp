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
    <meta charset="UTF-8">
    <title>Ninja</title>
    <link rel="stylesheet" href="/css/main.css">
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<form:form action="/createninja" method="post" modelAttribute="ninja">
<form:label path="dojo">Dojo: </form:label>
    <form:select path="dojo">
        <c:forEach  var="one" items="${alldojos}">
         
            <form:option value="${one.id}" path="person">
            
                <c:out value="${one.name}"/>
            </form:option>
        </c:forEach>
    </form:select>
    
    <form:label path="fname">First Name: </form:label>
    <form:input path="fname"/>
    
    <form:label path="lname">Last Name: </form:label>
    <form:input path="lname"/>
    
    <form:label path="dojolocation">location </form:label>
    <form:input path="dojolocation"/>
    
    <form:label path="age">Age: </form:label>
    <form:input type="number" path="age"/>
    
    <form:button>Submit</form:button>
    </form:form>

</body>
</html>