<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <h3>Lista de clientes</h3>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Dirección</th>
                </tr>
            </thead>
            <tbody>
                <% 
                List<Cliente> lstClientes = (List<Cliente>) request.getAttribute("clientes");
                for(Cliente cliente : lstClientes){
                %>
                <tr>
                    <td><%= cliente.getNombre() %></td>
                    <td><%= cliente.getApellido() %></td>
                    <td><%= cliente.getDireccion() %></td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
        <br>
        <a href="login.jsp" class="btn">Cerras sesion</a>
        
    </div>
        
   

</body>
</html>