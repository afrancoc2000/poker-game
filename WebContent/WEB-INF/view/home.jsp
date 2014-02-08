<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap-theme.min.css">

<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>

</head>

<body>
	
	<div class="container">
		
		<h1 style="padding: 30px 0 30px 0;">Poker game</h1>

		<div class="well">
		
		<h3> Agrega las estimaciones del equipo: </h3>
		
		<form:form method="post" modelAttribute="operador" action="estimar">
		
		<p> <label>Estimación 1: </label> <form:input class="input-small" path="operador1" value="${operador.operador1}" />
			<label>${operador1Message}</label></p>
	
		<p> <label>Estimación 2: </label> <form:input class="input-small" path="operador2" />
			<label>${operador2Message}</label></p>
	
		<p> <label>Estimación 3: </label> <form:input class="input-small" path="operador3" />
			<label>${operador3Message}</label></p>
	
		<p> <label>Estimación 4: </label> <form:input class="input-small" path="operador4" />
			<label>${operador4Message}</label></p>
	
		<p> <label>Estimación 5: </label> <form:input class="input-small" path="operador5" />
			<label>${operador5Message}</label></p>
		
		<p><input class="button btn btn-lg btn-primary" type="submit" name="submit" value="Calcular!" /></p>
		
		</form:form>
		<p> <label>Resultado: ${operador.resultado}</label></p>	
		</div>
	
	</div>
</body>
</html>