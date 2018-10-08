package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.FornecedorDAO;
import classes.Fornecedor;

public final class CadastrarPet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/cabecalho.jsp");
    _jspx_dependants.add("/jsp/menuLateral.jsp");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Pet</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cadastroAlimento.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Source Files/jquery-ui.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cabecalho.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/menuLateral.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/rodape.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../Source Files/maskMoney.jquery.json\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js\"></script>\n");
      out.write("        <script src=\"../Source Files/jquery-ui.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"tudo\">\n");
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
      out.write("        ");

            int id =0;
            for (Cookie cookie : request.getCookies()) {
                                if (cookie.getName().equals("idFornecedor")) {
                                    id = Integer.parseInt(cookie.getValue());
                                }
                            }
            Fornecedor forn = FornecedorDAO.getFornecedor(id);
        
      out.write("\n");
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
      out.write("                        <a class=\"dropdown-item\" href=\"TrabalheConosco_v2.jsp\">Trabalhe Conosco</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"ComoPedir.jsp\">Como Pedir</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                        <button id=\"menuFornecedor\" class=\"btn btn-success dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fas fa-user-alt\"></i>\n");
      out.write("                            ");
 out.print(forn.getNome()); 
      out.write("\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"MeusProdutos.jsp\">Meus Produtos</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"MeusServicos.jsp\">Meus Serviços</a>   \n");
      out.write("                            <a class=\"dropdown-item\" href=\"../index.html\">Sair</a> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div id=\"petlogo\" class=\"principal2  col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("                <h4>Nome do clinte</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div id=\"logocentral\" class=\"principal2 col-xs-12 col-sm-7 col-md-7\">\n");
      out.write("                <h1 id=\"nomeTopo\">Adicionar um PET</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.write("        <div class=\"container\" id=\"caixa1\">\n");
      out.write("            <div class=\"principal col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("                <div id=\"accordion\">\n");
      out.write("                    <div class=\"card\" id=\"cardhome\">\n");
      out.write("                        <div class=\"card-header\" id=\" headingOne\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-expanded=\"False\" aria-controls=\"collapseOne\"\n");
      out.write("                                        onclick=\"window.location.href = 'Loja.jsp'\">\n");
      out.write("                                    Home - Minha Loja\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"collapseOne\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordion\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\" id=\"cardProduto\">\n");
      out.write("                        <div class=\"card-header\" id=\"headingTwo\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                    Produtos\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordion\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a id=\"click\" link href=\"CadastroAlimento.jsp\">Novo Produto Alimentício </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a id=\"click\" link href=\"CadastroAcessorio.jsp\">Novo  Produto Diversos </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a link href=\"MeusProdutos.jsp\"> Gerenciar Produtos</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!--\n");
      out.write("                                    <li>\n");
      out.write("                                        <a link href=\"\"> Categorias</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    -->\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\" id=\"cardProduto\">\n");
      out.write("                        <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                    Serviços\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordion\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a id=\"click\" link href=\"CadastroServico.jsp\">Novo Serviço </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a link href=\"MeusServicos.jsp\"> Meus Serviços</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card\" id=\"cardAgendamento\">\n");
      out.write("                        <div class=\"card-header\" id=\"headingFive\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapseFive\" aria-expanded=\"false\" aria-controls=\"collapseFive\">\n");
      out.write("                                    Agendamento\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\" id=\"cardPedido\">\n");
      out.write("                        <div class=\"card-header\" id=\"headingSix\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapseSix\" aria-expanded=\"false\" aria-controls=\"collapseSix\">\n");
      out.write("                                    Pedidos\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\" id=\"cardAval\">\n");
      out.write("                        <div class=\"card-header\" id=\"headingSeven\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapseSeven\" aria-expanded=\"false\" aria-controls=\"collapseSeven\">\n");
      out.write("                                    Avaliações\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\" id=\"cardconfig\">\n");
      out.write("                        <div class=\"card-header\" id=\"headingEight\">\n");
      out.write("                            <h5 class=\"mb-0\">\n");
      out.write("                                <button class=\"btn btn-link collapsed\" data-toggle=\"collapse\" data-target=\"#collapseEight\" aria-expanded=\"false\" aria-controls=\"collapseEight\">\n");
      out.write("                                    Configurações\n");
      out.write("                                </button>\n");
      out.write("                            </h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"collapseEight\" class=\"collapse\" aria-labelledby=\"headingEight\" data-parent=\"#accordion\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a id=\"click\" link href=\"MeusDadosFornecedor.jsp\">Alterar Dados </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a id=\"click\" link href=\"TrocaSenhaFornecedor.jsp\">Trocar Senha</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"../\" method=\"post\" id=\"formPet\">\n");
      out.write("            <div id=\"fotoprod\" class=\"principal col-xs-12 col-sm-6 col-md-6\">\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-7 col-md-7\" id=\"titulop\">\n");
      out.write("                        <label>Nome do Pet: *</label>\n");
      out.write("                        <input type=\"text\" name=\"titulo\" class=\"form-control\" id=\"inputNomePet\">\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-1 col-md-1\" id=\"titulop\">\n");
      out.write("                                <!--Espacamento-->\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-4 col-md-4\" id=\"dataV\">\n");
      out.write("                        <div class=\"form-group \" id=\"data\">\n");
      out.write("                            <label class=\"fonte\"> Data de Nascimento:*</label>\n");
      out.write("                            <input type=\"text\" name=\"dataV\" class=\"form-control\" id=\"inputDataV\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-4 col-md-4\" id=\"optionTipo\">\n");
      out.write("                        <label class=\"fonte\">Tipo *</label>\n");
      out.write("                        <select class=\"custom-select\" name=\"categoria\" id=\"inputGroupSelectTipo\">\n");
      out.write("                            <option selected>--</option>\n");
      out.write("                            <option value=\"Cães\">Cães</option>\n");
      out.write("                            <option value=\"Gatos\">Gatos</option>\n");
      out.write("                            <option value=\"Pássaros\">Pássaros</option>\n");
      out.write("                            <option value=\"Hamsters\">Hamsters</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-4 col-md-4\" id=\"optionPorte\">\n");
      out.write("                        <label class=\"fonte\">Porte *</label>\n");
      out.write("                        <select class=\"custom-select\" name=\"porte\" id=\"inputGroupSelectPorte\">\n");
      out.write("                            <option selected>--</option>\n");
      out.write("                            <option value=\"Pequeno\">Pequeno</option>\n");
      out.write("                            <option value=\"Médio\">Médio</option>\n");
      out.write("                            <option value=\"Grande\">Grande</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("                        <div class=\"form-group \" id=\"data\">\n");
      out.write("                            <label>Raça:</label>\n");
      out.write("                            <input type=\"text\" name=\"raca\" class=\"form-control\" id=\"inputRaca\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-xs-12 col-sm-12 col-md-12\" id=\"descri\">\n");
      out.write("                    <label for=\"exampleFormControlTextarea1\">Observações</label>\n");
      out.write("                    <textarea class=\"form-control\" name=\"observacao\" id=\"inputObservacao\" rows=\"4\"  maxlength=\"270\" placeholder=\"Descreva umas observações importantes do seu PET com até 270 caracteres.\"></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("                <div class=\"row\">                       \n");
      out.write("                    <div class=\"form-group col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("                        <button type=\"button\" name=\"opcao\" id=\"salvar_pet\" class=\" btn2 btn btn-success float-right \" value=\"salvar\">Salvar</button>\n");
      out.write("                        <button type=\"button\" name=\"opcao\" id=\"cancelarCadPet\" class=\" btn2 btn btn-cancel float-right\" value=\"cancelar\">Cancelar</button>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <!-- <a href=\"MeusProdutos.jsp\" class=\"btn2 btn btn-success\">Cancelar</a>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>   \n");
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
      out.write("\t\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/cadastrarPet.js\" charset=\"utf-8\"></script> \n");
      out.write("  \n");
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