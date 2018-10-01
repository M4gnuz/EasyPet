window.onload = function () {
    $("#inputTelefone").mask("(99) 99999-9999");
<<<<<<< HEAD

    $(function () {
        $("#btn_enviarFormularioDeDuvidas").click(function () {
            if (validaCampo() == true) {
                $("#formulario").submit();
            }

        });
    });
=======
    
    $(function () {
    $("#btn_enviarFormularioDeDuvidas").click(function () {
        if (validaCampo() == true) {
            $("#formulario").submit();
        }

    });
});
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab

}




function validaCampo() {

    if ($("#inputNome").val() == "") {
<<<<<<< HEAD
        alert("Por favor, preencher o campo nome");
=======
        alert("Por favor, preencher o campo Nome");
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab
        $("#inputNome").css("border", "1px solid red");
        $("#inputNome").focus();
        return false
    }
    $("#inputNome").css("border", "1px solid #ced4da");

    var reg = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

    if ($("#inputEmail").val() == "") {
        alert("Por favor, preencher o campo email");
        $("#inputEmail").css("border", "1px solid red");
        $("#inputEmail").focus();
        return false
    }
    if (!reg.test($("#inputEmail").val())) {
        $("#inputEmail").css("border", "1px solid red");
        $("#inputEmail").focus();
        alert("Por favor, preencher um email válido");
        return false;
    }
    $("#inputEmail").css("border", "1px solid #ced4da");

    if ($("#inputTelefone").val() == "") {
        alert("Por favor, preencher o campo telefone");
        $("#inputTelefone").css("border", "1px solid red");
        $("#inputTelefone").focus();
        return false
    }
    $("#inputTelefone").css("border", "1px solid #ced4da");


    if ($("#inputAssunto").val() == "") {
        alert("Por favor, preencher o campo assunto");
        $("#inputAssunto").css("border", "1px solid red");
        $("#inputAssunto").focus();
        return false
    }
    $("#inputAssunto").css("border", "1px solid #ced4da");

    if ($("#inputMotivo").val() == "") {
        alert("Por favor, preencher o campo motivo");
        $("#inputMotivo").css("border", "1px solid red");
        $("#inputMotivo").focus();
        return false
    }
<<<<<<< HEAD
    $("#inputMotivo").css("border", "1px solid #ced4da");
=======
    $("#inputDescricao").css("border", "1px solid #ced4da");
>>>>>>> 9a217dd5f652236bed4f816ad4f46ac4643cccab

    if ($("#inputDescricao").val() == "") {
        alert("Por favor, preencher o campo descrição");
        $("#inputDescricao").css("border", "1px solid red");
        $("#inputDescricao").focus();
        return false
    }
    $("#inputDescricao").css("border", "1px solid #ced4da");

    return true;

}
