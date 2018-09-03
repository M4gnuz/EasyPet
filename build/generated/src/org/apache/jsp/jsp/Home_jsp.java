package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/home.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/rodape.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cabecalho.css\">  \n");
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
      out.write("        <div id=\"carouselExampleFade\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-100 teste\" src=\"../ResourcesIm/banho.png\" alt=\"First slide\">\n");
      out.write("                    <div class=\"carousel-caption \">\n");
      out.write("                        <h1 class=\"letra\">Cuidados para seu Pet</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100 teste\" src=\"../ResourcesIm/software-de-gestao.jpg\" alt=\"Second slide\">\n");
      out.write("                    <div class=\"carousel-caption \">\n");
      out.write("                        <h1 class=\"letra3\">Plataforma Completa para Logista </h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100 teste\" src=\"../ResourcesIm/dog-oculos.jpg\" alt=\"Third slide\">\n");
      out.write("                    <div class=\"carousel-caption \">\n");
      out.write("                        <h1 class=\"letra3\">Acessórios Para seu Pet</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100 teste\" src=\"../ResourcesIm/logo6.jpg\" alt=\"Four slide\">\n");
      out.write("                    <div class=\"carousel-caption \">\n");
      out.write("                        <h1 class=\"letra2\">Entrega Rapida e Pratica</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100 teste\" src=\"../ResourcesIm/logo4.jpg\" alt=\"Third slide\">\n");
      out.write("                    <div class=\"carousel-caption \">\n");
      out.write("                        <h1 class=\"letra\">Produtos Para seu Pet</h1>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <h1 id=\"homeT\"> Delivery e Cuidados para seu Animalzinho, <br>\n");
      out.write("                <span> agora mais proximo de você!</span></h1>\n");
      out.write("\n");
      out.write("            <div class=\"input-group  col-xs-12 col-sm-6 col-md-6\" id=\"pesquisa\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Digite seu CEP para buscar as Lojas mais perto de você\" aria-label=\"Recipient's username\" aria-describedby=\"basic-addon2\">\n");
      out.write("                <div class=\"input-group-append\">\n");
      out.write("                    <button class=\"btn btn-success\" type=\"button\">Buscar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\"> \n");
      out.write("            <div class=\"col-xs-12 col-sm-6 col-md-6\" id=\"texto\">\n");
      out.write("                <h2>Donos de PetShop</h2>\n");
      out.write("                <p>\n");
      out.write("                    Ce este Lorem Ipsum?\n");
      out.write("                    Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-12 col-sm-5 col-md-5\" id=\"texto\">\n");
      out.write("                <h2>Nossos Serviços</h2>\n");
      out.write("                <p>\n");
      out.write("                    Ce este Lorem Ipsum?\n");
      out.write("                    Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.\n");
      out.write("                </p>\n");
      out.write("            </div>     \n");
      out.write("        </div>   \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <!-- <title>JSP Page</title>-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div id=\"rod1\">\n");
      out.write("                        <label>\n");
      out.write("                            <a link href=\"\">Politica de Privacidade</a>\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <label>\n");
      out.write("                            <a link href=\"\">Termos de Uso</a>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <span style=\"font-size: 40px; \">\n");
      out.write("                        <i class=\"fab fa-instagram\"></i>\n");
      out.write("                        <i class=\"fab fa-facebook-square\"></i>\n");
      out.write("                        <i class=\"fab fa-twitter-square\"></i>\n");
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div id=\"rod2\">\n");
      out.write("                        <label>\n");
      out.write("                            EasyPet Todos os direitos reservados\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <label>\n");
      out.write("                            CNPJ: 32.52.865/0001-75\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
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
