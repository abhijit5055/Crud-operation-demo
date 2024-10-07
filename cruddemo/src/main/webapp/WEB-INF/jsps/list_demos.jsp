<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>demos</title>
</head>
<body>
     <table>
     
     <tr>
          
          <th>FirstName</th>
          <th>LastName</th>
          <th>Email</th>
          <th>Mobile</th>
          <th>Action</th>
     </tr>
     
     <c:forEach var="demo" items="${demos}">
     <tr>
      
          <td>${demo.firstName}</td>
           <td>${demo.lastName}</td>
      <td>${demo.email}</td>
       <td>${demo.mobile}</td>
     <td><a href="delete?id=${demo.id}">delete</a></td>
          <td><a href="update?id=${demo.id}">update</a></td>
     </tr>
     
     </c:forEach>
     
     </table>
</body>
</html>