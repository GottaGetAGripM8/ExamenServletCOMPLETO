<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,h2.*, model.*, servlet.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<form action="firstForm" method="post"> 

		<div align="center">
		
				<table width=350>
					<tr>
						<td colspan="2" align="center"> <h2> RELLENA LOS CAMPOS <hr></h2> </td>
					</tr>
					
					<tr>
						<td> <h3>PAIS:</h3></td>
						<td><input type="text" id="Ncountry" name="Ncountry" ></td>
					</tr>
					 
					<tr>
						<td><h3>INSERTA IDIOMA</h3></td>
						<td><input type="text" id="Nlanguage" name="Nlanguage"></td>
					</tr>
					 
					<tr>
						<td><h3>IDIOMAS:</h3></td>
						<td>			
							<select id="AvaliableLang" name="AvaliableLang"> 
								<option> Selecciona un idioma </option> 
									
									<%
										SelectFromTable sft = new SelectFromTable();	
									
										List <Idioma> listLanguageOptions = sft.SelectTableIdiomas();
										for (int i=0;i<listLanguageOptions.size();i++){
										   out.println("<option value ='"+listLanguageOptions.get(i).getnomIdioma()+"'>"+listLanguageOptions.get(i).getnomIdioma()+"</option>");
										}
									
									
									%>
									
							</select>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" align="center"><input type="submit" value="Enviar"></td>
					</tr>
					
				</table>
				
		</div>
		
		</form>
		
		<div align="center">
			<h3><a href="TableUsers.jsp"> LISTADO DE IDIOMAS </a></h3>
		</div>
		
	
	</body>
</html>