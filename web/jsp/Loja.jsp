<%@page import="dao.ProdutoDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="classes.Produto"%>
<%@page import="classes.Produto"%>
<%@page import="dao.FornecedorDAO"%>
<%@page import="classes.Fornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id = 0;
    String nome = "";
    String descricao = "";
    String inicio = "";
    String termino = "";
    String foto="";

    for (Cookie cookie : request.getCookies()) {
        if (cookie.getName().equals("idFornecedor")) {
            id = Integer.parseInt(cookie.getValue());

        }
        Fornecedor novo = FornecedorDAO.getFornecedor(id);
        nome = novo.getNome();
        descricao = novo.getDescricao();
        inicio = novo.getInicio();
        termino = novo.getTermino();
        foto = novo.getImagem();

    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loja</title>
        <link rel="stylesheet" type="text/css" href="../css/Loja.css">    
        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>



        <script>
            $(function () {
                $("#tabs").tabs();
            });
        </script>
    </head>
    <body id="tudo">
        <%@include file="cabecalho.jsp"%>
        <div class="container" id="quemSomos">
            <h1 class="titulo"> <%= nome%></h1>
            <div class="row">
                <div class="col-md-4 col-sm-8">
                    <div class="text-center">
                        <img src="<%= foto%>" class="img-fluid" alt="Imagem responsiva" id="imagem">
                    </div>

                </div>
                <div class="col-md-6 col-sm-12">
                    <h6 id="tituloDescricaodaLoja">Descrição da Loja/Propaganda</h6>
                    <div id="texto">
                        <p>
                            <%= descricao%>
                        </p>                

                        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
                        <div class="estrelas" id="avaliacao"> <h6>Avaliação</h6>
                            <input type="radio" id="cm_star-empty" name="fb" value="" checked/>
                            <label for="cm_star-1"><i class="fa"></i></label>
                            <input type="radio" id="cm_star-1" name="fb" value="1"/>
                            <label for="cm_star-2"><i class="fa"></i></label>
                            <input type="radio" id="cm_star-2" name="fb" value="2"/>
                            <label for="cm_star-3"><i class="fa"></i></label>
                            <input type="radio" id="cm_star-3" name="fb" value="3"/>
                            <label for="cm_star-4"><i class="fa"></i></label>
                            <input type="radio" id="cm_star-4" name="fb" value="4"/>
                            <label for="cm_star-5"><i class="fa"></i></label>
                            <input type="radio" id="cm_star-5" name="fb" value="5"/>

                            <div id="hAtendimento">

                                <h6>Horário de Atendimento</h6>
                                <p>seg a sex das <%= inicio%> às <%= termino%></p>    
                            </div>

                        </div>

                    </div>
                </div>              
            </div>

            <div id="tabs">
                <ul>
                    <li><a href="#tabs-1">Produtos</a></li>
                    <li><a href="#tabs-2">Serviços</a></li>

                </ul>
                <div id="tabs-1">
                    <div id="caixaPromocoes">

                        <%
                            List<Produto> lista = new ArrayList();
                            ProdutoDAO.getProdutos(lista, id);
                            for (int contador = 0; contador < lista.size(); contador++) {
                                Produto produto = lista.get(contador);
                        %>

                        <div id="produto">
                            <img src="../ImagemProduto/pote.JPEG" width="100px" height="100px" id="imagemProduto2">
                            

                                <p id="descricaoProduto2">

                                    <%= produto.getDescricao()%> 

                                    <a href="url" id="adcCarrinho">Adicionar ao carrinho</a><br>
                                </p>
                                <strong>R$<%= produto.getPreco()%>.</strong>

                        </div>
                        <% }%>
                    </div>

                    <a href="MeusProdutos.jsp" id="link" >Acessar página de produtos</a>    
                </div>

                <div id="tabs-2">

                    <div id="caixaServicos">                        
                        <div id="bordaProduto2">
                            <div id="nomeServico">Nome Serviço</div>
                            <p id="descricaoServicos">
                                Descrição do serviço
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                            </p>
                            <div id="valorServico">R$50</div>
                            <a href="url" id="linkHorario">Ver horários de agendamento</a> 
                        </div>
                        <div id="bordaProduto2">
                            <div id="nomeServico">Nome Serviço</div>
                            <p id="descricaoServicos">
                                Descrição do serviço
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                            </p>
                            <div id="valorServico">R$50</div>
                            <a href="url" id="linkHorario">Ver horários de agendamento</a> 
                        </div>
                        
                    </div>
                       
                </div>
            </div>

        </div>
        <br><br><br><br><br><%@include file="rodape.jsp"%>
    </body>
</html>
