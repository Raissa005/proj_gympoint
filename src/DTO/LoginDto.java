
package DTO;


public class LoginDto {
    private final String email;
    private final String senha;

    public LoginDto(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
