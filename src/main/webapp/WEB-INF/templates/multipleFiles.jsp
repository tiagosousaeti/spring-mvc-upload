<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="<c:url value="/resources/static/css/bootstrap.min.css" />" rel="stylesheet"></link>
		<title>Vários Arquivos - Spring MVC Upload</title>
	</head>
	<body>
		<div class="container">
			<h1>Spring MVC Upload</h1>
			<h4>Vários Arquivos</h4>
			<hr />
			<form method="post" enctype="multipart/form-data" action="multiplefiles">
				Arquivo 1: <input type="file" name="arquivos"> <br/>
				Arquivo 2: <input type="file" name="arquivos"> <br/>
				Arquivo 3: <input type="file" name="arquivos"> <br/>
				Arquivo 4: <input type="file" name="arquivos"> <br/>
				<br /><br /><input type="submit" value="Enviar" /> 
			</form>
			<hr />
			<a href="/springmvcupload/">Voltar a página inicial</a>
		</div>
		<script src="<c:url value="/resources/static/js/jquery-3.2.1.slim.min.js" />" type="text/javascript"></script>
		<script src="<c:url value="/resources/static/js/popper.min.js" />" type="text/javascript"></script>
		<script src="<c:url value="/resources/static/js/bootstrap.min.js" />" type="text/javascript"></script>
	</body>
</html>