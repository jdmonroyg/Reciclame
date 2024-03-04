package com.s1316tjavanext.reciclamebackend.util;

/**
 * @author jdmon on 26/02/2024
 * @project reciclame-backend
 */
public class Constants {
    public final static String REGEX_TITLE = "[a-zA-Z0-9áéíóúüñÁÉÍÓÚÜÑ ]{3,50}";
    public final static String INVALID_TITLE = "El título no es valido";
    public final static String REGEX_DESCRIPTION = "[a-zA-Z0-9áéíóúüñÁÉÍÓÚÜÑ!¡¿?,.\\-_ ]{3,500}";
    public final static String INVALID_DESCRIPTION = "La descripción no es valida";
    public final static String INVALID_CHARACTERS = "El campo contiene caracteres inválidos";

    /* Validaciones para User */
    public final static String INVALID_NAME = "El nombre o apellido no es valido";
    public final static String INVALID_LENGTH_NAME = "La longitud del nombre o apellido debe ser mayor a 3";
    public final static String INVALID_EMAIL = "El email no es valido";

    public final static String INVALID_PASSWORD = 
            "La contraseña debe ser mínimo de 8 caracteres," + 
            "al menos una letra mayúscula, " + 
            "y opcionalmente solo se permite los siguientes caracteres especiales: " + 
            ".!@#$&*%_-=''";

    public final static String INVALID_PHONE_NUMBER = "El numero de telefono no es valido";
    public final static String INVALID_LENGTH_PHONE_NUMBER = "La longitud del numero de telefono no es valida";
    public final static String INVALID_LOCATION_ID = "La localidad ingresada no es valida";
    public final static String INVALID_BIRTHDAY = "La fecha de nacimiento no es valida";
    public final static String INVALID_POST_ID = "Id de publicacion requerido";
    public final static String INVALID_PROFILE_ID = "Id de perfil requerido";
    public final static String INVALID_CATEGORY = "La categoría no es valida";
    public final static String INVALID_ENABLE_COMMENTS = "Debe indicar si habilita o no los comentarios";
}
