<%-- 
    Document   : CabecalhoCliente
    Created on : 07/09/2018, 16:42:11
    Author     : AsColaco
--%>

<%@page import="classes.Cliente"%>
<%@page import="dao.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% 
        int id = 0;
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idCliente")) {
                    id = Integer.parseInt(cookie.getValue());

                }                
            }
           
            Cliente novo = ClienteDAO.getCliente(id);
        %>
        <nav id="nav-principal" class="navbar navbar-expand-lg  border border-dar rounded shadow p-3 mb-3">
            <div class="logo">
                <h3>EasyPet</h3>
                <img src="../ResourcesIm/logoSite.png" width="88px">
            </div>
            <div class="btn-toolbar mb-3" role="toolbar" aria-label="Toolbar with button groups">
                <div class="btn-group mr-2" role="group" aria-label="First group">
                    <div class="dropdown">
                        <button id="Comprar" class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Comprar</button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="PaginadeProdutos.jsp">Produtos</a>
                            <a class="dropdown-item" href="#">Serviços</a>
                        </div>
                    </div>
                    <div class="dropdown">
                        <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Sobre
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="QuemSomos.jsp">Quem Somos</a>
                            <a class="dropdown-item" href="TermosECondicoes.jsp">Termos Condições e Uso</a>
                            <a class="dropdown-item" href="PoliticaDePrivacidade.jsp" >Privacidade</a>                        
                        </div>
                    </div>
                    <div class="dropdown">
                        <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Contato
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="FaleConosco.jsp">Fale Conosco</a>
                            <a class="dropdown-item" href="#">Trabalhe Conosco</a>
                            <a class="dropdown-item" href="ComoPedir.jsp">Como Pedir</a>
                        </div>
                    </div>
                    <div class="dropdown">
                        <button id="menuCliente" class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-user-alt"></i>
                            <% out.print(novo.getNome()); %>
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="MeusDadosCliente.jsp">Editar meu Perfil</a>
                            <a class="dropdown-item" href="TrocaSenha.jsp">Trocar Senha</a>
                            <a class="dropdown-item" href="MeusPets.jsp">Gerenciar meus Pets</a>
                            <a class="dropdown-item" href="#">Acompanhar meus pedidos</a>
                            <a class="dropdown-item" href="#">Acompanhar meus agendamentos</a>
                            <a class="dropdown-item" href="#">Assinaturas</a>   
                            <a class="dropdown-item" href="../index.html">Sair</a> 
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </body>
</html>
