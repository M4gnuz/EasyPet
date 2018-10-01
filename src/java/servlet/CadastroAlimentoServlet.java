/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Alimento;
import dao.AlimentoDAO;
import dao.ProdutoDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
<<<<<<< HEAD
import java.text.Normalizer;
=======
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
import java.util.List;
import javax.imageio.ImageIO;
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
@WebServlet(name = "CadastroAlimentoServlet", urlPatterns = {"/CadastroAlimentoServlet"})
public class CadastroAlimentoServlet extends HttpServlet {
    
    /**
     *
     * @param string
     * @throws UnsupportedEncodingException
     */
    public void converteString(String string) throws UnsupportedEncodingException{
            String encodedWithISO88591 = string;
            String decodedToUTF8 = new String(encodedWithISO88591.getBytes("ISO-8859-1"), "UTF-8");
<<<<<<< HEAD
            }  
     
     
     public String removeAcentos(final String str) {
	String strSemAcentos = Normalizer.normalize(str, Normalizer.Form.NFD);
	strSemAcentos = strSemAcentos.replaceAll("[^\\p{ASCII}]", "");
	return strSemAcentos;
}
=======
            }
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab

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
        response.setContentType("text/html;charset=ISO-8859-1");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

<<<<<<< HEAD
           /* String opcao = request.getParameter("opcao");
            System.out.println(request.getParameter("opcao"));
            if (opcao.equals("salvar")) {
                response.sendRedirect("jsp/MeusProdutos.jsp");
            } else {    */            
                 String data = request.getParameter("dataV");
            String datanova = "";
            for(int x = 0; x<data.length();x++){
                if(data.charAt(x)!='/')
               datanova+=data.charAt(x);
            }
            String dia=datanova.charAt(2)+""+datanova.charAt(3);
            String mes =datanova.charAt(0)+""+datanova.charAt(1);
            String ano =datanova.charAt(4)+"" + datanova.charAt(5)+"" + datanova.charAt(6)+"" + datanova.charAt(7);
            String dataCerta = ano + mes + dia;
            alimento.setDtVencimento(dataCerta);
            
=======
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            String preco = request.getParameter("precoA");
            String converte = "";
            float valor = 0;
            for (int i = 0; i < preco.length(); i++) {
                preco.charAt(i);
                if (preco.charAt(i) != '.' && preco.charAt(i) != ',') {
                    converte += preco.charAt(i);
                }
                if (preco.charAt(i) == ',') {
                    converte += ".";
                }
            }
            valor = Float.parseFloat(converte);

            //alimento.setImagem(request.getParameter("customFile"));
            
            alimento.setNome(request.getParameter("titulo"));
            converteString(request.getParameter("titulo"));
            alimento.setDescricao(request.getParameter("descricao"));
            alimento.setContraIndicacao(request.getParameter("contra"));
<<<<<<< HEAD
            alimento.setNomeIngrediente(request.getParameter("ingredientes"));            
=======
            alimento.setNomeIngrediente(request.getParameter("nome"));            
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            alimento.setPreco(valor);
            alimento.setEstoque(Integer.parseInt(request.getParameter("estoque")));            
            alimento.setCategoria(request.getParameter("categoria"));
<<<<<<< HEAD
=======

            int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idFornecedor")) {
                    id = Integer.parseInt(cookie.getValue());
                }
            }
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab

            int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idFornecedor")) {
                    id = Integer.parseInt(cookie.getValue());
                }
            }
             String semAct = removeAcentos(alimento.getNome());
            
           if(ProdutoDAO.verificaTitulo(id, alimento.getNome())){
                response.sendRedirect("jsp/CadastroAcessorio.jsp?status=nome");                
            }
            else if(ProdutoDAO.verificaTitulo(id, semAct)){
                response.sendRedirect("jsp/CadastroAcessorio.jsp?status=nome");
            }else{
                //ADICIONA PRODUTO
            AlimentoDAO.addAlimento(alimento, id);
<<<<<<< HEAD
            //Produto novo = ProdutoDAO.getUltimoItem(id);
            System.out.print("MEU ID: " + alimento.getId());            
            response.sendRedirect("jsp/cadastroDeProdutosImagem.jsp?status=OK&id="+alimento.getId());
            }   
=======
            out.print("<script type=\'text/javascript\'>");
            out.print("alert('Produto Cadastrado com Sucesso!');");
            out.println("location='jsp/MeusProdutos.jsp';");
            out.print("</script>");

            response.sendRedirect("jsp/MeusProdutos.jsp");
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
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
