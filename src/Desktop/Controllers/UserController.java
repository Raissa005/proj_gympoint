package Desktop.Controllers;

import DTO.LoginDto;
import DTO.RegisterUserDTO;
import Entities.User;
import UseCases.Factories.MakeLoginUseCase;
import UseCases.Factories.MakeRegisterUserCase;
import javax.swing.JOptionPane;

public class UserController {
    
    public void CreateUser(RegisterUserDTO user){
        try {
           MakeRegisterUserCase.make().execute(user);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não conseguimos  cadastrar o usuario");
        }   
    }
    
    public User findEmail(LoginDto login ){
        try {
           return MakeLoginUseCase.make().execute(login);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível autenticar");
            return null;
        }
    }
}
