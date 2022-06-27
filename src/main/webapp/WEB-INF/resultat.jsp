<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String monResultat = (String) request.getAttribute("leResultat");
%>
<p>
    Le joueur a cliqué sur le bouton : <%= monResultat %>
</p>
<a href="/chifoumi/index.jsp">Retourner sur l'index</a>
</body>
</html>
