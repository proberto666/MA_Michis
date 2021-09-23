function validarForm(form){
    var usuario = form.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = form.contrasena;
    if(password.value == "" || password.value.length <5){
        alert("Debe proporcionar una contraseña de al menos 5 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = form.tecnologia;
    var checkTec = false;
    
    for(var i=0; i<tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkTec = true;
        }
    }
    
    if(!checkTec){
        alert("Debes seleccionar una tecnología");
        return false;
    }
    
    var genero = form.genero;
    var radioSelect = false;
    
    for(var i=0; i<genero.length;i++){
        if(genero[i].checked){
            radioSelect = true;
        }
    }
    
     if(!radioSelect){
        alert("Debes seleccionar un genero");
        return false;
    }
    
    var ocupacion = from.ocupacion
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    alert("Formulario valido. Enviando datos al servidor");
    
    
}

