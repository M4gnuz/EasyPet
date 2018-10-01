/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Alimento;
import dao.AlimentoDAO;
import dao.FornecedorDAO;
import dao.ProdutoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author glima
 */
public class Controle extends HttpServlet {

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

            String action = request.getParameter("action");           
            
            if (action.equals("del")) {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("id", id);
                ProdutoDAO.excluirProduto(id);
                response.sendRedirect("jsp/MeusProdutos.jsp");
            }
             Cookie[] cookies = request.getCookies();     
            if(action.equals("alt")){
                int id = Integer.parseInt(request.getParameter("id"));
                Alimento novo = AlimentoDAO.getAlimentosUnitario(id);
                response.addCookie(new Cookie("idProduto", novo.getId()+""));                   
                if(novo.getNomeIngrediente()!=null){
                   response.sendRedirect("jsp/EditarAlimento.jsp");
                   response.addCookie(new Cookie("idProduto", novo.getId()+""));
                }else{
                    response.sendRedirect("jsp/EditarAcessorio.jsp");
                }
            }            
            
            if(action.equals("delForn")){
                int id = Integer.parseInt(request.getParameter("id"));
                FornecedorDAO.excluirFornecedor(id);
            }
            
            if(action.equals("comprar")){
                int id = Integer.parseInt(request.getParameter("id"));
                Alimento novo = AlimentoDAO.getAlimentosUnitario(id);
                response.addCookie(new Cookie("idProduto", novo.getId()+""));                   
                if(novo.getNomeIngrediente()!=null){
                   response.addCookie(new Cookie("idProduto", novo.getId()+""));
                   response.addCookie(new Cookie("nivelProd", "2"));
                   response.sendRedirect("jsp/PaginaProduto.jsp");
                }else{
                    response.addCookie(new Cookie("nivelProd", "1"));
                    response.sendRedirect("jsp/PaginaProduto.jsp");
                }
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
