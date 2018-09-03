<%-- 
    Document   : cabecalho
    Created on : 31/08/2018, 20:37:11
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

    <nav id="nav-principal" class="navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-5">
        <div class="logo">
            <h3>EasyPet</h3>
            <img src="../ResourcesIm/logoSite.png" width="88px">
           
        </div>
        <div class="btn-toolbar mb-3" role="toolbar" aria-label="Toolbar with button groups">
            <div class="btn-group mr-2" role="group" aria-label="First group">
                <button type="button" class="btn btn-success">Produtos</button>
                <button type="button" class="btn  btn-success">Serviços</button>
                <div class="dropdown">
                    <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Sobre
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="QuemSomos.jsp">Quem Somos</a>
                        <a class="dropdown-item" href="TermosECondicoes.jsp">Termos Condições e Uso</a>
                        <a class="dropdown-item" href="PoliticaDePrivacidade.jsp">Privacidade</a>

                    </div>
                  </div>
                  <div class="dropdown">
                    <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Contato
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                      <a class="dropdown-item" href="#">Fale Conosco</a>
                      <a class="dropdown-item" href="#">Trabalhe Conosco</a>
                      <a class="dropdown-item" href="#">Como Pedir</a>

                    </div>
                  </div>
  
            </div>
        </div>
    </nav>
    </body>
</html>
