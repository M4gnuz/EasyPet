window.onload = function() {
    
    //mascaras de campos específicos
    $('#inputCep').mask("99999-999");
    $("#inputTelefone").mask("(99) 9999-9999?9");
    $("#inputCnpj").mask("99.999.999/9999-99");
    
    //Valida campos só letra
    $("#inputNome").on("input", function(){
       var regex= /[0-9]/g;
       $(this).val($(this).val().replace(regex, ''));   
    });
    
    $("#inputRazaoSocial").on("input", function(){
       var regex= /[0-9]/g;
       $(this).val($(this).val().replace(regex, ''));   
    });
    
    $("#inputBairro").on("input", function(){
       var regex= /[0-9]/g;
       $(this).val($(this).val().replace(regex, ''));   
    });
    
    $("#inputCidade").on("input", function(){
       var regex= /[0-9]/g;
       $(this).val($(this).val().replace(regex, ''));   
    });
    
    //valida campos só numero
    
    $("#inputNumero").on("input", function(){
       var regex= /[^0-9]/g;
       $(this).val($(this).val().replace(regex, ''));   
    });
}

$(function() {
    $("#CadastrarFornecedor").click(function() {
        if (validaCampo() == true) {
            $("#formulario").submit();
        }

    });
});

function validaCampo() {

    //Valida campos em branco
    if ($("#inputNome").val() == "") {
        alert("Por favor, preencher o campo nome");
        $("#inputNome").css("border", "1px solid red");
        $("#inputNome").focus();
        return false
    }
    $("#inputNome").css("border", "1px solid #ced4da");

    if ($("#inputRazaoSocial").val() == "") {
        alert("Por favor, preencher o campo razão social");
        $("#inputRazaoSocial").css("border", "1px solid red");
        $("#inputRazaoSocial").focus();
        return false
    }
    $("#inputRazaoSocial").css("border", "1px solid #ced4da");
    
    var reg = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
    
    if ($("#inputEmail").val() == "") {
        alert("Por favor, preencher o campo email");
        $("#inputEmail").css("border", "1px solid red");
        $("#inputEmail").focus();
        return false
    }
    if (!reg.test($("#inputEmail").val())){
        $("#inputEmail").css("border", "1px solid red");
        $("#inputEmail").focus();
        alert("Por favor, preencher um email válido");
        return false; 
    } 
    $("#inputEmail").css("border", "1px solid #ced4da");


    if ($("#inputSenha").val() == "") {
        alert("Por favor, preencher o campo senha");
        $("#inputSenha").css("border", "1px solid red");
        $("#inputSenha").focus();
        return false
    }
    $("#inputSenha").css("border", "1px solid #ced4da");

    if ($("#inputCsenha").val() == "") {
        alert("Por favor, preencher o campo senha novamente");
        $("#inputCsenha").css("border", "1px solid red");
        $("#inputCsenha").focus();
        return false
    }
    $("#inputCsenha").css("border", "1px solid #ced4da");


    if ($("#inputCnpj").val() == "") {
        alert("Por favor, preencher o campo CNPJ");
        $("#inputCnpj").css("border", "1px solid red");
        $("#inputCnpj").focus();
        return false
    }
    $("#inputCnpj").css("border", "1px solid #ced4da");

    if ($("#inputTelefone").val() == "") {
        alert("Por favor, preencher o campo telefone");
        $("#inputTelefone").css("border", "1px solid red");
        $("#inputTelefone").focus();
        return false
    }
    $("#inputTelefone").css("border", "1px solid #ced4da");

    if ($("#inputData").val() == "") {
        alert("Por favor, preencher o campo data");
        $("#inputData").css("border", "1px solid red");
        $("#inputData").focus();
        return false
    }
    $("#inputData").css("border", "1px solid #ced4da");

    if ($("#inputCep").val() == "") {
        alert("Por favor, preencher o campo CEP");
        $("#inputCep").css("border", "1px solid red");
        $("#inputCep").focus();
        return false
    }
    $("#inputCep").css("border", "1px solid #ced4da");

    if ($("#inputEnd").val() == "") {
        alert("Por favor, preencher o campo endereço");
        $("#inputEnd").css("border", "1px solid red");
        $("#inputEnd").focus();
        return false
    }
    $("#inputEnd").css("border", "1px solid #ced4da");

    if ($("#inputNumero").val() == "") {
        alert("Por favor, preencher o campo número");
        $("#inputNumero").css("border", "1px solid red");
        $("#inputNumero").focus();
        return false
    }
    $("#inputNumero").css("border", "1px solid #ced4da");



    if ($("#inputBairro").val() == "") {
        alert("Por favor, preencher o campo bairro");
        $("#inputBairro").css("border", "1px solid red");
        $("#inputBairro").focus();
        return false
    }
    $("#inputBairro").css("border", "1px solid #ced4da");

    //valida se o termos de uso está selecionado
    var checado = false;

    if ($("#exampleCheck1").is(":checked")) {
        checado = true;
    } else {
        alert("É necessário confirmar os termos de uso para prosseguir");
        return false;
    }

    //valida se a senha tem no mínimo 8 caracteres

    if ($('#inputSenha').val().trim().length < 8) {
        alert('A senha deverá ter no mínimo 8 caracteres');
        return false;
    }

    //Valida senha se sao iguais
    senha = document.getElementById('inputSenha').value;
    confirSenha = document.getElementById('inputConfsenha').value;
    if (senha != confirSenha) {
        alert("Senhas Diferentes!\nPor favor digitar as senhas iguais.");
        return false;
    }


    return true;
}

var btn = document.getElementById("btn-modal-senha");
var span = document.getElementsByClassName("close")[0];
var modal = document.getElementById('myModal');


/*Modal Senha*/
$(function() {
    $("#btn-modal-senha").click(function() {
        $("#modalSenha").css("display", "block");
    });
});

$(function() {
    $(".close").click(function() {
        $("#modalSenha").css("display", "none");
    });
});


/*            $(function(){
 $(window).click(function(){
 if (event.target == modal) {
 $("#modalSenha").css("display","none");
 }                               
 });	
 
 });*/


/*Modal Termos de uso*/
$(function() {
    $("#btn-termos-uso").click(function() {
        $("#modalTermos").css("display", "block");
    });
});

$(function() {
    $(".close").click(function() {
        $("#modalTermos").css("display", "none");
    });
});


   