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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luis Ragazzi
 */
@WebServlet(name = "AlterarDadosFornecedorServlet", urlPatterns = {"/AlterarDadosFornecedorServlet"})
public class AlterarDadosFornecedorServlet extends HttpServlet {

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
            Fornecedor fornecedor = new Fornecedor();
            
            fornecedor.setNome(request.getParameter("nome"));
            fornecedor.setRazao(request.getParameter("razaoSocial"));
            fornecedor.setEmail(request.getParameter("email"));
            fornecedor.setSenha(request.getParameter("senha"));
            fornecedor.setTelefone(request.getParameter("telefone"));
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
=======
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            
            int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idFornecedor")) {
                    id = Integer.parseInt(cookie.getValue());

                }                
            }
            
            fornecedor.setId(id);
            
            FornecedorDAO.alterarFornecedor(fornecedor);
            response.sendRedirect("jsp/MeusProdutos.jsp");
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
