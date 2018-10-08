
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% String status = request.getParameter("status");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhe Conosco</title>
        <link rel="stylesheet" type="text/css" href="../css/TrabalheConosco.css"> 

        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
    </head>
    <body id="tudo">
        <%@include file="cabecalho.jsp"%>

        <h3 class="cadastro">Trabalhe Conosco</h3>
        <div id="fotoprod" class="principalForm col-xs-6 col-sm-7 col-md-7">
            <div class="container">
                <form action="../TrabalheConoscoServlet" method="post" id="formulario">
                    <div id="faleConosco" class="principal col-xs-12 col-sm-6 col-md-6">
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" id="nome">
                                <label>Nome Completo</label>
                                <input type="text" name="nome" class="form-control" id="inputNomeTC">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" id="nome">
                                <label>Email</label>
                                <input type="text" name="email" class="form-control" id="inputEmailTC">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-6 col-md-6" id="telefone">
                                <div class="form-group ">
                                    <label>Telefone:</label>
                                    <input type="text" name="telefone" class="form-control" id="inputTelefoneTC">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" >
                                <!--     <label>Área de Interesse</label>
                                     <select class="form-control form-control-sm">
                                         <option>Selecione área desejada</option>
                                         <option>1</option>
                                         <option>2</option>
                                         <option>3</option>
                                         <option>4</option>
                                     </select>
                                -->
                                <label>Área de Interesse</label>
                                <input type="text" name="areaInteresse" class="form-control" id="inputAreaInteresse" maxlength="40">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" id="">
                                <label>Currículo</label>
                                <div class="custom-file " id="anexoEC">                                 
                                    <input type="file" name="file" id="file" class="custom-file-input mb-3" id="customFile" onchange="uploadFile()" >
                                    <label class="custom-file-label" for="customFile" style="color: gray;"></label>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-xs-12 col-sm-12 col-md-12" id="">
                                <div class="form-group " id="">
                                    <button type="button" id="btn_enviarEC" class=" btn2 btn btn-success float-right">Enviar</button>
                                </div>
                            </div>
                        </div>

                    </div>

                </form>
            </div>
        </div>
        <script type="text/javascript" src="../js/TrabalheConosco.js" charset="utf-8"></script>
        <script type="text/javascript" charset="utf-8">
            <% if (status != null) {%>
            if (window.addEventListener) {
                window.addEventListener('load', validaAlert());
            } else {
                window.attachEvent('onload', validaAlert());
            }
            function validaAlert() {

            <% if (status.equals("OK")) { %>
                alert("Email enviado com sucesso.\nAgradecemos o contato.");
            <%}%>
           
            }
            ;
            <%}%>
            
        </script>
        <%@include file="rodape.jsp"%>
    </body>
</html>
