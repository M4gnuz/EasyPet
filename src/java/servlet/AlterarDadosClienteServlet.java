/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Cliente;
import dao.ClienteDAO;
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
@WebServlet(name = "AlterarDadosClienteServlet", urlPatterns = {"/AlterarDadosClienteServlet"})
public class AlterarDadosClienteServlet extends HttpServlet {

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
            Cliente cliente = new Cliente();
            
            cliente.setNome(request.getParameter("nome"));
            cliente.setSobreNome(request.getParameter("sobrenome"));
            cliente.setSenha(request.getParameter("senha"));
            cliente.setTelefone(request.getParameter("telefone"));
            cliente.setCep(request.getParameter("cep"));
            cliente.setEndereco(request.getParameter("endereco"));
            cliente.setNrRua(request.getParameter("numero"));
            cliente.setComplemento(request.getParameter("complemento"));
            cliente.setBairro(request.getParameter("bairro"));
            cliente.setCidade(request.getParameter("cidade"));
            String masc = request.getParameter("customRadio");
            String fem = request.getParameter("customRadio");
            if ("M".equals(masc)) {
                cliente.setSexo('M');
            }
            if ("F".equals(fem)) {
                cliente.setSexo('F');
            }
            
            int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idCliente")) {
                    id = Integer.parseInt(cookie.getValue());

                }                
            }
            
            cliente.setId(id);
            
            ClienteDAO.alteraCliente(cliente);
            response.sendRedirect("jsp/Home.jsp");
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
