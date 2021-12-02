<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="cl.awakelab.sprintgrupal2.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Usuario</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/formularios.css"/>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="Inicio">Inicio</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLinkCapacitacion" role="button" data-toggle="dropdown" aria-expanded="false">
					Capacitacion
				</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLinkCapacitacion">
					<a class="dropdown-item" href="CrearCapacitacion">Crear Capacitacion</a>
					<a class="dropdown-item" href="ListarCapacitacion">Listar Capacitacion</a>
				</div>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLinkUsuario" role="button" data-toggle="dropdown" aria-expanded="false">
					Usuario
				</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLinkUsuario">
					<a class="dropdown-item" href="CrearUsuario">Crear Usuario</a>
					<a class="dropdown-item" href="ListarUsuario">Listar Usuario</a>
				</div>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLinkTipo" role="button" data-toggle="dropdown" aria-expanded="false">
					Tipo de usuario
				</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLinkTipo">
					<a class="dropdown-item" href="CrearCliente">Cliente</a>
					<a class="dropdown-item" href="CrearAdministrativo">Administrador</a>
					<a class="dropdown-item" href="CrearProfesional">Profesional</a>
				</div>
			<li class="nav-item active">
				<a class="nav-link" href="Contacto">Contacto<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="Login">Login</a>
			</li>


	<section>

		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>Run</th>
					<th>Nombre</th>
					<th>Fecha nacimiento</th>
					<th>Tipo</th>
				
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${user}">
					<tr>
						<td><c:out value="${u.getRun()}"></c:out></td>
						<td><c:out value="${u.getNombre()}"></c:out></td>
						<td><c:out value="${u.getFechaNac()}"></c:out></td>
						<td><c:out value="${u.getTipo()}"></c:out></td>
					</tr>

				</c:forEach>
			</tbody>

		</table>

	</section>

			<form action="ListarUsuario" method="post">

			<div class="form-group">
				<label for="formGroupExampleInput">Ingrese RUN a eliminar</label>
				<input type="number" name="run" class="form-control" id="formGroupExampleInput" placeholder="Ingrese un ID">
			</div>

			<button type="submit" name="submit" class="btn btn-primary">Eliminar Usuario</button>
			</form>



	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js"
		integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2"
		crossorigin="anonymous"></script>
</body>
</html>