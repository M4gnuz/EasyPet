/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Produto;
import dao.ProdutoDAO;
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
@WebServlet(name = "CadastroProdutoServlet", urlPatterns = {"/CadastroProdutoServlet"})
public class CadastroProdutoServlet extends HttpServlet {
    Produto produto = new Produto();
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
            
            
         String preco = request.getParameter("precoA");
        String converte ="";        
        float valor = 0;        
        for(int i=0;i<preco.length();i++){
           preco.charAt(i);
           if(preco.charAt(i)!='.' && preco.charAt(i) != ','){
               converte += preco.charAt(i);
           }
           if(preco.charAt(i) == ','){
               converte += ".";
           }
        }
        valor = Float.parseFloat(converte);        
            //produto.setImagem(request.getParameter("customFile"));
            produto.setNome(request.getParameter("titulo"));
            produto.setDescricao(request.getParameter("descricao"));
            produto.setContraIndicacao(request.getParameter("contra"));
            produto.setPreco(valor);
            produto.setEstoque(Integer.parseInt(request.getParameter("estoque")));
            produto.setCategoria(request.getParameter("categoria"));
            int id = 0;
            for (Cookie cookie : request.getCookies())
            if (cookie.getName().equals("idFornecedor"))                
                        id = Integer.parseInt(cookie.getValue());
            
            ProdutoDAO.addProduto(produto, id);
           
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