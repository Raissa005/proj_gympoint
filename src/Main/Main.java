package Main;

import Desktop.Views.Login;
import Entities.User;
import Enums.Funcion;
import Repositories.InMemory.InMemoryUserRepository;
import Repositories.UserRepository;
import Utils.JpaManager;
import io.github.cdimascio.dotenv.Dotenv;
import javax.persistence.EntityManager;

public class Main {

    public static Dotenv dotenv = Dotenv.load();
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }   
    
}
