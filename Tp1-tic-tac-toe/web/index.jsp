<%-- 
    Document   : index
    Created on : 2012-10-23, 20:17:01
    Author     : moumene
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Tic Tac Toe</title>
        <link rel="stylesheet" type="text/css" href="./style/style.css">
    </head>
    <body>
    <jsp:include page="banniere.jsp" />

<%        
        if (session.getAttribute("connecte")!=null){
            out.println("<p class=\"resultat\">"+session.getAttribute("connecte")+", vous êtes connectés. "+
                        "<a href=\"logout.do?action=logout\">déconnexion</a></p>");
%>
            <jsp:include page="./main.jsp" />
<%            
        }
        else 
        {
            out.println("<p> vous n'etes pas connecté et votre session est :"+application.getAttribute("nbConnectes")+"</p>" );

%>
            <jsp:include page="./login.jsp" />
<%    
        }
%>
  
  </div
            <jsp:include page="footer.jsp" />
  </div>  
  </body>  
</html>
