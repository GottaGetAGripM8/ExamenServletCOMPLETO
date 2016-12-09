<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete confirmation</title>
</head> 
<body>
		<div align="center">
			<h2>Are you sure you want to delete ${country} from the database? </h2><br>
				
			
			<div align="center">
				<a href="Index.jsp"><input type="button" value="No"></a>	
				
				<form action="letMeDeleteIt" method="post"> 
			        <div align="center"> 
			 
						<input type="hidden" value="${country}" name="countryToDelete" id="countryToDelete">
						<input type="submit" value="Yes">
			
					</div>
	 	</form>
				
					
			</div> 
			
			<br>
		</div> 
	
</body>
</html>
