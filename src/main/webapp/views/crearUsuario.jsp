<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
    <div class="dropdown">
        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" name="tipo" data-bs-toggle="dropdown" aria-expanded="false">
            Tipo de usuario
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
            <li><a class="dropdown-item" >Administrativo</a></li>
            <li><a class="dropdown-item" >Cliente</a></li>
            <li><a class="dropdown-item" >Profesional</a></li>
        </ul>
    </div>

    <button type="submit" name="submit" class="btn btn-primary">Crear Usuario</button>
</form>
  </div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>