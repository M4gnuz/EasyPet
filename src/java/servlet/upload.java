/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classes.Produto;
import dao.ProdutoDAO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.net.URL;
=======
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.misc.BASE64Decoder;

/**
 *
 * @author glima
 */
public class upload extends HttpServlet {
<<<<<<< HEAD

    public String decodeToImage(String imageString, int idProduto, int idFornecedor) {
=======
    
     public static String decodeToImage(String imageString, int i) {
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
        String path = "";
        BufferedImage image = null;
        byte[] imageByte;
        try {
<<<<<<< HEAD
            //o método recebe um string base 64 e converte para array de bytes
=======
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
<<<<<<< HEAD
            
            //o array de bytes converte em um arquivo novamente.
=======

>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            BufferedImage img = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = img.createGraphics();
            g2d.drawImage(image, 0, 0, null);
            g2d.dispose();
<<<<<<< HEAD
            
            //pegamos o caminho da classe upload(this), e cortamos para direcionar para pasta de imagens.
            URL caminho = getClass().getResource("upload.class");;
            int indice = caminho.toString().indexOf("build");
            String projectPath = caminho.toString().substring(5, indice); 
            
            //escrevemos o caminho e o nome do arquivo como deve ser.
            File imgOutFile = new File(projectPath + "\\web\\ImagemProduto/img" + idFornecedor + "-" + idProduto + ".jpeg");
            System.out.print("DIRETÓRIO:    " + imgOutFile.getAbsolutePath());            
            ImageIO.write(image, "png", imgOutFile);
            String diretorio = imgOutFile.getAbsolutePath();           
            
=======
            //String caminho = getClass().getResource("../ProdImg/");
            File imgOutFile = new File("C:\\Users\\glima\\Desktop\\4.0\\WeasyPet\\web\\ProdImg/newLabel" + i + ".png");
            ImageIO.write(image, "png", imgOutFile);
            String diretorio = imgOutFile.getAbsolutePath();
            //System.out.print(diretorio + "");
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
            path = diretorio;
            bis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }

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
<<<<<<< HEAD
            /* TODO output your page here. You may use following sample code. */            
            
            String status = request.getParameter("status");
            String foto = request.getParameter("upload");
                        
            int idProduto = Integer.parseInt(request.getParameter("id"));
            System.out.print("Checa ID: " + idProduto);
            int idFornecedor = 0;
            
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idFornecedor")) {
                    idFornecedor = Integer.parseInt(cookie.getValue());
                }                            
            }
           
            
            String imagem = decodeToImage(foto, idFornecedor, idProduto);

            String[] vetor = imagem.replace("\\", "/").split("/");
            String exibir2 = "../" + vetor[7] + "/" + vetor[8];
            System.out.println("VETOR:    " + exibir2);
           
            ProdutoDAO.addImagem(idProduto, exibir2);
            
            if(status!=null && status.equals("OK")){
                response.sendRedirect("jsp/MeusProdutos.jsp?status=OK");
            }        
=======
            /* TODO output your page here. You may use following sample code. */
           String foto = request.getParameter("upload");
            System.out.println(foto);
            int i = 0;
            String imagem = decodeToImage(foto, i);

            int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idProduto")) {
                    id = Integer.parseInt(cookie.getValue());
                }
            }
            Produto produto = new Produto();
            produto.setId(id); 
            String urlHtml = imagem.replace("\\", "/");
            System.out.println(urlHtml);

            /*for (int x = 0; x < produto.getImagem().length(); x++) {
                if (produto.getImagem().charAt(x) =='x') {
                    urlHtml += "";
                } else {
                    urlHtml += produto.getImagem().charAt(x);
                }
            }*/
            ProdutoDAO.addImagem(41 , urlHtml);
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
