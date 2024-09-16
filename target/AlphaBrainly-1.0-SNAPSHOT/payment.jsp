<%-- 
    Document   : payment
    Created on : Mar 12, 2024, 8:52:02 AM
    Author     : Pawan Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <form action="PaymentGateway" method="post">
            <input type="number" placeholder="enter amount"><!-- comment -->
            <button type="submit">pay</button>
        </form>
    </body>
</html>
