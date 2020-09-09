<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback</title>
</head>
<body>
	<c:if test="${colors == null}">
		<h1>You selected no colors!</h1>
	</c:if>

	<c:if test="${colors != null}">
		<h1>You selected the following colors: </h1>
		<ul>
			<c:forEach var="color" items="${colors}">
				<li>${color}</li>
			</c:forEach>
		</ul>
	</c:if>

	<p>
		Torna <a href="/mdwa/s21/choice.html"> indietro</a>
	</p>
</body>
</html>