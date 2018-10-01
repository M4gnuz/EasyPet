<%@page import="dao.FornecedorDAO"%>
<%@page import="classes.Fornecedor"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="java.util.List"%>
<%@page import="classes.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loja</title>
        <link rel="stylesheet" type="text/css" href="../css/PaginadeProdutos2.css">    
        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalhoCliente.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <script> var $range = document.querySelector('input'),
                    $value = document.querySelector('span');
            $range.addEventListener('input', function() {
            $value.textContent = this.value;
            })" </script>
    </head>

    <body id="tudo">
        <%@include file="CabecalhoCliente.jsp"%>
        <div class="container" id="quemSomos">
            <div class="row">


                <div id="divBusca">
                    <input type="text" id="txtBusca" placeholder="Buscar..."/>
                    <button id="btnBusca">Buscar</button>
                </div>
                <div style="width:700px">
                </div>
                <div class="col-xs-6 col-sm-4 col-md-4">
                    <h6>Categoria</h6>
                    <div>
                        <input type="checkbox" name="fb" value="caes"/>
                        <label for="scales">Cães</label>
                    </div>

                    <div>
                        <input type="checkbox" name="fb" value="gatos"/>
                        <label for="scales">Gatos</label>
                    </div>
                    <div>
                        <input type="checkbox" name="fb" value="aves"/>
                        <label for="scales">Aves</label>
                    </div>
                    <div>
                        <input type="checkbox" name="fb" value="peixes"/>            
                        <label for="scales">Peixes</label>
                    </div>

                    <h6>Porte</h6>
                    <div>
                        <input type="checkbox" name="fb" value="pequeno"/>
                        <label for="scales">Pequeno</label>
                    </div>
                    <div>
                        <input type="checkbox" name="fb" value="medio"/>
                        <label for="scales">Médio</label>
                    </div>
                    <div>
                        <input type="checkbox" name="fb" value="grande"/>            
                        <label for="scales">Grande</label>
                    </div>

                    <h6>Idade</h6>
                    <div>
                        <input type="checkbox" name="fb" value="filhote"/>
                        <label for="scales">Filhote</label>
                    </div>
                    <div>
                        <input type="checkbox" name="fb" value="adulto"/>
                        <label for="scales">Adulto</label>
                    </div>
                    <div>
                        <input type="checkbox" name="fb" value="senior"/>                       
                        <label for="scales">Senior</label>
                    </div>

                    <div id="divPreco"><label for="customRange1" id="customRange1Preco" value='50' max='100'>Preço</label>
                        <input type="range" class="custom-range" id="customRange1">
                    </div>



                    <div class="w-100"></div>
                </div>
                <div class="col-xs-8 col-sm-8 col-md-8" style="overflow-x: scroll;">
                    
                    <table class="table" id="tabela_busca_meus_produtos" style="text-align: center">
                    
                    <tbody>          
                        <%
                            
                            
                            List<Produto> lista = new ArrayList();
                            
                            ProdutoDAO.getAllProdutos(lista);
                            out.print("<tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto produto = lista.get(contador);
                                out.print("<td>"
                                        + "<img src='" + produto.getImagem() + "' width='100px' height='80px' ></td>");
                            }
                            out.print("</tr><tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto produto = lista.get(contador);
                                out.print("<td>"+produto.getNome()+"</td>");
                            }
                            out.print("</tr><tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto produto = lista.get(contador);
                                out.print("<td>R$"+produto.getPreco()+"</td>");
                            }
                            out.print("</tr><tr>");
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto produto = lista.get(contador);
                                out.print("<td><a href='../Controle?id=" + produto.getId() + "&action=comprar' <i 'id='comprar" + contador
                                        + "' class='fas fa-shopping-cart' style='font-size:22px;'></i></a></td>");
                            }
                        %>

                    </tbody>                
                </table>
                </div>
                
            </div>
            
        </div>
        <br><br><br><br><br><%@include file="rodape.jsp"%>
    </body>
</html>
