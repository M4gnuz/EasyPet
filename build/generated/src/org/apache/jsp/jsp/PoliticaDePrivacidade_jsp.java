package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PoliticaDePrivacidade_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp/cabecalho.jsp");
    _jspx_dependants.add("/jsp/rodape.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Política de Privacidade</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/termosECondicoes.css\">    \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/rodape.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cabecalho.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"tudo\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <nav id=\"nav-principal\" class=\"navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-5\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <h3>EasyPet</h3>\n");
      out.write("            <img src=\"../ResourcesIm/logoSite.png\" width=\"88px\">\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <div class=\"btn-toolbar mb-3\" role=\"toolbar\" aria-label=\"Toolbar with button groups\">\n");
      out.write("            <div class=\"btn-group mr-2\" role=\"group\" aria-label=\"First group\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-success\">Produtos</button>\n");
      out.write("                <button type=\"button\" class=\"btn  btn-success\">Serviços</button>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      Sobre\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Quem Somos</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Termos Condições e Uso</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Privacidade</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      Contato\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Fale Conosco</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Trabalhe Conosco</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Como Pedir</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"titulo\">Política de Privacidade</h1>\n");
      out.write("            <div id=\"texto\">\n");
      out.write("                <p>\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis lacus ipsum, mattis fringilla fringilla ac, sollicitudin eu arcu. In vel sapien a diam porta suscipit quis a mi. Donec bibendum massa eros, eget ultricies ligula laoreet vitae. Fusce elementum ex enim, nec posuere libero finibus et. Maecenas id interdum leo. Mauris suscipit mi nec mattis euismod. Maecenas ac leo a sapien feugiat dapibus. Donec convallis bibendum ligula, nec iaculis eros imperdiet ac. Ut volutpat dui a urna tincidunt, porta tempor ligula hendrerit. Integer elementum risus sed lorem iaculis, id ornare ipsum rhoncus. Nulla suscipit hendrerit risus ac finibus. Ut quis dignissim nisl, a gravida lacus. Morbi sit amet nunc ac justo congue rutrum vitae ac dui. Maecenas ac dolor a dui maximus dapibus vitae ac lacus. Phasellus at lectus lectus. Sed orci justo, ullamcorper id odio non, cursus dictum dolor.\n");
      out.write("\n");
      out.write("                    id hendrerit dictum. Donec tristique lacinia tristique. Vivamus pretium dolor vel tortor auctor lacinia. Aliquam interdum tortor egestas dolor egestas faucibus. Fusce id porttitor elit. Nulla sed pretium dolor. Duis maximus sed metus quis gravida. Nullam id ipsum sodales nulla ultrices eleifend. Donec pretium in ligula non suscipit. Quisque luctus ex vel efficitur finibus.    \n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis lacus ipsum, mattis fringilla fringilla ac, sollicitudin eu arcu. In vel sapien a diam porta suscipit quis a mi. Donec bibendum massa eros, eget ultricies ligula laoreet vitae. Fusce elementum ex enim, nec posuere libero finibus et. Maecenas id interdum leo. Mauris suscipit mi nec mattis euismod. Maecenas ac leo a sapien feugiat dapibus. Donec convallis bibendum ligula, nec iaculis eros imperdiet ac. Ut volutpat dui a urna tincidunt, porta tempor ligula hendrerit. Integer elementum risus sed lorem iaculis, id ornare ipsum rhoncus. Nulla suscipit hendrerit risus ac finibus. Ut quis dignissim nisl, a gravida lacus. Morbi sit amet nunc ac justo congue rutrum vitae ac dui. Maecenas ac dolor a dui maximus dapibus vitae ac lacus. Phasellus at lectus lectus. Sed orci justo, ullamcorper id odio non, cursus dictum dolor.\n");
      out.write("\n");
      out.write("                    Etiam scelerisque it dictum. Donec tristique lacinia tristique. Vivamus pretium dolor vel tortor auctor lacinia. Aliquam interdum tortor egestas dolor egestas faucibus. Fusce id porttitor elit. Nulla sed pretium dolor. Duis maximus sed metus quis gravida. Nullam id ipsum sodales nulla ultrices eleifend. Donec pretium in ligula non suscipit. Quisque luctus ex vel efficitur finibus.\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis lacus ipsum, mattis fringilla fringilla ac, sollicitudin eu arcu. In vel sapien a diam porta suscipit quis a mi. Donec bibendum massa eros, eget ultricies ligula laoreet vitae. Fusce elementum ex enim, nec posuere libero finibus et. Maecenas id interdum leo. Mauris suscipit mi nec mattis euismod. Maecenas ac leo a sapien feugiat dapibus. Donec convallis bibendum ligula, nec iaculis eros imperdiet ac. Ut volutpat dui a urna tincidunt, porta tempor ligula hendrerit. Integer elementum risus sed lorem iaculis, id ornare ipsum rhoncus. Nulla suscipit hendrerit risus ac finibus. Ut quis dignissim nisl, a gravida lacus. Morbi sit amet nunc ac justo congue rutrum vitae ac dui. Maecenas ac dolor a dui maximus dapibus vitae ac lacus. Phasellus at lectus lectus. Sed orci justo, ullamcorper id odio non, cursus dictum dolor.\n");
      out.write("\n");
      out.write("                    Etiam scelerisque finibus eros, vel placerat urna aliquam quis. Mauris commodo faucibus arcu vitae faucibus. Nullam justo nisi, posuere sed nisl nec, rutrum luctus urna. Phasellus id placerat elit. Duis venenatis nisi sit amet mattis ornare. Nullam ornare arcu quis elit tempus blandit. Proin lectus metus, vestibulum a orci id, auctor elementum diam.\n");
      out.write("\n");
      out.write("                    Ut tristique rhoncus mi id condimentum. Proin interdum leo condimentum elit molestie consequat. Vestibulum ornare urna augue, vitae elementum nisi accumsan eu. Integer pretium et lacus vel malesuada. Aliquam viverra mauris egestas suscipit molestie. Pellentesque non semper purus, eget fringilla lectus. Mauris ornare feugiat risus, in bibendum lacus accumsan et. Vivamus eros magna, scelerisque vel libero sed, sodales lobortis felis. Curabitur tristique metus eros, a maximus est rhoncus molestie. Phasellus vestibulum, enim a cursus suscipit, leo augue maximus massa, eu fringilla enim dolor id ante. Aliquam iaculis neque mi, vel suscipit orci ultricies eget. Sed a lacus eros. Proin a auctor urna, eu pellentesque neque.\n");
      out.write("\n");
      out.write("                    Mauris sollicitudin consectetur urna ac egestas. Aliquam auctor bibendum mauris, nec varius nibh suscipit non. Nullam gravida ac lacus at viverra. Vivamus ornare leo sit amet purus fringilla mattis. Pellentesque in sapien ac tellus rhoncus sollicitudin. Sed sit amet metus sit amet elit vulputate interdum. Suspendisse egestas mi eu purus semper, sed imperdiet ante imperdiet. Curabitur et mattis ante, elementum sollicitudin dui. Integer et lectus luctus, imperdiet risus at, imperdiet sem. Suspendisse pharetra nisl nec sodales iaculis. Cras hendrerit dictum quam, et viverra erat consequat in. Vestibulum fringilla congue metus, a eleifend magna volutpat in. In sem enim, posuere hendrerit commodo id, posuere non urna. In in libero porta risus tempus euismod ut ac urna.\n");
      out.write("\n");
      out.write("                    Vivamus aliquam erat id hendrerit dictum. Donec tristique lacinia tristique. Vivamus pretium dolor vel tortor auctor lacinia. Aliquam interdum tortor egestas dolor egestas faucibus. Fusce id porttitor elit. Nulla sed pretium dolor. Duis maximus sed metus quis gravida. Nullam id ipsum sodales nulla ultrices eleifend. Donec pretium in ligula non suscipit. Quisque luctus ex vel efficitur finibus.\n");
      out.write("                </p>\n");
      out.write("                <p>                  \n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis lacus ipsum, mattis fringilla fringilla ac, sollicitudin eu arcu. In vel sapien a diam porta suscipit quis a mi. Donec bibendum massa eros, eget ultricies ligula laoreet vitae. Fusce elementum ex enim, nec posuere libero finibus et. Maecenas id interdum leo. Mauris suscipit mi nec mattis euismod. Maecenas ac leo a sapien feugiat dapibus. Donec convallis bibendum ligula, nec iaculis eros imperdiet ac. Ut volutpat dui a urna tincidunt, porta tempor ligula hendrerit. Integer elementum risus sed lorem iaculis, id ornare ipsum rhoncus. Nulla suscipit hendrerit risus ac finibus. Ut quis dignissim nisl, a gravida lacus. Morbi sit amet nunc ac justo congue rutrum vitae ac dui. Maecenas ac dolor a dui maximus dapibus vitae ac lacus. Phasellus at lectus lectus. Sed orci justo, ullamcorper id odio non, cursus dictum dolor.\n");
      out.write("\n");
      out.write("                    Etiam scelerisque finibus eros, vel placerat urna aliquam quis. Mauris commodo faucibus arcu vitae faucibus. Nullam justo nisi, posuere sed nisl nec, rutrum luctus urna. Phasellus id placerat elit. Duis venenatis nisi sit amet mattis ornare. Nullam ornare arcu quis elit tempus blandit. Proin lectus metus, vestibulum a orci id, auctor elementum diam.\n");
      out.write("\n");
      out.write("                    Ut tristique rhoncus mi id condimentum. Proin interdum leo condimentum elit molestie consequat. Vestibulum ornare urna augue, vitae elementum nisi accumsan eu. Integer pretium et lacus vel malesuada. Aliquam viverra mauris egestas suscipit molestie. Pellentesque non semper purus, eget fringilla lectus. Mauris ornare feugiat risus, in bibendum lacus accumsan et. Vivamus eros magna, scelerisque vel libero sed, sodales lobortis felis. Curabitur tristique metus eros, a maximus est rhoncus molestie. Phasellus vestibulum, enim a cursus suscipit, leo augue maximus massa, eu fringilla enim dolor id ante. Aliquam iaculis neque mi, vel suscipit orci ultricies eget. Sed a lacus eros. Proin a auctor urna, eu pellentesque neque.\n");
      out.write("\n");
      out.write("                    Mauris sollicitudin consectetur urna ac egestas. Aliquam auctor bibendum mauris, nec varius nibh suscipit non. Nullam gravida ac lacus at viverra. Vivamus ornare leo sit amet purus fringilla mattis. Pellentesque in sapien ac tellus rhoncus sollicitudin. Sed sit amet metus sit amet elit vulputate interdum. Suspendisse egestas mi eu purus semper, sed imperdiet ante imperdiet. Curabitur et mattis ante, elementum sollicitudin dui. Integer et lectus luctus, imperdiet risus at, imperdiet sem. Suspendisse pharetra nisl nec sodales iaculis. Cras hendrerit dictum quam, et viverra erat consequat in. Vestibulum fringilla congue metus, a eleifend magna volutpat in. In sem enim, posuere hendrerit commodo id, posuere non urna. In in libero porta risus tempus euismod ut ac urna.\n");
      out.write("\n");
      out.write("                    Vivamus aliquam erat id hendrerit dictum. Donec tristique lacinia tristique. Vivamus pretium dolor vel tortor auctor lacinia. Aliquam interdum tortor egestas dolor egestas faucibus. Fusce id porttitor elit. Nulla sed pretium dolor. Duis maximus sed metus quis gravida. Nullam id ipsum sodales nulla ultrices eleifend. Donec pretium in ligula non suscipit. Quisque luctus ex vel efficitur finibus.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- <title>JSP Page</title>-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"rod1\">\n");
      out.write("                    <label>\n");
      out.write("                        <a link href=\"\">Politica de Privacidade</a>\n");
      out.write("                    </label>\n");
      out.write("                    <br>\n");
      out.write("                    <label>\n");
      out.write("                        <a link href=\"\">Termos de Uso</a>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <span style=\"font-size: 40px; \">\n");
      out.write("                    <i class=\"fab fa-instagram\"></i>\n");
      out.write("                    <i class=\"fab fa-facebook-square\"></i>\n");
      out.write("                    <i class=\"fab fa-twitter-square\"></i>\n");
      out.write("\n");
      out.write("                </span>\n");
      out.write("\n");
      out.write("                <div id=\"rod2\">\n");
      out.write("                    <label>\n");
      out.write("                        EasyPet Todos os direitos reservados\n");
      out.write("                    </label>\n");
      out.write("                    <br>\n");
      out.write("                    <label>\n");
      out.write("                        CNPJ: 32.52.865/0001-75\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
