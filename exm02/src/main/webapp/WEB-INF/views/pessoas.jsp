<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pessoas</title>
</head>
<body>
    <h1>Lista de Pessoas</h1>
    <ul>
        <c:forEach var="pessoa" items ="${pessoas}">
            <li>[${pessoa.id}] ${pessoa.nome} (${pessoa.idade})<a href="excluir.html?id=${pessoa.id}&name=${pessoa.nome}">[Excluir]</a> <a href="editar.html?id=${pessoa.id}">[Editar]</a></li>
        </c:forEach>
    </ul>
</body>
</html>