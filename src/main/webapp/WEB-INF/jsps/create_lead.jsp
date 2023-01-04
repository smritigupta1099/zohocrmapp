<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
	<h2>New Lead</h2>
	<form action="saveLead" method="post">
	<pre>
		FirstName<input type="text" name="firstName" />
		 LastName<input type="text" name="lastName" /> 
		 Email<input type="text" name="email" />
		Mobile<input type="text" name="mobile" />
		  source:
		  <select name="source" >
		  <option value="Newspaper">Newspaper</option>
		  <option value="Online">Online</option>
		  <option value="Webinar">Webinar</option>
		  <option value="Radio">Radio</option>
		</select>
		<input type="submit" value="save"/>
	</pre>
	
	</form>
</body>
</html>