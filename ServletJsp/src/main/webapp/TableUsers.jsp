<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,h2.*, model.*, servlet.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Language's table</title>
</head>
<body>

<table align="center">
		<tr>
				
			<td colspan="4" align="center"> <h2> LANGUAGES IN OUR DATABASE  <hr></h2> </td>
				
		</tr>
</table>
<table align="center" border="2" width=350>
		
		<thead>
			
			
			<tr> 
			
				<td align="center">Language</td>
				
				<td align="center">Country</td>
				
				<td align="center">ACTION</td>
				
			</tr>
			
		</thead> 
		
		<tbody>
		
			<c:forEach var="country" items="${listAllCountries}">
			
				<tr>
				
					<td align="center"><c:out value="${country.nomIdioma}"/> </td>
					
					<td align="center"><c:out value="${country.nomPais}"/> </td>
					
					
					<td align="center"><a name="country" href="letMeDeleteIt?country=${country.nomPais}">DELETE</a></td>
					
		    	</tr>
		    	
			</c:forEach>
			
		</tbody> 
		
	</table>
		
		<form method="post" action="showMeData">	
			
			<center>
				
				<input type="submit"  value="Show">
				
				<a href="Index.jsp"><input type="button" value="Come back to Index"></a>
			
			</center>
		
		</form>	
		
	
</body>
</html>