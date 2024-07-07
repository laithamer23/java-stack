<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<h1>Send an Omikuji!</h1>
	<form action="/omikuji" method="POST">
		<label for="number">Select number</label>
		<input type="number" min="5" max="25" name="number"><br>
		<label for="city">Enter the name of any city</label>
		<input type="text" name="city"><br>
		<label for="personName">Enter the name of any real person</label>
		<input type="text" name="personName"><br>
		<label for="hobby">Enter professional endeavor or hobby:</label>
		<input type="text" name="hobby"><br>
		<label for="thing">Enter any type of living thing.</label>
		<input type="text" name="thing"><br>
		<label for="say">Say something nice to someone</label><br>
		<textarea  name="say" ></textarea><br>
		<h2>Send and show a friend</h2>
		<input type="submit" value="send">
	</form>


</body>
</html>