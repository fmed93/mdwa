<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logged: a little game</title>
</head>
<body>
	<!-- username -->
	<h1>Hello <span id="user">${user}</span>!</h1>
	<h1>Try to guess the combination...</h1>

	<form action="/mdwa/s15/guess" method="post">
		<label for="first">First:</label>
		<select name="first">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		
		<label for="second">Second:</label>
		<select name="second">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		
		<label for="third">Third:</label>
		<select name="third">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		
		<button>Guess...</button>
	</form>
	
	<h4>Torna <a href="/mdwa/s15/login.html"> indietro</a></h4>
</body>
</html>