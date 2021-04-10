<%-- 
    Document   : bhaskara
    Created on : 05/04/2021, 11:19:03
    Author     : limae
--%>
<%@page import="br.uninove.bhaskara.Bhaskara"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de Bhaskara - JSP</title>
    </head>
    <body>
        <!--Implementar...-->
        <%
            int a, b, c;
            a = Integer.parseInt(request.getParameter("valorA"));
            b = Integer.parseInt(request.getParameter("valorB"));
            c = Integer.parseInt(request.getParameter("valorC"));
            
           Bhaskara bhaskara = new Bhaskara();
           bhaskara.setA(a);
           bhaskara.setB(b);
           bhaskara.setC(c);
        %>
        <h1>Calculadora de Bhaskara - JSP</h1>
        <hr>
        <br>
        <h2>Dados informados:</h2>
        <p><strong>Valor A: </strong><%= bhaskara.getA() %></p>
        <p><strong>Valor B: </strong><%= bhaskara.getB() %></p>
        <p><strong>Valor C: </strong><%= bhaskara.getC() %></p>
        <br>
        <p><strong>Delta: </strong><%= String.format("%.02f",bhaskara.calcularDelta())%></p>
        <p><strong>X': </strong><%= String.format("%.02f",bhaskara.calcularX1())%></p>
        <p><strong>X'': </strong><%= String.format("%.02f",bhaskara.calcularX2())%></p>
        <br>
        <a href="index.html">Calcular Novamente</a>
    </body>
</html>
