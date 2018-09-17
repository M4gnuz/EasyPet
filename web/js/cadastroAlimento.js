window.onload = function () {


    $(function () {
        var maxLength = '-0.000.000,00'.length;

        $("#inputPrecoA").maskMoney({
            allowNegative: true,
            thousands: '.',
            decimal: ',',
            affixesStay: false
        }).attr('maxlength', maxLength).trigger('mask.maskMoney');
    });


    $("#inputDataV").mask("99/99/9999");

    $(function () {
        $("#inputDataV").datepicker();
    });


//$(function () {
//    $("#anunciar_alimento").click(function () {
//        if (validaCampo() == true) {
//            $("#formulario").submit();
//        }
//    });
//});


}

function validaCampo() {

    //Valida campos em branco
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

    // censura de idade 18
    var data = new Date();
    var anoAtual = data.getFullYear();
    var regData = /([^\d])+/g;

    if (anoAtual - parseInt($('#inputData').val().replace(regData, "").substring(4, 8)) >= 0) {
        $("#inputData").datepicker("hide");
        //$("#inputData").val('');
        alert('A data do produto consta vencido, por favor, cadastrar outro produto com um vencimento válido');
        return false;
    }


    if ($("#inputGroupSelect02").val() == "") {
        alert("Por favor, selecione uma categoria");
        $("#inputGroupSelect02").css("border", "1px solid red");
        $("#inputGroupSelect02").focus();
        return false
    }

    $("#inputGroupSelect02").css("border", "1px solid #ced4da");

    return true;
}


