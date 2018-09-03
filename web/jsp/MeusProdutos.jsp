<%-- 
    Document   : MeusProdutos
    Created on : 01/09/2018, 00:41:36
    Author     : AsColaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <%@include file="cabecalho.jsp"%>
        <div class="container">
            <div id="petlogo" class="principal2  col-xs-12 col-sm-4 col-md-4">
                <h4>Nome PetShop</h4>
                <img id="fotopet" src="../ResourcesIm/logoSite.png" width="88px">
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
            </div>
            <hr>
            <div>
                <div class="filtro-meus-produtos">
                    <h2 >Categoria e Marcas</h2>
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
                    <label>
                        <input type="checkbox" value="">
                        Marca 1
                    </label>
                    <label>
                        <input type="checkbox" value="">
                        Marca 2
                    </label>
                    <label>
                        <input type="checkbox" value="">
                        Marca 3
                    </label>
                    <label>
                        <input type="checkbox" value="">
                        Marca 4
                    </label>
                    <!--<button type="button" class="btn btn-primary">Cadastrar Produto</button>-->
                </div>
            </div>
            <hr>
            <br>
           
            <table class="table" id="tabela_busca_meus_produtos">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">Imagem</th>
                        <th scope="col">Nome do Produto</th>
                        <th scope="col">Estoque</th>
                        <th scope="col">Preço Original</th>
                        <th scope="col">Preço Promocional</th>
                        <th colspan="3">Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row"><img src="../ResourcesIm/logoSite.png" width="100px"></th>
                        <td>Osso</td>
                        <td>6</td>
                        <td>7,00</td>
                        <td>5,00</td>
                        <td><i id="excluirProd" class="fas fa-trash-alt" font-size="16"></i></td>
                        <td><i id="editarProd" class="far fa-edit"></i></td>
                    </tr>
                    <tr>
                        <th scope="row"><img src="../ResourcesIm/logoSite.png" width="100px"></th>
                        <td>Ração</td>
                        <td>3</td>
                        <td>60,00</td>
                        <td>50,00</td>
                        <td><i id="excluirProd" class="fas fa-trash-alt" font-size="16"></i></td>
                        <td><i id="editarProd" class="far fa-edit"></i></td>
                    </tr>
                    <tr>
                        <th scope="row"><img src="../ResourcesIm/logoSite.png" width="100px"></th>
                        <td>coleira</td>
                        <td>2</td>
                        <td>15,00</td>
                        <td>12,00</td>
                        <td><i id="excluirProd" class="fas fa-trash-alt" font-size="16"></i></td>
                        <td><i id="editarProd" class="far fa-edit"></i></td>
                    </tr>
                </tbody>
            </table>
            <br>

        </div> 
        <%@include file="rodape.jsp"%>
    </body>
</html>
