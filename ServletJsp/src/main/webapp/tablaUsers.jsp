<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,servletpackage.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostrar</title>
</head>
<body>

<table align="center">
		<tr>
				
			<td colspan="4" align="center"> <h2> USUARIOS DE LA BASE DE DATOS  <hr></h2> </td>
				
		</tr>
</table>
<table align="center" border="2" width=350>
		
		<thead>
			
			
			<tr> 
			
				<td align="center">Idioma</td>
				
				<td align="center">Pais</td>
				
				<td align="center">ACCION</td>
				
			</tr>
			
		</thead>
		
		<tbody>
		
			<c:forEach var="user1" items="${listAllUsers}">
			
				<tr>
				
					<td align="center"><c:out value="${user1.nomIdioma}"/> </td>
					
					<td align="center"><c:out value="${user1.nomPais}"/> </td>
					
					
					<td align="center"><a name="user" href="Hola?user=${user1.nomPais}">ELIMINAR</a></td>
					
		    	</tr>
		    	
			</c:forEach>
			
		</tbody>
		
	</table>
		
		<form method="post" action="muestra">	
			
			<center>
				
				<input type="submit"  value="Mostrar">
				
				<a href="datos.jsp"><input type="button" value="Volver al formulario"></a>
			
			</center>
		
		</form>	
		
	
</body>
</html>