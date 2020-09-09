<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>You won!</title>
</head>
<body>
	<h1> Congratulations ${user}!! You won!!</h1>
	<br>
	<h1> The exact combination was: ${first}, ${second}, ${third}</h1>
	<%
        session.invalidate();
	%>
	<p>
		Go back to the <a href="/mdwa/s15/login.html"> login page </a> if you want to play again
	<p>
</body>
</html>