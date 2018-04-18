<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="<c:url value="/resources/static/css/bootstrap.min.css" />" rel="stylesheet"></link>
		<title>Álbum de Fotos - Spring MVC Upload</title>
	</head>
	<body>
		<div class="container">
			<h1>Spring MVC Upload</h1>
			<h4>Álbum de Fotos</h4>
			<hr />
			<div class="col-6">
		        <h4>Detalhes</h4>
		        Nome: ${album.nome}<br/>
		        Descrição: ${album.descricao}<br/>
		        <p>Fotos recebidas:</p>
		        <ul class="list-group">
			        <c:forEach items="${album.fotos}" var="image">
			            <li class="list-group-item">${image.originalFilename}</li>
			        </c:forEach>
		        </ul>
		        <p><a href="/springmvcupload/photoAlbum">Enviar outro álbum</a></p>
		     </div>
			<hr />
			<a href="/springmvcupload/">Voltar a página inicial</a>
		</div>
		<script src="<c:url value="/resources/static/js/jquery-3.2.1.slim.min.js" />" type="text/javascript"></script>
		<script src="<c:url value="/resources/static/js/popper.min.js" />" type="text/javascript"></script>
		<script src="<c:url value="/resources/static/js/bootstrap.min.js" />" type="text/javascript"></script>
	</body>
</html>