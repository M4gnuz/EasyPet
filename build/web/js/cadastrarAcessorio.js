window.onload = function () {
<<<<<<< HEAD


    $(function () {
        var maxLength = '-0.000,00'.length;

        $("#inputPrecoA").maskMoney({
            allowNegative: true,
            thousands: '.',
            decimal: ',',
            affixesStay: false
        }).attr('maxlength', maxLength).trigger('mask.maskMoney');
    });  
    
    $("#inputEstoqueA").on("input", function () {
        var regex = /[^0-9]/g;
        $(this).val($(this).val().replace(regex, ''));
    });

$(function () {
    $("#salvar_acessorio").click(function () {
        if (validaCampo() === true) {
            $("#formAcessorio").submit();
        }
    });
});


};
=======
    
$(function() {
  var maxLength = '-0.000.000,00'.length;
  
  $("#inputPrecoA").maskMoney({
    allowNegative: true,
    thousands: '.',
    decimal: ',',
    affixesStay: false
  }).attr('maxlength', maxLength).trigger('mask.maskMoney');
});

//$(function () {
//    $("#anunciar_acessorio").click(function () {
//        if (validaCampo() == true) {
//            $("#formulario").submit();
//        }
//    });
//});
  
    
}   
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab

function validaCampo() {

    //Valida campos em branco
<<<<<<< HEAD
    if ($("#inputTitulo").val() === "") {
        alert("Por favor, preencher o campo título do produto");
        $("#inputTitulo").css("border", "1px solid red");
        $("#inputTitulo").focus();
        return false;
    }
    $("#inputTitulo").css("border", "1px solid #ced4da");
    

    if ($("#txtdescricao").val() === "") {
        alert("Por favor, preencher a descrição do produto");
        $("#txtdescricao").css("border", "1px solid red");
        $("#txtdescricao").focus();
        return false;
    }
    if ($("#txtcontrain").val() === "") {
        alert("Por favor, informar a contra indicação do produto");
        $("#txtcontrain").css("border", "1px solid red");
        $("#txtcontrain").focus();
        return false;
    }
    if ($("#inputPrecoA").val()==="0,00") {
        alert("Por favor, informe um valor para seu produto.");
        $("#inputPrecoA").css("border", "1px solid red");
        $("#inputPrecoA").focus();
        return false;
    }
    if ($("#inputEstoqueA").val() === "") {
        alert("Por favor, informar quantidade em estoque");
        $("#inputEstoqueA").css("border", "1px solid red");
        $("#inputEstoqueA").focus();
        return false;
    }
    //$("#txtIngredientes").css("border", "1px solid #ced4da");
    

    //$("#inputDataV").css("border", "1px solid #ced4da");

    // censura de idade 18
   /* var data = new Date();
    var anoAtual = data.getFullYear();
    var regData = /([^\d])+/g;

    if (anoAtual - parseInt($('#inputDataV').val().replace(regData, "").substring(4, 8)) >= 0) {
        $("#inputDataV").datepicker("hide");
        //$("#inputData").val('');
        alert('A data do produto consta vencido, por favor, cadastrar outro produto com um vencimento válido');
        return false;
    }*/

    return true;
}

=======
    if ($("#inputTitulo").val() == "") {
        alert("Por favor, preencher o campo título do produto");
        $("#inputTitulo").css("border", "1px solid red");
        $("#inputTitulo").focus();
        return false
    }
    
    $("#inputTitulo").css("border", "1px solid #ced4da");
    
        if ($("#txtIngredientes").val() == "") {
        alert("Por favor, preencher o campo ingredientes");
        $("#txtIngredientes").css("border", "1px solid red");
        $("#txtIngredientes").focus();
        return false
    }
    
    $("#txtIngredientes").css("border", "1px solid #ced4da");
    
        if ($("#inputPrecoA").val() == "") {
        alert("Por favor, preencher o campo preço");
        $("#inputPrecoA").css("border", "1px solid red");
        $("#inputPrecoA").focus();
        return false
    }
    
    $("#inputPrecoA").css("border", "1px solid #ced4da");
    
        if ($("#inputEstoqueA").val() == "") {
        alert("Por favor, preencher o campo estoque");
        $("#inputEstoqueA").css("border", "1px solid red");
        $("#inputEstoqueA").focus();
        return false
    }
    
    $("#inputEstoqueA").css("border", "1px solid #ced4da");
    
        if ($("#inputDataV").val() == "") {
        alert("Por favor, preencher o campo título do data do vencimento");
        $("#inputDataV").css("border", "1px solid red");
        $("#inputDataV").focus();
        return false
    }
    
    $("#inputDataV").css("border", "1px solid #ced4da");
    
        if ($("#inputGroupSelect02").val() == "") {
        alert("Por favor, selecione uma categoria");
        $("#inputGroupSelect02").css("border", "1px solid red");
        $("#inputGroupSelect02").focus();
        return false
    }
    
    $("#inputGroupSelect02").css("border", "1px solid #ced4da");
    
    return true;
}    
    
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab

