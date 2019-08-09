<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>

	<%
		if (request.getParameter("username") != null && request.getParameter("password") != null) {

			if (request.getParameter("username").equals("admin")
					&& request.getParameter("password").equals("admin123")) {
	%>
	<a href="./login/authenticate">Home</a>
	<%
		} 
	
		}else {
			%>
			<form action="">
				<label for="username"> <input type="text" id="username"
					name="username" /></label> <br /> <br /> <label for="password"> <input
					type="password" id="password" name="password" /></label> <br /> <br />
				<button value="login" type="submit">Login</button>
			</form>
			<%
		}
	%>




	<%-- 	<%
	String page = "authenticate"; 
	%>
	<form action="<%= page %>">
		<label for="username"> <input type="text" id="username"
			name="username" /></label> <br /> <br /> <label for="password"> <input
			type="password" id="password" name="password" /></label> <br /> <br /> <input
			type="submit" value="Submit" />
	</form>
	<%
		if (request.getParameter("username") != null && request.getParameter("password") != null){
			
		
		if( request.getParameter("username").trim().length() > 0
				&& request.getParameter("password").trim().length() > 0) {
				if (request.getParameter("username").equals("admin")
					&& request.getParameter("password").equals("admin123")) {
	%>
	} }
	<%
		} else {
	%>
	<h3>Login Failed</h3>
	<%
		}

		}
	%> --%>
</body>
</html>


