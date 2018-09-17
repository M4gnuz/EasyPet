package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FaleConosco_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Fale Conosco</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/FaleConosco.css\">    \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/rodape.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cabecalho.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js\"></script>\n");
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
      out.write("    <nav id=\"nav-principal\" class=\"navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-3\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <h3>EasyPet</h3>\n");
      out.write("            <img src=\"../ResourcesIm/logoSite.png\" width=\"88px\">        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"btn-toolbar mb-3\" role=\"toolbar\" aria-label=\"Toolbar with button groups\">\n");
      out.write("            <div class=\"btn-group mr-2\" role=\"group\" aria-label=\"First group\">\n");
      out.write("                <button type=\"button\" id=\"meusProdutosFornecedor\" class=\"btn btn-success\">Produtos</button>\n");
      out.write("                <button type=\"button\" id=\"meusServicosFornecedor\"class=\"btn  btn-success\">Serviços</button>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      Sobre\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"QuemSomos.jsp\">Quem Somos</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"TermosECondicoes.jsp\">Termos Condições e Uso</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"PoliticaDePrivacidade.jsp\">Privacidade</a>                        \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      Contato\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"FaleConosco.jsp\">Fale Conosco</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Trabalhe Conosco</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"ComoPedir.jsp\">Como Pedir</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                <button type=\"button\" id=\"btn-sairFornecedor\"class=\"btn  btn-success\">Sair</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"../FaleConoscoServlet\" method=\"post\" id=\"formulario\">\n");
      out.write("                <div id=\"faleConosco\" class=\"principal col-xs-12 col-sm-5 col-md-5\">                \n");
      out.write("                    <h3 class=\"cadastro\">Fale Conosco</h3>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-12 col-md-12\" id=\"nome\">\n");
      out.write("                            <label>Nome Completo</label>\n");
      out.write("                            <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-12 col-md-12\" id=\"nome\">\n");
      out.write("                            <label>Email</label>\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"inputEmail\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6\" id=\"telefone\">\n");
      out.write("                            <div class=\"form-group \" id=\"cpf\">\n");
      out.write("                                <label>Telefone:</label>\n");
      out.write("                                <input type=\"text\" name=\"telefone\" class=\"form-control\" id=\"inputTelefone\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6\" >\n");
      out.write("                                <label>Assunto</label>\n");
      out.write("                                <input type=\"text\" name=\"assunto\" class=\"form-control\" id=\"inputAssunto\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6\" >\n");
      out.write("                                <label>Motivo:</label>\n");
      out.write("                                <input type=\"text\" name=\"motivo\" class=\"form-control\" id=\"inputMotivo\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"\" class=\"principal col-xs-12 col-sm-5 col-md-5\">\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-10 col-md-10\" id=\"descri\">\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"exampleFormControlTextarea1\" >Deixe aqui sua mensagem:</label>\n");
      out.write("                        <textarea class=\"form-control\" name=\"mensagem\" id=\"inputDescricao\" rows=\"15\" maxlength=\"1000\" placeholder=\"Faça uma descrição do produto com até 1000 caracteres.\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"\" class=\" col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("                        <button type=\"button\" id=\"btn_enviarFormularioDeDuvidas\" class=\" btn2 btn btn-success float-right\">Enviar</button>                      \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/FaleConosco.js\"></script>\n");
      out.write("        ");
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
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div id=\"rod1\">\n");
      out.write("                        <label>\n");
      out.write("                            <a link href=\"PoliticaDePrivacidade.jsp\">Politica de Privacidade</a>\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <label>\n");
      out.write("                            <a link href=\"TermosECondicoes.jsp\">Termos e Condições de Uso</a>\n");
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
