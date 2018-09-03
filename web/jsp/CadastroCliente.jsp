
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRO CLIENTE</title>
        <link rel="stylesheet" type="text/css" href="../css/cadastroCliente.css">      
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
            <div id="cadastrar" class="principal col-xs-12 col-sm-9 col-md-9">

                <form action="../CadastroClienteServlet" method="post" id="formulario">
                    <h3 class="cadastro">Cadastro de Cliente</h3>
                    <div class="form-row">

                        <div class="form-group col-xs-12 col-sm-5 col-md-5" id="nome">
                            <label>Nome:</label>
                            <input type="text" name="nome" class="form-control" id="inputNome">
                        </div>
                        <div class="form-group col-xs-12 col-sm-6 col-md-6 " id="sNome">
                            <label>Sobrenome:</label>
                            <input type="text" name="sobrenome" class="form-control" id="inputSNome">
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-11 col-md-11" id="email">
                            <label>E-mail:</label>
                            <input type="text" name="email" class="form-control" id="inputEmail" placeholder="exemplo@hotmail.com">
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
                            <input type="password" name="confSenha" class="form-control" id="inputConfirmasenha">
                        </div>

                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-6 col-md-6" id="CPF">
                            <div class="form-group " id="cpf">
                                <label>CPF:</label>
                                <input type="text" name="cpf" class="form-control" id="inputCpf" maxlength="11"> 
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
                        <div class="form-group col-xs-12 col-sm-6    col-md-6" id="data">
                            <div class="form-group " id="data">
                                <label>Data:</label>
                                <input type="date" name="data" class="form-control" id="inputData">

                            </div>
                        </div>
                        <div class="form-group col-xs-12 col-sm-6    col-md-6" id="sexo">
                            <div class="form-group " id="sexo">
                                <label>sexo:</label>
                                <div class="custom-control custom-radio">
                                    <input type="radio" id="customRadio1" name="customRadio" class="custom-control-input" value="M">
                                    <label class="custom-control-label" for="customRadio1">Masculino</label>
                                </div>
                                <div class="custom-control custom-radio">
                                    <input type="radio" id="customRadio2" name="customRadio" class="custom-control-input" value="F">
                                    <label class="custom-control-label" for="customRadio2">Feminino</label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-xs-12 col-sm-5  col-md-5" id="cep">

                            <label>CEP:</label>
                            <div class="input-group">
                                <input type="text" name="cep" class="form-control col-xs-12 col-sm-8  col-md-8" id="inputCep">
                            </div>
                        </div>
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
                            <input type="text" name="numero" class="form-control" id="inputNumero" maxlength="10">
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
                    <button type="button" id="Cadastrar" class=" btn2 btn btn-success">Enviar</button>
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
        <script type="text/javascript" src="../js/cadastroCliente.js"></script>        
    </body>

</html>
