<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head> 
<body>

		<div align="center">
		
				<table width=350>
					<tr>
						<td colspan="2" align="center"> <h2> DATOS INSERTADOS <hr></h2> </td>
					</tr>
					
					<tr>
						<td><h3>Pais:</h3></td>
						<td id="country" name="country"><h3>${country}</h3></td>
					</tr>
					 
					<tr>
						<td><h3>Idioma:</h3></td>
						<td id="language" name="language"><h3>${language} </h3></td>
					</tr>
					 
					<tr>
						<td><h3>Nuevo Idioma:</h3></td>
						<td id="newLanguage" name="newLanguage"><h3>${newLanguage}</h3></td>
					</tr>
					
				</table>
				
		</div>
		
		<div align="center">
			<a href="datos.jsp"><input type="button" value="Volver al formulario"></a>		
		</div>
		
		<br>
		
		<form action="HolaBA" method="post"> 
	        <div align="center"> 
	 
				<input type="hidden" value="${country}" name="nomB" id="nomB">
				<input type="submit" value="Borrar datos">
	
			</div>
	 	</form>
 	
</body>
</html>
