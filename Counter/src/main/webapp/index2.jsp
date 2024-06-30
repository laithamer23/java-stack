<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
<title>Current Visit Count</title>
</head>
<body>
<p>You Have Visited http<c:out value="${counter}"/>Items.</p>
<p><a href='/'>Test another visited</a></p>
</body>
</html>