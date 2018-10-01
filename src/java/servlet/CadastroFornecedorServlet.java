/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Fornecedor;
import dao.FornecedorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author glima
 */
@WebServlet(name = "CadastroFornecedorServlet", urlPatterns = {"/CadastroFornecedorServlet"})
public class CadastroFornecedorServlet extends HttpServlet {
    
     public void converteString(String string) throws UnsupportedEncodingException{
            String encodedWithISO88591 = string;
            String decodedToUTF8 = new String(encodedWithISO88591.getBytes("ISO-8859-1"), "UTF-8");
            }
        Fornecedor fornecedor = new Fornecedor();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String data = request.getParameter("data");
            String datanova = "";
            for(int x = 0; x<data.length();x++){
                if(data.charAt(x)!='/')
               datanova+=data.charAt(x);
            }
<<<<<<< HEAD
            String mes=datanova.charAt(2)+""+datanova.charAt(3);
            String dia =datanova.charAt(0)+""+datanova.charAt(1);
            String ano =datanova.charAt(4)+"" + datanova.charAt(5)+"" + datanova.charAt(6)+"" + datanova.charAt(7);
            String dataCerta = ano + "/"+mes +"/"+ dia;
=======
            String dia=datanova.charAt(2)+""+datanova.charAt(3);
            String mes =datanova.charAt(0)+""+datanova.charAt(1);
            String ano =datanova.charAt(4)+"" + datanova.charAt(5)+"" + datanova.charAt(6)+"" + datanova.charAt(7);
            String dataCerta = ano + mes + dia;
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            System.out.print(dataCerta);
            
            fornecedor.setNome(request.getParameter("nome"));
            converteString(request.getParameter("nome"));
            fornecedor.setRazao(request.getParameter("razaoSocial"));
            fornecedor.setEmail(request.getParameter("email"));
            fornecedor.setSenha(request.getParameter("senha"));
            fornecedor.setCnpj(request.getParameter("cnpj"));
            fornecedor.setTelefone(request.getParameter("telefone"));
            fornecedor.setDataAbertura(dataCerta);
            fornecedor.setCep(request.getParameter("cep"));
            fornecedor.setEndereco(request.getParameter("endereco"));
            fornecedor.setNrRua(request.getParameter("numero"));
            fornecedor.setComplemento(request.getParameter("complemento"));
            fornecedor.setBairro(request.getParameter("bairro"));
            fornecedor.setCidade(request.getParameter("cidade"));
<<<<<<< HEAD
            fornecedor.setInicio(request.getParameter("inicioHorario"));
            fornecedor.setTermino(request.getParameter("fimHorario"));
            fornecedor.setDescricao(request.getParameter("descricaoFornecedor"));
           
            
            if (FornecedorDAO.confereCNPJ(fornecedor)) {               
                response.sendRedirect("jsp/CadastroFornecedor.jsp?status=Cnpj");

            } else if(FornecedorDAO.confereEmail(fornecedor)) {
                response.sendRedirect("jsp/CadastroFornecedor.jsp?status=Email"); 

            } else {
                FornecedorDAO.addFornecedor(fornecedor);
                response.sendRedirect("jsp/CadastroDeFornecedorImagem.jsp?status=OK&id="+ fornecedor.getId());
                
=======
           
            
            if (FornecedorDAO.confereCNPJ(fornecedor)) {
                out.print("<script type=\'text/javascript\'>");
                out.println("history.go(-1)");
                out.println("alert('CNPJ JA CADASTRADO!')");
                out.print("</script>");

            } else if(FornecedorDAO.confereEmail(fornecedor)) {
                out.print("<script type=\'text/javascript\'>");
                out.println("history.go(-1)");
                out.println("alert('EMAIL JA CADASTRADO!')");
                out.print("</script>");    

            } else {
                FornecedorDAO.addFornecedor(fornecedor);
                response.sendRedirect("index.html");
                out.print("<script type=\'text/javascript\'>");
                out.println("alert('Cadastrado com Sucesso')");
                out.print("</script>");
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
