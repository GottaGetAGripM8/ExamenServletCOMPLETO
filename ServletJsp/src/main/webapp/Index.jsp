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
						<td colspan="2" align="center"> <h2> FILL THE GAPS <hr></h2> </td>
					</tr>
					
					<tr>
						<td> <h3>COUNTRY:</h3></td>
						<td><input type="text" id="nameCountry" name="nameCountry" ></td>
					</tr>
					 
					<tr>
						<td><h3>INSERT A NEW LANGUAGE</h3></td>
						<td><input type="text" id="nameLanguage" name="nameLanguage"></td>
					</tr>
					 
					<tr>
						<td><h3>AVALIABLES LANGUAGES:</h3></td>
						<td>			
							<select id="AvaliableLang" name="AvaliableLang"> 
								<option> Select your language</option> 
									
									<%
										SelectFromTable sft = new SelectFromTable();	
									
										List <Language> listLanguageOptions = sft.SelectTableLanguages();
										for (Language lang : listLanguageOptions){
										   out.println("<option value ='" + lang.getNameLang() + "'>" + lang.getNameLang() + "</option>");
										}
									
									
									%>
									
							</select>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" align="center"><input type="submit" value="Send"></td>
					</tr>
					
				</table>
				
		</div>
		
		</form>
		
		<div align="center">
			<h3><a href="TableLanguages.jsp"> PRINT-OUT ALL LANGUAGES  </a></h3>
		</div>
		
	
	</body>
</html>