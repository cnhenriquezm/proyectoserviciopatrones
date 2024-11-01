<%-- 
    Document   : ListarTodos
    Created on : 16/09/2024, 11:18:47 a. m.
    Author     : Unimagdalena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar todos</h1>
        <%
            String mensaje = (String) request.getAttribute("mensaje");
            if (mensaje != null) {
        %>
            <div class="message"><%= mensaje %></div>
        <%
            }
        %>
        
        
        <form action="Demo" method="POST">
            <input type="submit" value="listar">
            <input type="hidden" value="listar" id="ContMonitor" name="ContMonitor">
        </form>
    </body>
</html>
