<%-- 
    Document   : Home
    Created on : 01/09/2018, 05:35:48
    Author     : AsColaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="../css/home.css">
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
        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100 teste" src="../ResourcesIm/banho.png" alt="First slide">
                    <div class="carousel-caption ">
                        <h1 class="letra">Cuidados para seu Pet</h1>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100 teste" src="../ResourcesIm/software-de-gestao.jpg" alt="Second slide">
                    <div class="carousel-caption ">
                        <h1 class="letra3">Plataforma Completa para Logista </h1>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100 teste" src="../ResourcesIm/dog-oculos.jpg" alt="Third slide">
                    <div class="carousel-caption ">
                        <h1 class="letra3">Acessórios Para seu Pet</h1>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100 teste" src="../ResourcesIm/logo6.jpg" alt="Four slide">
                    <div class="carousel-caption ">
                        <h1 class="letra2">Entrega Rapida e Pratica</h1>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100 teste" src="../ResourcesIm/logo4.jpg" alt="Third slide">
                    <div class="carousel-caption ">
                        <h1 class="letra">Produtos Para seu Pet</h1>

                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div> 
        <div class="container" >
            <h1 id="homeT"> Delivery e Cuidados para seu Animalzinho, <br>
                <span> agora mais proximo de você!</span></h1>

            <div class="input-group  col-xs-12 col-sm-6 col-md-6" id="pesquisa">
                <input type="text" class="form-control" placeholder="Digite seu CEP para buscar as Lojas mais perto de você" aria-label="Recipient's username" aria-describedby="basic-addon2">
                <div class="input-group-append">
                    <button class="btn btn-success" type="button">Buscar</button>
                </div>
            </div>
        </div>
        <div class="row"> 
            <div class="col-xs-12 col-sm-6 col-md-6" id="texto">
                <h2>Donos de PetShop</h2>
                <p>
                    Ce este Lorem Ipsum?
                    Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.
                </p>
            </div>
            <div class="col-xs-12 col-sm-5 col-md-5" id="texto">
                <h2>Nossos Serviços</h2>
                <p>
                    Ce este Lorem Ipsum?
                    Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.
                </p>
            </div>     
        </div>   
    
    <%@include file="rodape.jsp"%>
    </body>
</html>
