<%-- 
    Document   : MeusProdutos
    Created on : 01/09/2018, 00:41:36
    Author     : AsColaco
--%>


<%@page import="classes.Fornecedor"%>
<%@page import="dao.FornecedorDAO"%>
<%@page import="java.util.List"%>
<%@page import="classes.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="dao.AlimentoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.Cookie;"%>
<%@page import="servlet.Controle"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<%! int contador = 0;%>
<!DOCTYPE html>
<html>
    <head>       

        <meta name="viewport" content="width=device-width, initial-scale=1">    
        <title>Meus Produtos</title>

        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/menuLateral.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css">  
        <link rel="stylesheet" type="text/css" href="../css/meusProdutos.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <title>Meus Produtos</title>


    </head>
    <body id="tudo">

        <%
            int id = 0;
            String nome = "";
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idFornecedor")) {
                    id = Integer.parseInt(cookie.getValue());

                }
                Fornecedor novo = FornecedorDAO.getFornecedor(id);
                nome = novo.getNome();
            }
        %>

        <%@include file="cabecalho.jsp"%>

        <div class="container">
            <div id="petlogo" class="principal2  col-xs-12 col-sm-4 col-md-4">
                <h4><%=nome%></h4>

            </div>
        </div>

        <div class="container">
            <div id="logocentral" class="principal2 col-xs-12 col-sm-8 col-md-8">
                <h1 id="nomeTopo">Meus Produtos</h1>
            </div>
        </div>

        <%@include file="menuLateral.jsp"%>

        <div class="principal col-xs-12 col-sm-6 col-md-6">
            <label>Pesquisar pelo nome do produto</label>
            <div class="form-group input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
                <input name="consulta" id="txt_consulta" placeholder="Consultar" type="text" class="form-control">
                <input type="button" id="btnConsulta" value="Consultar">
            </div>
            <hr>
            <div>
                <div class="col-md-8">
                    <div class="filtro-meus-produtos">
                        <h2>Categoria </h2>
                    </div>    

                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="">
                            Rações
                        </label>
                        <label>
                            <input type="checkbox" value="">
                            Brinquedos
                        </label>
                        <label>
                            <input type="checkbox" value="">
                            Higiene
                        </label>
                        <label>
                            <input type="checkbox" value="">
                            Acessórios
                        </label>

                        <!--<button type="button" class="btn btn-primary">Cadastrar Produto</button>-->
                    </div>
                </div>
                <div class="col-md-4" >
                    <select class="form-control form-control-sm">
                        <option>Ordenar</option>
                        <option>Menor Preço</option>
                        <option>Maior Preço</option>
                        <option>Nome (a-z)</option>
                        <option>Nome (z-a)</option>
                    </select>
                </div>

            </div>
            <hr>
            <br>

            <table class="table" id="tabela_busca_meus_produtos">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">Imagem</th>
                        <th scope="col">ID</th>
                        <th scope="col">Nome do Produto</th>
                        <th scope="col">Estoque</th>
                        <th scope="col">Preço</th>
                        <th colspan="3">Ações</th>
                    </tr>
                </thead>
                <tbody>                    
                    <%
                        List<Produto> lista = new ArrayList();
                        for (Cookie cookie : request.getCookies()) {
                            if (cookie.getName().equals("idFornecedor")) {
                                id = Integer.parseInt(cookie.getValue());
                            }
                        }
                        ProdutoDAO.getProdutos(lista, id, 0);
                        for (int contador = 0; contador < lista.size(); contador++) {
                            Produto produto = lista.get(contador);
                            out.print("<tr>"
                                    + "<th scope='row'><img src='../ResourcesIm/logoSite.png' width='100px'></th>"
                                    + "<td>" + produto.getId() + "</td>"
                                    + "<td>" + produto.getNome() + "</td>"
                                    + "<td>" + produto.getEstoque() + "</td>"
                                    + "<td>" + produto.getPreco() + "</td>"
                                    + "<td><a href='../Controle?id=" + produto.getId() + "&action=del 'id='excluirProd" + contador
                                    + "' name='botoes' class='fas fa-trash-alt' style='font-size:22px;'</a></td>"
                                    + "<td><a href='../Controle?id=" + produto.getId() + "&action=alt' <i 'id='editarProd" + contador
                                    + "' class='far fa-edit' style='font-size:22px;'></i></a></td>"
                                    + "</tr>");
                        }
                    %>

                </tbody>                
            </table>
            <br>

        </div> 
        <%@include file="rodape.jsp"%>      

        <script type="text/javascript">
            window.onload = function () {
                document.getElementById("btnConsulta").onclick = function () {
                    alert("PORRA");

            <%

            %>
                };
            };

        </script>
    </body>
</html>
