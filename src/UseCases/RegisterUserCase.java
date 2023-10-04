package UseCases;

import DTO.RegisterUserDTO;
import Entities.User;
import Repositories.UserRepository;

public class RegisterUserCase {
    
    //INVERSÃO DE INDEPENDENCIA
    private UserRepository userRepository;
    
    public RegisterUserCase(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public User execute(RegisterUserDTO userDto) throws Exception{
        
       // DTO - date transfer onject
       //receber informações do view do usuario
       //validar email, (se existe, 
            //boolean ehvalido = vali8darEmail(userDto.getEmail());
                //if(!ehValido){
                      //throw new Exception("E-mail inválido);
       //se já não esta cadastrado)
       //criar user
       //registrar no BC
       //retornar user
       
       User user = this.userRepository.findByEmail(userDto.getEmail());
       if(user != null){
           throw new Exception("User already exists ");
       }
       User u = new User(userDto.getName(), userDto.getEmail(), userDto.getSenha(), userDto.getFuncion_by_user());
       User d = this.userRepository.createUser(u);
       
       return d;
    }
}
