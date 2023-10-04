package DTO;

import Enums.Funcion;

public class RegisterUserDTO {
    private final String name;
    private final String email;
    private final String senha;
    private final Funcion funcion_by_user;

    public RegisterUserDTO(String name, String email, String senha, Funcion funcion_by_user) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.funcion_by_user = funcion_by_user;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Funcion getFuncion_by_user() {
        return funcion_by_user;
    }  
}
