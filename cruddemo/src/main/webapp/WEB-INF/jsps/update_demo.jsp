<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h2>update Demo</h2>
<form action="updateDemo" method="post">
<pre>

<input type="hidden" name ="id" value="${demo.id}"/>
First Name<input type="text" name="firstName" value="${demo.firstName}"/>
Last Name<input type="text" name="lastName" value="${demo.lastName}"/>
Email<input type="text" name="email" value="${demo.email}"/>
Mobile<input type="text" name="mobile" value="${demo.mobile}"/>
<input type="submit" value="update"/>
</pre>
</form>
${msg}
</body>
</html>