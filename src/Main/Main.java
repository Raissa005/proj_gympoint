package Main;

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
        UserRepository repository = new InMemoryUserRepository();
        User u = repository.findByEmail("raissa@gmail");
        
    
}
