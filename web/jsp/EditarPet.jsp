
<%@page import="dao.PetDAO"%>
<%@page import="classes.Pet"%>
<!DOCTYPE html>
<% String idPet = request.getParameter("id"); 
Pet pet = new Pet();

PetDAO.getPet(pet, Integer.parseInt(idPet));

%>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Pet</title>
        <link rel="stylesheet" type="text/css" href="../css/cadastroAlimento.css">
        <link rel="stylesheet" href="../Source Files/jquery-ui.min.css">
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link rel="stylesheet" type="text/css" href="../css/menuLateral.css"> 
        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="../Source Files/maskMoney.jquery.json"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js"></script>
        <script src="../Source Files/jquery-ui.min.js"></script>
    </head>
    <body id="tudo">

        <%@include file="CabecalhoCliente.jsp"%>

        <div class="container">

            <div id="petlogo" class="principal2  col-xs-12 col-sm-4 col-md-4">
                <h4>Nome do cliente</h4>
            </div>

        </div>
        <div class="container">

            <div id="logocentral" class="principal2 col-xs-12 col-sm-7 col-md-7">
                <h1 id="nomeTopo">Editar um PET</h1>
            </div>

        </div>

        <%@include file="menuLateral.jsp"%>

        <form action="../" method="post" id="formPet">
            <div id="fotoprod" class="principal col-xs-12 col-sm-6 col-md-6">
                <hr>
                <div class="row">

                    <div class="form-group col-xs-12 col-sm-7 col-md-7" id="titulop">
                        <label>Nome do Pet: *</label>
                        <input type="text" name="titulo" <%out.print("value='"+pet.getNome() +"'"); %>class="form-control" id="inputNomePet">
                    </div>
                        <div class="form-group col-xs-12 col-sm-1 col-md-1" id="titulop">
                                <!--Espacamento-->
                        </div>
                    <div class="form-group col-xs-12 col-sm-4 col-md-4" id="dataV">
                        <div class="form-group " id="data">
                            <label class="fonte"> Data de Nascimento:*</label>
                            <input type="text" name="dataV"  <%out.print("value='"+pet.getDtNascimento()+"'"); %> class="form-control" id="inputDataV">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-xs-12 col-sm-4 col-md-4" id="optionTipo">
                        <label class="fonte">Tipo *</label>
                        <select class="custom-select" name="categoria" id="inputGroupSelectTipo">
                            <option selected>--</option>
                            <option value="Cães">Cães</option>
                            <option value="Gatos">Gatos</option>
                            <option value="Pássaros">Pássaros</option>
                            <option value="Hamsters">Hamsters</option>
                        </select>
                    </div>
                    <div class="form-group col-xs-12 col-sm-4 col-md-4" id="optionPorte">
                        <label class="fonte">Porte *</label>
                        <select class="custom-select" name="categoria" id="inputGroupSelectPorte">
                            <option selected>--</option>
                            <option value="Pequeno">Pequeno</option>
                            <option value="Médio">Médio</option>
                            <option value="Grande">Grande</option>
                        </select>
                    </div>
                    <div class="form-group col-xs-12 col-sm-4 col-md-4">
                        <div class="form-group " id="data">
                            <label>Raça:</label>
                            <input type="text" name="data"  <%out.print("value='"+pet.getRaca()+"'"); %> class="form-control" id="inputRaca">
                        </div>
                    </div>
                </div>
                <div class="form-group col-xs-12 col-sm-12 col-md-12" id="descri">
                    <label for="exampleFormControlTextarea1">Observações</label>
                    <textarea class="form-control" name="observacao"  <%out.print("value='"+pet.getObs()+"'"); %>
                              id="inputObservacao" rows="4"  maxlength="270" placeholder="Descreva umas observações importantes do seu PET com até 270 caracteres."></textarea>
                </div>

                    <hr>

                <div class="row">                       
                    <div class="form-group col-xs-12 col-sm-12 col-md-12">
                        <button type="button" name="opcao" id="salvar_pet" class=" btn2 btn btn-success float-right " value="salvar">Salvar</button>
                        <button type="button" name="opcao" id="cancelarCadPet" class=" btn2 btn btn-cancel float-right" value="cancelar">Cancelar</button>
                    </div> 

                    <!-- <a href="MeusProdutos.jsp" class="btn2 btn btn-success">Cancelar</a>-->
                </div>
            </div>
        </form>   
        <%@include file="rodape.jsp"%>	
        <script type="text/javascript" src="../js/cadastrarPet.js" charset="utf-8"></script> 
  
    </body>
</html>
