package UseCases.Factories;

import Repositories.Hibernates.HibernateUserRepository;
import Repositories.UserRepository;
import UseCases.RegisterUserCase;

public class MakeRegisterUserCase {

    public static RegisterUserCase make() {
        UserRepository userRepository = new HibernateUserRepository();
        return new RegisterUserCase(userRepository);
    }
    
}
