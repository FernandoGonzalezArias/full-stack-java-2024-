<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.curso04.login.mvc.modelo.Cliente" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenida</title>
<link rel="stylesheet" href="css/bienvenida.css">
</head>
<body>
  
           <div class="container">
        <h3>Lista de clientes usando jstl</h3>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Dirección</th>
                </tr>
            </thead>
            <tbody>
            
                <c:forEach var="cliente" items="${clientes}">
                    <tr>
                        <td><c:out value="${cliente.nombre}"/></td>
                        <td><c:out value="${cliente.apellido}"/></td>
                        <td><c:out value="${cliente.direccion}"/></td>
                    </tr>
                </c:forEach>
                
               
            </tbody>
        </table>
        
        <br>
        <a href="login.jsp" class="btn">Cerras sesion</a>
        
    </div>
        
   

</body>
</html>