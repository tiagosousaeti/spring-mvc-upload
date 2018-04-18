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
				<form:form modelAttribute="album" action="savePhotoAlbum" method="post" enctype="multipart/form-data">
					<div class="form-group">
	                   <label for="nome">Nome do álbum: </label>
	                   <form:input id="nome" path="nome" cssErrorClass="error" class="form-control" />
	                   <form:errors path="nome" cssClass="error" />
	                </div>
		            <div class="form-group">
	                    <label for="descricao">Descrição: </label>
	                    <form:input id="descricao" path="descricao" class="form-control" />
		            </div>
		            <div class="form-group">
	                    <label for="fotos">Fotos: </label>
	                    <input type="file" name="fotos" multiple="multiple" class="form-control" />
		            </div>
		            <div class="form-group">
	                    <input id="submit" type="submit" value="Enviar" class="btn btn-primary" />
	                    <input id="reset" type="reset" value="Limpar" class="btn btn-warning text-white" />
		            </div>
		        </form:form>
		     </div>
			<hr />
			<a href="/springmvcupload/">Voltar a página inicial</a>
		</div>
		<script src="<c:url value="/resources/static/js/jquery-3.2.1.slim.min.js" />" type="text/javascript"></script>
		<script src="<c:url value="/resources/static/js/popper.min.js" />" type="text/javascript"></script>
		<script src="<c:url value="/resources/static/js/bootstrap.min.js" />" type="text/javascript"></script>
	</body>
</html>