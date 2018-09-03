/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Alimento;
import dao.AlimentoDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luis Ragazzi
 */
@WebServlet(name = "CadastroAlimentoServlet", urlPatterns = {"/CadastroAlimentoServlet"})
public class CadastroAlimentoServlet extends HttpServlet {

    Alimento alimento = new Alimento();

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
            
            //alimento.setImagem(request.getParameter("customFile"));
            alimento.setNome(request.getParameter("titulo"));
            alimento.setDescricao(request.getParameter("descricao"));
            alimento.setContraIndicacao(request.getParameter("contra"));
            alimento.setNomeIngrediente("nome");
            alimento.setQtdIngrediente(Integer.parseInt(request.getParameter("qtd")));
            alimento.setPreco(valor);
            alimento.setEstoque(Integer.parseInt(request.getParameter("estoque")));
            alimento.setDtVencimento(request.getParameter("dataV"));
            alimento.setCategoria(request.getParameter("categoria"));

            AlimentoDAO.addAlimento(alimento);
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
        /*Obtem o caminho relatorio da pasta img*/
        String path = request.getServletContext().getRealPath("img") + File.separator;

        File files = new File(path);
        response.setContentType("image/jpeg");

        /*Mostra o arquivo que está na pasta img onde foi realizado o upload*/
        for (String file : files.list()) {
            File f = new File(path + file);
            BufferedImage bi = ImageIO.read(f);
            OutputStream out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
            out.close();
        }
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

        //Identifica se o formulario é do tipo multipart/form-data
        /*if (ServletFileUpload.isMultipartContent(request)) {
            try {
                //Faz o parse do request
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);

                //Escreve a o arquivo na pasta img
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        item.write(new File(request.getServletContext().getRealPath("img") + File.separator + "uploadfile"));
                    }
                }

                request.setAttribute("message", "Arquivo carregado com sucesso");
            } catch (Exception ex) {
                request.setAttribute("message", "Upload de arquivo falhou devido a " + ex);
            }

        } else {
            request.setAttribute("message", "Desculpe este Servlet lida apenas com pedido de upload de arquivos");
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
     */
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
