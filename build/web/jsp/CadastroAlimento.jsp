
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Produto Alimenticio</title>
        <link rel="stylesheet" type="text/css" href="../css/cadastroAlimento.css">  
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link rel="stylesheet" type="text/css" href="../css/menuLateral.css"> 
        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="../Source Files/maskMoney.jquery.json"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js"></script>
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
                <h1 id="nomeTopo"> Produto Alimenticio</h1>
            </div>

        </div>

        <%@include file="menuLateral.jsp"%>

        <form action="../CadastroAlimentoServlet" method="post" id="formAlimento">
            <div id="fotoprod" class="principal col-xs-12 col-sm-6 col-md-6">
                <h4>Fotos do seu produto</h4>

                <div class="custom-file" id="anexo">
                    <input type="file" class="custom-file-input mb-3" id="customFile">
                    <label class="custom-file-label" for="customFile">Enviar Fotos</label>

                </div>
                <hr>
                <div class="form-group col-xs-12 col-sm-8 col-md-8" id="titulop">
                    <label>Titulo do Produto: *</label>
                    <input type="text" name="titulo" class="form-control" id="inputTitulo">
                </div>


                <div class="form-group col-xs-12 col-sm-10 col-md-10" id="descri">
                    <label for="exampleFormControlTextarea1">Descrição</label>
                    <textarea class="form-control" name="descricao" id="txtdescricao" rows="4"></textarea>
                </div>
                <div class="form-group col-xs-12 col-sm-10 col-md-10" id="contraindicacao">
                    <label for="exampleFormControlTextarea1">Contra-Indicação</label>
                    <textarea class="form-control" name="contra" id="txtcontrain" rows="3"></textarea>
                    <h4>Ingredientes</h4>


                    <!-- PESQUISAR JQUERY CLONE PARA ESSA FUNÇÃO// OU ARRAY METODO POST -->


                    <div class="col-xs-12 col-sm-12 col-md-12 row">
                        <div class="     col-xs-12 col-sm-6 col-md-6" id="nome">
                            <label>Nome: </label>
                            <input type="text" name="nome" class="form-control" id="inputNomeP">
                        </div>
                        <div class="     col-xs-12 col-sm-3 col-md-3" id="nome">
                            <label>Quantidade: </label>
                            <input type="text" name="qtd" class="form-control" id="inputqtd">
                        </div>

                    </div>

                    <a link href=""><h6 id="add">Adicionar Ingredientes</h6> </a>
                    <hr>

                    <div class="row">
                        <div class="form-group col-xs-12 col-sm-3    col-md-3" id="precoA">
                            <div class="form-group " id="preco">
                                <label class="fonte">Preço: *</label>
                                <input type="text" name="precoA" class="form-control" id="inputPrecoA">

                            </div>
                        </div>
                        <div class="form-group col-xs-12 col-sm-2    col-md-2" id="estoqueA">
                            <div class=" form-group " id="estoque">
                                <label class="fonte">Estoque:*</label>
                                <input type="number" name="estoque" class="form-control" id="inputEstoqueA">

                            </div>
                        </div>
                        <div class="form-group col-xs-12 col-sm-4    col-md-4" id="dataV">
                            <div class="form-group " id="data">
                                <label class="fonte"> Data Vencimento:*</label>
                                <input type="date" name="dataV" class="form-control" id="inputDataV">

                            </div>
                        </div>

                        <div class=" form-group col-xs-12 col-sm-3 col-md-3">
                            <div class=" form-group ">
                                <label class="fonte">Categorias: *</label>
                                <select class="custom-select" name="categoria" id="inputGroupSelect02">
                                    <option selected>--</option>
                                    <option value="1">Alimentos</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <button type="submit" id="anunciar_alimento" class=" btn2 btn btn-success">Anunciar</button>
            </div>
        </form>   
        <%@include file="rodape.jsp"%>	
        <script type="text/javascript" src="../js/cadastroAlimento.js"></script>   
    </body>
</html>
