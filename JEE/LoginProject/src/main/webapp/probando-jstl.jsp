<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PROBRANDO JSTL</title>
</head>
<body>

          <h1>pruebas con jstl</h1>
          
          <h3>Uso de la etiqueta Jstl c:out</h3>
          <c:set var="mensaje" value="Saludos con jstl"/> <!-- asi es la variable -->
          <c:out value="${mensaje}"/>                     <!--  aca mostramos el valor de la variable -->
          
          <h3>Uso de la etiqueta c:if</h3>
          <c:set var="edad" value="25"/>
          <c:if test="${edad > 18}">
               <h5>Persona mayor de edad</h5>
          </c:if>
          
          <c:choose>
		  <c:when test="${edad > 18}">
			hola eres mayor de edad
		  </c:when>
		  <c:otherwise>
			hola eres menor de edad
		  </c:otherwise>
	      </c:choose>
	
	      <h3>Probando una suma de valores</h3>
	      <c:set var="num1" value="2"/>
	      <c:set var="num2" value="2"/>
	      <c:out value="${num1 + num2}"/>
</body>
</html>