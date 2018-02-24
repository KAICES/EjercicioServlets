<%-- 
    Document   : index
    Created on : 23/02/2018, 06:44:29 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Taller</title>
    </head>
    <body>
        <h1>TALLER SERVLET</h1>
        <form action="ServletEjercicio" method="POST">
            Nombre:<br>
            <input type ="text" name="nombre"></input><br>
            <br>
            Fecha de nacimiento:<br>
            <input type ="date" name="fechaNac"></input><br>
            <br>
            <input type="submit"/>            
        </form>
    </body>
</html>
