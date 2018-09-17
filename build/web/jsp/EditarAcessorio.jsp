
<%@page import="dao.FornecedorDAO"%>
<%@page import="classes.Fornecedor"%>
<%@page import="classes.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="javax.servlet.http.Cookie;"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Produto Acessório</title>
        <link rel="stylesheet" type="text/css" href="../css/EditarAcessorio.css">  

        <link rel="stylesheet" type="text/css" href="../css/rodape.css"> 
        <link rel="stylesheet" type="text/css" href="../css/cabecalho.css"> 
        <link rel="stylesheet" type="text/css" href="../css/menuLateral.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js"></script>

    </head>
    <body id="tudo">
        <%
            int id = 0;
            String nome = "";
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idFornecedor")) {
                    id = Integer.parseInt(cookie.getValue());

                }
                Fornecedor novo = FornecedorDAO.getFornecedor(id);
                nome = novo.getNome();
            }
        %>
        <%@include file="cabecalho.jsp"%>
        <div class="container">
            <div id="petlogo" class="principal2  col-xs-12 col-sm-4 col-md-4">
                <h4><%=nome%></h4>
            </div>
        </div>
        <div class="container">
            <div id="logocentral" class="principal2 col-xs-12 col-sm-8 col-md-8">
                <h1 id="nomeTopo">Editar Produtos - Acessório</h1>
            </div>
        </div>

        <%@include file="menuLateral.jsp"%>
        <%
            Produto produto = new Produto();
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("idProduto")) {
                    id = Integer.parseInt(cookie.getValue());
                }
            }
            ProdutoDAO.getAcessorio(produto, id);
        %>

        <form action="../EditarProdutoServlet" method="post" id="formAcessorio">
            <div id="fotoprod" class="principal col-xs-12 col-sm-6 col-md-6">
                <h4>Fotos do seu produto</h4>

                <div class="custom-file" id="anexo">
                    <input type="file" name="imagem" class="custom-file-input mb-3" id="customFile">
                    <label class="custom-file-label" for="customFile">Enviar Fotos</label>
                </div>
                <button type="button" id="excluir_fotoacessorio" class=" btn2 btn btn-success">Excluir</button>

                <hr>
                <div class="form-group col-xs-12 col-sm-10 col-md-10" id="titulop">
                    <label>Titulo do Produto: *</label>
                    <input type="text" <% out.print("value='" + produto.getNome() + "'"); %> name="titulo" class="form-control" id="inputTitulo">
                </div>

                <div class="form-group col-xs-12 col-sm-10 col-md-10" id="descri">
                    <label for="exampleFormControlTextarea1">Descrição</label>
                    <textarea class="form-control" name="descricao" id="txtdescricao" rows="4"><% out.print(produto.getDescricao()); %></textarea>
                </div>
                <div class="form-group col-xs-12 col-sm-10 col-md-10" id="contraindicacao">
                    <label for="exampleFormControlTextarea1">Contra-Indicação</label>
                    <textarea class="form-control" name="contra" id="txtcontrain" rows="3"><% out.print(produto.getContraIndicacao()); %></textarea>

                    <div class="row">
                        <div class="form-group col-xs-12 col-sm-12 col-md-4" id="precoA">
                            <div class="form-group " id="preco">
                                <label>Preço: *</label>
                                <input type="text" <% out.print("value='" + produto.getPreco() + 0 + "'"); %> name="precoA" class="form-control" id="inputPrecoA">
                            </div>
                        </div>
                        <div class="form-group col-xs-12 col-sm-12 col-md-3" id="estoqueA">
                            <div class="form-group " id="estoque">
                                <label>Estoque: *</label>
                                <input type="number" <% out.print("value='" + produto.getEstoque() + "'"); %> name="estoque" class="form-control" id="inputEstoqueA">
                            </div>
                        </div>

                        <div class=" form-group col-xs-12 col-sm-12 col-md-5">
                            <div class=" form-group ">
                                <label>Categorias: *</label>
                                <select class="custom-select" name="categoria" id="inputGroupSelect02">
                                    <option <% out.print("value='" + produto.getCategoria() + "'"); %> selected>
                                        <%
                                            int valor2 = Integer.parseInt(produto.getCategoria());
                                            switch (valor2) {
                                                case 1:
                                                    out.print("Higiene");
                                                    break;
                                                case 2:
                                                    out.print("Brinquedos");
                                                    break;
                                                case 3:
                                                    out.print("Acessórios");
                                                    break;
                                                case 4:
                                                    out.print("Transporte");
                                                    break;
                                            }
                                        %>
                                    </option>
                                    <option value="1">Higiene</option>
                                    <option value="2">Brinquedos</option>
                                    <option value="3">Acessórios</option>
                                    <option value="4">Transporte</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="row">                       
                    <div class="form-group col-xs-12 col-sm-11 col-md-11" id="cidade">
                        <button type="button" id="cancelarCadAcessorio" class=" btn2 btn btn-cancel float-right ">Cancelar</button>
                    </div>
                    <div class="form-group col-xs-12 col-sm-1 col-md-1" id="cidade">
                        <button type="submit" id="salvar_acessorio" class=" btn2 btn btn-success float-right">Salvar</button>
                    </div>
                    <!-- <a href="MeusProdutos.jsp" class="btn2 btn btn-success">Cancelar</a>-->
                </div>
            </div>
        </form> 
        <%@include file="rodape.jsp"%>
        <script type="text/javascript" src="../js/cadastroaAcessorio.js"></script>
    </body>
</html>
