<%-- 
    Document   : login
    Created on : 2012-10-23, 20:17:01
    Author     : moumene
--%>
<%
    if (session.getAttribute("connecte")!=null)  //déjà connecté
    {
%>
        <jsp:forward page="index.jsp" />
<%
    }
%>

<%
        if (request.getAttribute("message")!=null)
        {
            out.println("<span class=\"errorMessage\">"+request.getAttribute("message")+"</span>");
        }
        String  us1 = request.getParameter("username");
        if (us1==null) us1="";
        else us1 = us1.trim();
        %>
        <form action="login.do" method="post">
            Username : <input type="text" name="username" value="<%=us1%>" /><br />
            Password : <input type="password" name="password" />
            <input type="hidden" name="action" value="login" /><br />
            <input type="submit" value=" Connexion " />
        </form> 