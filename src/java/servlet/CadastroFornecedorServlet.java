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
            
            fornecedor.setNome(request.getParameter("nome"));
            fornecedor.setRazao(request.getParameter("razaoSocial"));
            fornecedor.setEmail(request.getParameter("email"));
            fornecedor.setSenha(request.getParameter("senha"));
            fornecedor.setCnpj(request.getParameter("cnpj"));
            fornecedor.setTelefone(request.getParameter("telefone"));
            fornecedor.setDataAbertura(request.getParameter("data"));
            fornecedor.setCep(request.getParameter("cep"));
            fornecedor.setEndereco(request.getParameter("endereco"));
            fornecedor.setNrRua(request.getParameter("numero"));
            fornecedor.setComplemento(request.getParameter("complemento"));
            fornecedor.setBairro(request.getParameter("bairro"));
            fornecedor.setCidade(request.getParameter("cidade"));
            
           Fornecedor novo = FornecedorDAO.getFornecedor(fornecedor);
            
            if (fornecedor.getCnpj().equals(novo.getCnpj())) {
                out.print("<script type=\'text/javascript\'>");
                out.println("history.go(-1)");
                out.println("alert('CPF JA CADASTRADO!')");
                out.print("</script>");

            } else if(fornecedor.getEmail().equals(novo.getEmail())) {
                out.print("<script type=\'text/javascript\'>");
                out.println("history.go(-1)");
                out.println("alert('EMAIL JA CADASTRADO!')");
                out.print("</script>");    

            } else {
                FornecedorDAO.addFornecedor(fornecedor);
                response.sendRedirect("index.html");
                out.print("<script type=\'text/javascript\'>");
                out.println("history.go(-1)");
                out.println("alert('Cadastrado com Sucesso')");
                out.print("</script>");
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
