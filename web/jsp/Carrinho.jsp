<%@page import="dao.FornecedorDAO"%>
<%@page import="classes.Fornecedor"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<% String validacao = request.getParameter("status");%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrinho</title>
        <link rel="stylesheet" type="text/css" href="../css/carrinho.css">  
        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link href="../Plugins/css/main.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js"></script>

    </head>
    <body id="tudo" class="paginaCarrinho">

        <%@include file="CabecalhoCliente.jsp"%>
        <div class="row" >
            <div class="col-xs-12 col-sm-1 col-md-1"></div>
            <div id="conteudoCarrinho" class="col-xs-12 col-sm-10 col-md-10">
                <div class="table-responsive cart_info">
                    <table class="table table-condensed">
                        <thead>
                            <tr class="cart_menu">
                                <td class="image">Produto</td>
                                <td class="description">Descrição</td>
                                <td class="price">Preço</td>
                                <td class="quantity">Quantidade</td>
                                <td class="total">Total</td>
                                <td>Remover</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="cart_product">
                                    <a href=""><img src="../ResourcesIm/logoSite.png" alt="" width="100" height="80"></a>
                                </td>
                                <td class="cart_description">
                                    <h6>Nome do Produto</h6>
                                    <p>Descrição do produto ba bla bla bla</p>
                                </td>
                                <td class="cart_price">
                                    <p>50,00</p>
                                </td>
                                <td class="cart_quantity">
                                    <div class="cart_quantity_button">
                                        <a class="cart_quantity_up" href=""> + </a>
                                        <input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
                                        <a class="cart_quantity_down" href=""> - </a>
                                    </div>
                                </td>
                                <td class="cart_total">
                                    <p class="cart_total_price">50,00</p>
                                </td>
                                <td class="cart_delete">
                                    <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
                                </td>
                            </tr>

                            <tr>
                                <td class="cart_product">
                                    <a href=""><img src="../ResourcesIm/logoSite.png" alt="" width="100" height="80"></a>
                                </td>
                                <td class="cart_description">
                                    <h6>Nome do Produto</h6>
                                    <p>Descrição do produto ba bla bla bla</p>
                                </td>
                                <td class="cart_price">
                                    <p>120,00</p>
                                </td>
                                <td class="cart_quantity">
                                    <div class="cart_quantity_button">
                                        <a class="cart_quantity_up" href=""> + </a>
                                        <input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
                                        <a class="cart_quantity_down" href=""> - </a>
                                    </div>
                                </td>
                                <td class="cart_total">
                                    <p class="cart_total_price">120,00</p>
                                </td>
                                <td class="cart_delete">
                                    <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td class="cart_product">
                                    <a href=""><img src="../ResourcesIm/logoSite.png" alt="" width="100" height="80"></a>
                                </td>
                                <td class="cart_description">
                                    <h6>Nome do Produto</h6>
                                    <p>Descrição do produto ba bla bla bla</p>
                                </td>
                                <td class="cart_price">
                                    <p>10,00</p>
                                </td>
                                <td class="cart_quantity">
                                    <div class="cart_quantity_button">
                                        <a class="cart_quantity_up" href=""> + </a>
                                        <input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
                                        <a class="cart_quantity_down" href=""> - </a>
                                    </div>
                                </td>
                                <td class="cart_total">
                                    <p class="cart_total_price">10,00</p>
                                </td>
                                <td class="cart_delete">
                                    <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4">&nbsp;</td>
                                <td colspan="2">
                                    <table id="resumoValor"  class="table table-condensed total-result">
                                        <tr style="border-bottom: 1px solid #C2C2C1;">
                                            <td colspan="2">Resumo</td>
                                        </tr>
                                        <tr>
                                            <td>Valor Frete</td>
                                            <td>20,00</td>
                                        </tr>
                                        <tr>
                                            <td>Valor Total</td>
                                            <td>200,00</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
        <div class="row">      

            <div class="form-group col-xs-10 col-sm-10 col-md-12">
                <button type="button" name="opcao" id="finalizar" class=" btn2 btn btn-success float-right" value="salvar">Finalizar</button>
                <button type="button" name="opcao" id="paginaProdutos" class=" btn2 btn btn-cancel float-right " value="voltar">Voltar a comprar</button>
            </div> 
            <div class="form-group col-xs-2 col-sm-2 col-md-2">
            </div>  
        </div>


        <%@include file="rodape.jsp"%>
        <script type="text/javascript" src="../js/" charset="utf-8"></script>
        <script type="text/javascript">

        </script>       
    </body>
</html>
