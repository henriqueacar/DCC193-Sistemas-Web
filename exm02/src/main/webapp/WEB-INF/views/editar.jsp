<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar</title>
</head>
<body>
    <h1>Editar</h1>
    <form action="editar.html" method="post">

        <input type="hidden" name="id" value="${batatinha.id}"/></label>
        <label>Nome: <input type="text" name="nome" value="${batatinha.nome}"/></label>
        <label>Idade: <input type="text" name="idade" value="${batatinha.idade}"/></label>
        <input type="submit">
    </form>
</body>
</html>