<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math table</title>
</head>
<body>
	<h1>Math Table Demo</h1>
	<form action="">
		<label> <input type="text" name="num" /><br>
			<button type="submit">Submit</button></label>
	</form>
	<br />
	<br />
	<%
	if (request.getParameter("num")!=null){
	int n=Integer.parseInt(request.getParameter("num"));
	if(n!=0) {%>
	<h3>
		Math Table of
		<%= n %></h3>
	<% for(int i=1;i<=10;++i) {%>
	<%= n %> * <%= i %> = <%= n*i %> <br/>
	<%}  } } %>
</body>
</html>