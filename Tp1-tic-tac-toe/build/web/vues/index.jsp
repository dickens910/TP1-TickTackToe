<%-- 
    Document   : index
    Created on : 2013-06-05, 19:56:35
    Author     : Usager
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/style.css" type="text/css" />
    </head>
    <body>
        <div id="all">
            <jsp:include page="banniere.jsp" />
            <jsp:include page="menu.jsp" />
            <div id="centre">
                <h1>Vous êtes à la page 1</h1>
            </div>
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>
