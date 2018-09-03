package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CADASTRO CLIENTE</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cadastroCliente.css\">      \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("        crossorigin=\"anonymous\"></script>   \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-5\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <h3 >EasyPet</h3>\n");
      out.write("                <img src=\"../ResourcesIm/logoSite.png\" width=\"88px\"/>    \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"cadastrar\" class=\"principal col-xs-12 col-sm-9 col-md-9\">\n");
      out.write("\n");
      out.write("                <form action=\"../CadastroClienteServlet\" method=\"post\" id=\"formulario\">\n");
      out.write("                    <h3 class=\"cadastro\">Cadastro de Cliente</h3>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-5 col-md-5\" id=\"nome\">\n");
      out.write("                            <label>Nome:</label>\n");
      out.write("                            <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6 \" id=\"sNome\">\n");
      out.write("                            <label>Sobrenome:</label>\n");
      out.write("                            <input type=\"text\" name=\"sobrenome\" class=\"form-control\" id=\"inputSNome\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-11 col-md-11\" id=\"email\">\n");
      out.write("                            <label>E-mail:</label>\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"exemplo@hotmail.com\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-11 col-md-11\" id=\"senha\">\n");
      out.write("                            <label>Senha:</label>\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <input type=\"password\" name=\"senha\" class=\"form-control\" id=\"inputSenha\">\n");
      out.write("                                <button type=\"button\" id=\"btn-modal-senha\" class=\"btn btn-outline-dark\">?</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-10 col-md-10\" id=\"confSenha\">\n");
      out.write("                            <label>Confirma a Senha:</label>\n");
      out.write("                            <input type=\"password\" name=\"confSenha\" class=\"form-control\" id=\"inputConfirmasenha\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6\" id=\"CPF\">\n");
      out.write("                            <div class=\"form-group \" id=\"cpf\">\n");
      out.write("                                <label>CPF:</label>\n");
      out.write("                                <input type=\"text\" name=\"cpf\" class=\"form-control\" id=\"inputCpf\" maxlength=\"11\"> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6    col-md-6\" id=\"telefone\">\n");
      out.write("                            <div class=\"form-group \" id=\"cpf\">\n");
      out.write("                                <label>Telefone:</label>\n");
      out.write("                                <input type=\"text\" name=\"telefone\" class=\"form-control\" id=\"inputTelefone\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6    col-md-6\" id=\"data\">\n");
      out.write("                            <div class=\"form-group \" id=\"data\">\n");
      out.write("                                <label>Data:</label>\n");
      out.write("                                <input type=\"date\" name=\"data\" class=\"form-control\" id=\"inputData\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6    col-md-6\" id=\"sexo\">\n");
      out.write("                            <div class=\"form-group \" id=\"sexo\">\n");
      out.write("                                <label>sexo:</label>\n");
      out.write("                                <div class=\"custom-control custom-radio\">\n");
      out.write("                                    <input type=\"radio\" id=\"customRadio1\" name=\"customRadio\" class=\"custom-control-input\" value=\"M\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"customRadio1\">Masculino</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"custom-control custom-radio\">\n");
      out.write("                                    <input type=\"radio\" id=\"customRadio2\" name=\"customRadio\" class=\"custom-control-input\" value=\"F\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"customRadio2\">Feminino</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-5  col-md-5\" id=\"cep\">\n");
      out.write("\n");
      out.write("                            <label>CEP:</label>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" name=\"cep\" class=\"form-control col-xs-12 col-sm-8  col-md-8\" id=\"inputCep\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-7  col-md-7\" id=\"endereco\">\n");
      out.write("                            <div class=\"form-group \" id=\"endereco\">\n");
      out.write("                                <label>Endereço:</label>\n");
      out.write("                                <input type=\"text\" name=\"endereco\" class=\"form-control\" id=\"inputEndereco\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-3 col-md-3\" id=\"numero\">\n");
      out.write("                            <label>Numero:</label>\n");
      out.write("                            <input type=\"text\" name=\"numero\" class=\"form-control\" id=\"inputNumero\" maxlength=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-7   col-md-7\" id=\"complemento\">\n");
      out.write("                            <label>Complemento:</label>\n");
      out.write("                            <input type=\"text\" name=\"complemento\" class=\"form-control\" id=\"inputComplemento\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6\" id=\"bairro\">\n");
      out.write("                            <label>Bairro:</label>\n");
      out.write("                            <input type=\"text\" name=\"bairro\" class=\"form-control\" id=\"inputBairro\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xs-12 col-sm-6 col-md-6\" id=\"cidade\">\n");
      out.write("                            <label>Cidade:</label>\n");
      out.write("                            <input type=\"text\" name=\"cidade\" class=\"form-control\" id=\"inputCidade\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group form-check\">\n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                            <label class=\"form-check-label\" for=\"exampleCheck1\">Aceitos os Termos de Uso </label>\n");
      out.write("                            <button type=\"button\" id=\"btn-termos-uso\" class=\"btn btn-outline-dark\">?</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" id=\"Cadastrar\" class=\" btn2 btn btn-success\">Enviar</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- The Modal -->\n");
      out.write("                <div id=\"modalSenha\" class=\"modal\">\n");
      out.write("                    <!-- Modal content -->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <span class=\"close\">&times;</span>\n");
      out.write("                        <p>A senha deverá conter no mínimo 8 caracteres</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- The Modal -->\n");
      out.write("                <div id=\"modalTermos\" class=\"modal\">\n");
      out.write("                    <!-- Modal content -->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <span class=\"close\">&times;</span>\n");
      out.write("                        <p>Termos de uso</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/cadastroCliente.js\"></script>        \n");
      out.write("    </body>\n");
      out.write("\n");
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
