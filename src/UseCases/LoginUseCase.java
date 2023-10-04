package UseCases;

import DTO.LoginDto;
import DTO.RegisterUserDTO;
import Entities.User;
import Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import sun.security.util.Password;

public class LoginUseCase {
     private final UserRepository userRepository;
    
    public LoginUseCase(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
     public User execute(LoginDto loginDto) throws Exception{
         //Recebe as informações de email e senha
         //buscar o user com o e-mail informado
            //se não encontrar o user com o email, lançar 'usuario não cadastrado'
         //se encontrar o user com este email verificar sed a senha esta correta
            //se não estiver correta deve retornar mensagem de erro
            //se sim, retorne usuario encontrado
       User u = this.userRepository.findByEmail(loginDto.getEmail()); //vai ao banco de dados e busca o user por email
       
       if(u == null){
          System.out.println("Usuario não cadastrado");
       }
       
       boolean ehValida = BCrypt.checkpw(loginDto.getSenha(), u.getPassword_hash()); //compara a senha recebida com a senha do user no banco de dados
       if(!ehValida){
           throw new Exception("Senha incorreta");
       }
       return u;
 
    }     
}
