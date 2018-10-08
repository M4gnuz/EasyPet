package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.FornecedorDAO;
import classes.Fornecedor;
import classes.Cliente;
import dao.ClienteDAO;

public final class Carrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp/CabecalhoCliente.jsp");
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("\n");
 String validacao = request.getParameter("status");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Carrinho</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/carrinho.css\">  \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/rodape.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cabecalho.css\"> \n");
      out.write("        <link href=\"../Plugins/css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"tudo\" class=\"paginaCarrinho\">\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
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
      out.write("         ");
 
        int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idCliente")) {
                    id = Integer.parseInt(cookie.getValue());

                }                
            }
           
            Cliente novo = ClienteDAO.getCliente(id);
        
      out.write("\n");
      out.write("        <nav id=\"nav-principal\" class=\"navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-3\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <h3>EasyPet</h3>\n");
      out.write("                <img src=\"../ResourcesIm/logoSite.png\" width=\"88px\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"btn-toolbar mb-3\" role=\"toolbar\" aria-label=\"Toolbar with button groups\">\n");
      out.write("                <div class=\"btn-group mr-2\" role=\"group\" aria-label=\"First group\">\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button id=\"Comprar\" class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Comprar</button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"PaginadeProdutos.jsp\">Produtos</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Serviços</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Sobre\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"QuemSomos.jsp\">Quem Somos</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"TermosECondicoes.jsp\">Termos Condições e Uso</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"PoliticaDePrivacidade.jsp\" >Privacidade</a>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Contato\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"FaleConosco.jsp\">Fale Conosco</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Trabalhe Conosco</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ComoPedir.jsp\">Como Pedir</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button id=\"menuCliente\" class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fas fa-user-alt\"></i>\n");
      out.write("                            ");
 out.print(novo.getNome()); 
      out.write("\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"MeusDadosCliente.jsp\">Editar meu Perfil</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"TrocaSenha.jsp\">Trocar Senha</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"MeusPets.jsp\">Gerenciar meus Pets</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Acompanhar meus pedidos</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Acompanhar meus agendamentos</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Assinaturas</a>   \n");
      out.write("                            <a class=\"dropdown-item\" href=\"../index.html\">Sair</a> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"row\" >\n");
      out.write("            <div class=\"col-xs-12 col-sm-1 col-md-1\"></div>\n");
      out.write("            <div id=\"conteudoCarrinho\" class=\"col-xs-12 col-sm-10 col-md-10\">\n");
      out.write("                <div class=\"table-responsive cart_info\">\n");
      out.write("                    <table class=\"table table-condensed\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"cart_menu\">\n");
      out.write("                                <td class=\"image\">Produto</td>\n");
      out.write("                                <td class=\"description\">Descrição</td>\n");
      out.write("                                <td class=\"price\">Preço</td>\n");
      out.write("                                <td class=\"quantity\">Quantidade</td>\n");
      out.write("                                <td class=\"total\">Total</td>\n");
      out.write("                                <td>Remover</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"cart_product\">\n");
      out.write("                                    <a href=\"\"><img src=\"../ResourcesIm/logoSite.png\" alt=\"\" width=\"100\" height=\"80\"></a>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_description\">\n");
      out.write("                                    <h6>Nome do Produto</h6>\n");
      out.write("                                    <p>Descrição do produto ba bla bla bla</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_price\">\n");
      out.write("                                    <p>50,00</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_quantity\">\n");
      out.write("                                    <div class=\"cart_quantity_button\">\n");
      out.write("                                        <a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                        <a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_total\">\n");
      out.write("                                    <p class=\"cart_total_price\">50,00</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_delete\">\n");
      out.write("                                    <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"cart_product\">\n");
      out.write("                                    <a href=\"\"><img src=\"../ResourcesIm/logoSite.png\" alt=\"\" width=\"100\" height=\"80\"></a>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_description\">\n");
      out.write("                                    <h6>Nome do Produto</h6>\n");
      out.write("                                    <p>Descrição do produto ba bla bla bla</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_price\">\n");
      out.write("                                    <p>120,00</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_quantity\">\n");
      out.write("                                    <div class=\"cart_quantity_button\">\n");
      out.write("                                        <a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                        <a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_total\">\n");
      out.write("                                    <p class=\"cart_total_price\">120,00</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_delete\">\n");
      out.write("                                    <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"cart_product\">\n");
      out.write("                                    <a href=\"\"><img src=\"../ResourcesIm/logoSite.png\" alt=\"\" width=\"100\" height=\"80\"></a>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_description\">\n");
      out.write("                                    <h6>Nome do Produto</h6>\n");
      out.write("                                    <p>Descrição do produto ba bla bla bla</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_price\">\n");
      out.write("                                    <p>10,00</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_quantity\">\n");
      out.write("                                    <div class=\"cart_quantity_button\">\n");
      out.write("                                        <a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                        <a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_total\">\n");
      out.write("                                    <p class=\"cart_total_price\">10,00</p>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"cart_delete\">\n");
      out.write("                                    <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"4\">&nbsp;</td>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <table id=\"resumoValor\"  class=\"table table-condensed total-result\">\n");
      out.write("                                        <tr style=\"border-bottom: 1px solid #C2C2C1;\">\n");
      out.write("                                            <td colspan=\"2\">Resumo</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Valor Frete</td>\n");
      out.write("                                            <td>20,00</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Valor Total</td>\n");
      out.write("                                            <td>180,00</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">      \n");
      out.write("\n");
      out.write("            <div class=\"form-group col-xs-10 col-sm-10 col-md-12\">\n");
      out.write("                <button type=\"button\" name=\"opcao\" id=\"finalizar\" class=\" btn2 btn btn-success float-right\" value=\"salvar\">Finalizar</button>\n");
      out.write("                <button type=\"button\" name=\"opcao\" id=\"paginaProdutos\" class=\" btn2 btn btn-cancel float-right \" value=\"voltar\">Voltar a comprar</button>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"form-group col-xs-2 col-sm-2 col-md-2\">\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <script type=\"text/javascript\" src=\"../js/\" charset=\"utf-8\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>       \n");
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
