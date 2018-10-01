
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhe Conosco</title>
        <link rel="stylesheet" type="text/css" href="../css/TrabalheConosco.css"> 

        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
    </head>
    <body id="tudo">
        <%@include file="cabecalho.jsp"%>


        <h3 class="cadastro">Trabalhe Conosco</h3>
        <div id="fotoprod" class="principalForm col-xs-6 col-sm-6 col-md-7">
            <div class="container">

                <div id="faleConosco" class="principal col-xs-125 col-sm-5 col-md-5">
                    <form action="../CadastroFornecedorServlet" method="post" id="formulario">

                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" id="nome">
                                <label>Nome Completo</label>
                                <input type="text" name="nome" class="form-control" id="inputNomeCompleto">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" id="nome">
                                <label>Email</label>
                                <input type="text" name="nome" class="form-control" id="inputNome">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-6 col-md-8" id="telefone">
                                <div class="form-group " id="cpf">
                                    <label>Telefone:</label>
                                    <input type="text" name="telefone" class="form-control" id="inputTelefone">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-8 col-md-8" >
                                <label>Área de Interesse</label>
                                <select class="form-control form-control-sm">
                                    <option>Selecione área desejada</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                </select>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <h4 class="tituloEC">Currículo</h4>
            <form action="../CadastroProdutoServlet" method="post" id="formAcessorio">
                <div id="fotoprod" class="principalEC col-xs-12 col-sm-6 col-md-6">
                    <div class="custom-file" id="anexoEC">
                        <input type="file" name="imagem" class="custom-file-input mb-3" id="customFile" onchange="uploadFile()">
                        <label class="custom-file-label" for="customFile">Enviar </label>
                    </div>
                </div>
                <div id="" class=" col-xs-12 col-sm-12 col-md-10">
                    <div class="form-group col-xs-12 col-sm-8 col-md-8">
                        <button type="button" id="btn_enviarEC" class="btn2 btn btn-success float-right p-1 mb-1 bg-transparent text-white">Enviar</button>
                    </div>
                </div>
            </form>


        </div>
    </div>

    <%@include file="rodape.jsp"%>
</body>
</html>
