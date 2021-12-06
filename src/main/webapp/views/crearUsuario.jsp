<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
  <link rel="stylesheet" href="./css/formularios.css"/>
</head>

<div>

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
          <a class="dropdown-item" href="ActualizaCapacitacion">Crear Capacitacion</a>
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
          <a class="dropdown-item" href="CrearCliente">Crear Cliente</a>
          <a class="dropdown-item" href="ListarCliente">Listar Cliente</a>
          <a class="dropdown-item" href="CrearAdministrativo">Crear Administrador</a>
          <a class="dropdown-item" href="ListarAdministrativo">Listar Administrativo</a>
          <a class="dropdown-item" href="CrearProfesional">Crear Profesional</a>
          <a class="dropdown-item" href="ListarProfesional">Listar Profesional</a>
        </div>
      <li class="nav-item active">
        <a class="nav-link" href="Contacto">Contacto<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Login">Login</a>
      </li>

    </ul>
  </div>
</nav>
  <div class="container">
<form action="CrearUsuario" method="post">

  <div class="form-group">
    <label for="formGroupExampleInput">RUN</label>
    <input type="number" name="run" class="form-control" id="formGroupExampleInput" placeholder="Ingrese un run sin digito verificador">
  </div>
    <div class="form-group">
    <label for="formGroupExampleInput2">Nombre</label>
    <input type="text" name="nombre" class="form-control" id="formGroupExampleInput2" placeholder="Ingrese su nombre">
  </div>
    <div class="form-group">
    <label for="formGroupExampleInput3">Fecha de nacimiento</label>
    <input type="text" name="fechaNac" class="form-control" id="formGroupExampleInput3" placeholder="AA/MM/DD">
  </div>


  <div class="form-group">
    <label for="formGroupExampleInput4">tipo de usuario</label>
    <input type="text" name="tipo" class="form-control" id="formGroupExampleInput4" placeholder="Administrador, CLiente o Profesional">

<!--
    <div class="dropdown">
        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
            Tipo de usuario
        </button>
        <ul class="dropdown-menu"  aria-labelledby="dropdownMenuButton1">
            <li><a class="dropdown-item" value="tipo">Administrativo</a></li>
            <li><a class="dropdown-item" value="tipo">Cliente</a></li>
            <li><a class="dropdown-item" >Profesional</a></li>
        </ul>
    </div>

    -->


    <button type="submit" name="submit" class="btn btn-primary">Crear Usuario</button>
  </div>
</form>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>