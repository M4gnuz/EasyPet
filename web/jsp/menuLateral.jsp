<%-- 
    Document   : menuLateral
    Created on : 31/08/2018, 20:54:09
    Author     : logonlb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" id="caixa1">
            <div class="principal col-xs-12 col-sm-4 col-md-4">
                <div id="accordion">
                    <div class="card" id="cardhome">
                        <div class="card-header" id=" headingOne">
                            <h5 class="mb-0">
                                <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="False" aria-controls="collapseOne"
                                        onclick="window.location.href = 'Home.html'">
                                    Home
                                </button>
                            </h5>
                        </div>
                        <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                        </div>
                    </div>
                    <div class="card" id="cardProduto">
                        <div class="card-header" id="headingTwo">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    Produtos
                                </button>
                            </h5>
                        </div>
                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                            <div class="card-body">
                                <ul>
                                    <li>
                                        <a id="click" link href="CadastroAlimento.jsp">Novo Produto Alimenticio </a>
                                    </li>
                                    <li>
                                        <a id="click" link href="CadastroAcessorio.jsp">Novo  Produto Acessorio </a>
                                    </li>
                                    <li>
                                        <a link href=""> Gerenciar Produtos</a>
                                    </li>
                                    <li>
                                        <a link href=""> Categorias</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="card" id="cardAgendamento">
                        <div class="card-header" id="headingThree">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    Agendamento
                                </button>
                            </h5>
                        </div>
                    </div>
                    <div class="card" id="cardPedido">
                        <div class="card-header" id="headingThree">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    Pedidos
                                </button>
                            </h5>
                        </div>
                    </div>
                    <div class="card" id="cardAval">
                        <div class="card-header" id="headingThree">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    Avaliações
                                </button>
                            </h5>
                        </div>

                    </div>
                    <div class="card" id="cardconfig">
                        <div class="card-header" id="headingThree">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    Configurações
                                </button>
                            </h5>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
