package org.apache.jsp.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(".tic-tac-toe\n");
      out.write("  - for (var turn = 1; turn <= 9; turn++)\n");
      out.write("    - for (var row = 1; row <= 3; row++)\n");
      out.write("      - for (var column = 1; column <= 3; column++)\n");
      out.write("        - var player = \"1\"\n");
      out.write("        - var positionHorizontal = \"\"\n");
      out.write("        - var positionVertical = \"\"\n");
      out.write("        - var positionDiagonal = \"\"\n");
      out.write("        \n");
      out.write("        if( turn % 2 == 0 )\n");
      out.write("          - var player = \"2\"\n");
      out.write("          \n");
      out.write("        if( column == 1 )\n");
      out.write("          - var positionHorizontal = \" left first-column\"\n");
      out.write("        else if( column == 2 )\n");
      out.write("          - var positionHorizontal = \" middle second-column\"\n");
      out.write("        else if( column == 3 )\n");
      out.write("          - var positionHorizontal = \" right third-column\"\n");
      out.write("         \n");
      out.write("        if( row == 1 )\n");
      out.write("          - var positionVertical = \" top first-row\"\n");
      out.write("        else if( row == 2 )\n");
      out.write("          - var positionVertical = \" center second-row\"\n");
      out.write("        else if( row == 3 )\n");
      out.write("          - var positionVertical = \" bottom third-row\"\n");
      out.write("        \n");
      out.write("        if( row == 1 && column == 1 )\n");
      out.write("          - var positionDiagonal = \" first-diagonal\"\n");
      out.write("        else if( row == 1 && column == 3 )\n");
      out.write("          - var positionDiagonal = \" second-diagonal\"\n");
      out.write("        else if( row == 2 && column == 2 )\n");
      out.write("          - var positionDiagonal = \" first-diagonal second-diagonal\"\n");
      out.write("        else if( row == 3 && column == 1 )\n");
      out.write("          - var positionDiagonal = \" second-diagonal\"\n");
      out.write("        else if( row == 3 && column == 3 )\n");
      out.write("          - var positionDiagonal = \" first-diagonal\"\n");
      out.write("        \n");
      out.write("        input(id=\"block\" + turn + \"-\" + row + \"-\" + column type=\"radio\" class=\"player-\" + player + positionHorizontal + positionVertical + positionDiagonal + \" turn-\" + turn)\n");
      out.write("        label(for=\"block\" + turn + \"-\" + row + \"-\" + column class=\"turn-\" + turn)\n");
      out.write("\n");
      out.write("  .end\n");
      out.write("    h3\n");
      out.write("    a(href=\"\") Restart\n");
      out.write("    \n");
      out.write("h5 Note: use the Full Page view for the best experience.");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
