<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>CADASTRO FORNECEDOR</title>

        <link rel="stylesheet" type="text/css" href="../css/cadastroFornecedor.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
              crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>

    </head>
    <body>
        <nav class="navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-5">           
            <div class="logo">
                <h3 >EasyPet</h3>
                <img src="../ResourcesIm/logoSite.png" width="88px"/>    
            </div>
        </nav>

        <div class="container">
            <div id="cadastrar" class="principal col-xs-12 col-sm-12 col-md-12">
                <form action="../CadastroFornecedorServlet" method="post" id="formulario">
                    <h3 class="cadastro">Cadastro de Fornecedor</h3>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-5 col-md-5" id="nome">
                            <label>Nome Fantasia:</label>
                            <input type="text" name="nome" class="form-control" id="inputNome">
                        </div>
                        <div class="form-group col-xs-12 col-sm-6 col-md-6 " id="razaoSocial">
                            <label>Razão Social:</label>
                            <input type="text" name="razaoSocial" class="form-control" id="inputRazaoSocial">
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-11 col-md-11" id="email">
                            <label>E-mail:</label>
                            <input type="text" name="email" class="form-control" id="inputEmail">
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-11 col-md-11" id="senha">
                            <label>Senha:</label>
                            <div class="input-group mb-3">

                                <input type="password" name="senha" class="form-control" id="inputSenha">
                                <button type="button" id="btn-modal-senha" class="btn btn-outline-dark">?</button>

                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-10 col-md-10" id="confSenha">
                            <label>Confirma a Senha:</label>
                            <input type="password" name="confSenha" class="form-control" id="inputConfsenha">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-6 col-md-6" id="CNPJ">
                            <div class="form-group " id="cnpj">
                                <label>CNPJ:</label>
                                <input type="text" name="cnpj" class="form-control" id="inputCnpj">
                            </div>
                        </div>
                        <div class="form-group col-xs-12 col-sm-6    col-md-6" id="telefone">
                            <div class="form-group " id="cpf">
                                <label>Telefone:</label>
                                <input type="text" name="telefone" class="form-control" id="inputTelefone">

                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-3   col-md-3" id="data">
                            <div class="form-group " id="data">
                                <label>Data de abertura:</label>
                                <input type="date" name="data" class="form-control" id="inputData">
                            </div>
                        </div>
                        <div class="form-group col-xs-12 col-sm-8    col-md-8" id="CEP">
                            <div class="form-group col-xs-12 col-sm-5  col-md-5" id="cep">
                                <label>CEP:</label>
                                <div class="input-group">
                                    <input type="text" name="cep" class="form-control col-xs-12 col-sm-8  col-md-8" id="inputCep">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-7  col-md-7" id="endereco">
                            <div class="form-group " id="endereco">
                                <label>Endereço:</label>
                                <input type="text" name="endereco" class="form-control" id="inputEndereco">
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-3 col-md-3" id="numero">
                            <label>Numero:</label>
                            <input type="text" name="numero" class="form-control" id="inputNumero">
                        </div>
                        <div class="form-group col-xs-12 col-sm-7   col-md-7" id="complemento">
                            <label>Complemento:</label>
                            <input type="text" name="complemento" class="form-control" id="inputComplemento">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-6 col-md-6" id="bairro">
                            <label>Bairro:</label>
                            <input type="text" name="bairro" class="form-control" id="inputBairro">
                        </div>
                        <div class="form-group col-xs-12 col-sm-6 col-md-6" id="cidade">
                            <label>Cidade:</label>
                            <input type="text" name="cidade" class="form-control" id="inputCidade">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Aceitos os Termos de Uso </label>
                            <button type="button" id="btn-termos-uso" class="btn btn-outline-dark">?</button>
                        </div>
                    </div>
                    <button type="button" id="CadastrarFornecedor" class=" btn2 btn btn-success">Cadastrar</button>
                </form>


                <!-- The Modal -->
                <div id="modalSenha" class="modal">
                    <!-- Modal content -->
                    <div class="modal-content">
                        <span class="close">&times;</span>
                        <p>A senha deverá conter no mínimo 8 caracteres</p>
                    </div>
                </div>

                <!-- The Modal -->
                <div id="modalTermos" class="modal">
                    <!-- Modal content -->
                    <div class="modal-content">
                        <span class="close">&times;</span>
                        <p>Termos de uso</p>
                    </div>
                </div>

            </div>
        </div>

        <script type="text/javascript" src="../js/cadastroFornecedor.js"></script>
    </body>

</html>
