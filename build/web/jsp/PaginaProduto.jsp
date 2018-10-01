
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.FornecedorDAO"%>
<%@page import="classes.Fornecedor"%>
<%@page import="dao.AlimentoDAO"%>
<%@page import="classes.Alimento"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="classes.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina do Produto</title>
            
        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css">
        <link rel="stylesheet" type="text/css" href="../css/meusProdutos.css">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="../css/PaginaProduto.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
       
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
    </head>
    <body id="tudo">
        <%@include file="CabecalhoCliente.jsp"%>
         <%
            int idP = 0;
            Alimento alimento = new Alimento();
            Fornecedor fornecedor = new Fornecedor();
            Produto produto = new Produto();
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idProduto")) {
                    idP = Integer.parseInt(cookie.getValue());
                }
            }
            int nivel=0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("nivelProd")) {
                    nivel = Integer.parseInt(cookie.getValue());
                }
            }
            if(nivel == 1){
                ProdutoDAO.getAcessorio(produto, idP);
                fornecedor = FornecedorDAO.getFornecedor(produto.getIdFornecedor());
            }
            else{
                alimento = AlimentoDAO.getAlimentosUnitario(idP);
                fornecedor = FornecedorDAO.getFornecedor(alimento.getIdFornecedor());
            }
            
         %>
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-sm-6 col-md-6">
                        <img class="imagemProd" src="<% out.print(produto.getImagem()); %>">
                        <figcaption> 
                        
                        <a href="" class="nomePet"> <% out.print("PetShop: "+fornecedor.getNome()); %></a>
                        
                        <div class="estrelas">
                            
                                <label>
                                   <img name="fb" value="1" class="apagada"/>
                               </label>
                               <label>
                                   <img name="fb" value="2" class="apagada"/>
                               </label>
                               <label>
                                   <img name="fb" value="3"  class="apagada"/>
                               </label>
                               <label>
                                   <img name="fb" value="4"  class="apagada"/>
                               </label>
                               <label>
                                   <img name="fb" value="5" class="apagada"/>
                               </label>

                            
                        </div>
                        </figcaption>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-6" >
                        
                         <h2 name="nomeProduto" id="paginaP"><% if(nivel == 1){out.print(produto.getNome());} else{out.print(alimento.getNome());} %></h2>
                         
                         <h4 id="valorProduto">R$<spam value="valorProd"><% if(nivel == 1){out.print(produto.getPreco());} else{out.print(alimento.getPreco());} %></spam></h4>
                         <div class="botao"> 
                             <button type="button" class="btn btn-primary btnF">Formas de Pagamento</button>
                       <button type="submit" class="btn btn-primary">Adicionar ao Carrinho</button>
                          </div>
                         <button type="submit" class="btn btn-outline-dark">Calcular Valor Frete</button> 
                      <!--  <div data-spy="scroll" id="txtcaracteristica" class="scrollspy-example"> 
                            <h6> CARACTERISTICA DO PRODUTO  </h6>
                            <p value="txtcaracter">Andre aqui vai as caracteristicas</p>
                              
                        </div> -->
                        
                    </div>
                   
                
            </div>
                <hr>
                <div class="row dsc">
                    <div id="geral"  class="col-xs-12 col-md-12 col-sm-12">
                        <%
                                if(nivel == 1){
                                    
                                    out.print("<div value='infoGeral'class=''>"
                                            + "<label>Descrição: <span value='txtDescricao'><br>"+ produto.getDescricao() +"</span> </label><br>"
                                            + "<label>Contra-Indicação: <span value='txtContraInd'><br> "+produto.getContraIndicacao() +"</span> </label><br>"
                                            + "<label>Quantidade de Produto em Estoque: <span value='txtContraInd'><br> "+produto.getEstoque()+"</span> </label><br>"
                                                    + "</div>");
                      
                           
                                }
                                else{
                                    out.print("<div value='alimento' class=' '>"
                                            + "<label>Descrição: <span value='txtDescricao'>"+ alimento.getDescricao() +"</span> </label><br>"
                                            + "<label>Contra-Indicação: <span value='txtContraInd'> "+alimento.getContraIndicacao() +"</span> </label><br>"
                                                    + "<label>Ingredientes: <span value='txtDescricao'>"+alimento.getNomeIngrediente()+"</span> </label>"
                                                    + "<label>Quantidade de Produto em Estoque: <span value='txtContraInd'> "+produto.getEstoque()+"</span> </label><br>"
                                                            + "</div>");
                                }
                            %>
                        
                    </div>
                    
                </div>
                <hr>
                
                <h1 id="paginaP">Produtos Semelhantes</h1>
                <div class="table-responsive">
                 <table class="table" id="tabela_busca_meus_produtos" style="text-align: center;">
                    <thead class="thead-dark">
                    </thead>
                    <tbody>   
                        <%
                            List<Produto> lista = new ArrayList();
                            ProdutoDAO.getProdutos(lista, fornecedor.getId());
                            out.print("<tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto pro = lista.get(contador);
                                out.print("<td>"
                                        + "<img src='" + pro.getImagem() + "' width='100px' height='80px' ></td>");
                            }
                            out.print("</tr><tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto pro = lista.get(contador);
                                out.print("<td>"+pro.getNome()+"</td>");
                            }
                            out.print("</tr><tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto pro = lista.get(contador);
                                out.print("<td>R$"+pro.getPreco()+"</td>");
                            }
                            out.print("</tr><tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto pro = lista.get(contador);
                                out.print("<td><a href='../Controle?id=" + pro.getId() + "&action=comprar' <i 'id='comprar" + contador
                                        + "' class='fas fa-shopping-cart' style='font-size:22px;'></i></a></td>");
                            }

                        %>
                          </tbody>                
                </table>
                </div>
                </div>
     
            <script type="text/javascript" src="../js/PaginaProduto.js" charset="utf-8"></script>
      <%@include file="rodape.jsp"%>
    </body>
      
</html>
