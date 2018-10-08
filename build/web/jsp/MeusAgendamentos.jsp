<%@page import="dao.ProdutoDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="classes.Produto"%>
<%@page import="classes.Produto"%>
<%@page import="dao.FornecedorDAO"%>
<%@page import="classes.Fornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meus Agendamentos</title>
        <link rel="stylesheet" type="text/css" href="../css/MeusAgendamentos.css">    
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

    </head>
    <body id="tudo">
        <%@include file="cabecalho.jsp"%>

        <div class="container">
            <div class="row">
                <div id="overflow">
                    <img src="../ResourcesIm/logoSite.png" alt="" id="img" id="imagem">
                    <h6 id="easypet">EasyPet</h6>
                </div>
                <ul class="list-group" id="menulateraltodo">
                    <a href="Home.jsp">
                    <li class="list-group-item active" id="menulateral">Início</li>
                    </a>
                    <a href="Loja.jsp">
                    <li class="list-group-item active" id="menulateral">Produtos</li>
                    </a>
                    <a href="MeusAgendamentos.jsp">
                        <li class="list-group-item active" id="menulateral">Agendamentos</li>
                    </a>
                    <a href="MeusProdutos">
                        <li class="list-group-item active" id="menulateral">Pedidos</li>
                    </a>
                    <a href="#">
                        <li class="list-group-item active" id="menulateral">Avaliações</li>
                    </a>
                    <a href="#">
                        <li class="list-group-item active" id="menulateral">Configurações</li>
                    </a>
                </ul>





                <h6 id="tituloagendamentos">Meus agendamentos</h6>

                <div class="input-group mb-3" id="cabecalhoAgendamentos">
                    <input type="checkbox" aria-label="Checkbox for following text input" id="checkbox">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link active" id="itemCabecalho">N°</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemCabecalho">Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemCabecalho">PET</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemCabecalho">Serviço</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemCabecalho">Data</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemCabecalho">Ação</a>
                        </li>
                    </ul>
                </div>
                <div class="input-group mb-3" id="agendamento1">
                    <input type="checkbox" aria-label="Checkbox for following text input" id="checkbox">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link active" id="itemSelecionado">N°</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">PET</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Serviço</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Data</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Ação</a>
                        </li>
                    </ul>
                </div>
                <div class="input-group mb-3" id="agendamento2">
                    <input type="checkbox" aria-label="Checkbox for following text input" id="checkbox">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link active" id="itemSelecionado">N°</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">PET</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Serviço</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Data</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Ação</a>
                        </li>
                    </ul>
                </div>
                <div class="input-group mb-3" id="agendamento3">
                    <input type="checkbox" aria-label="Checkbox for following text input" id="checkbox">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link active" id="itemSelecionado">N°</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">PET</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Serviço</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Data</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Ação</a>
                        </li>
                    </ul>
                </div>
                <div class="input-group mb-3" id="agendamento4">
                    <input type="checkbox" aria-label="Checkbox for following text input" id="checkbox">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link active" id="itemSelecionado">N°</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">PET</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Serviço</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Data</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="itemSelecionado">Ação</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <br><br><br><br><br><%@include file="rodape.jsp"%>
    </body>
</html>
