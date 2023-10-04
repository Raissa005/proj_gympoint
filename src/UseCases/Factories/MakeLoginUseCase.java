package UseCases.Factories;

import Repositories.Hibernates.HibernateUserRepository;
import Repositories.UserRepository;
import UseCases.LoginUseCase;
import UseCases.RegisterUserCase;

public class MakeLoginUseCase {
    
    public static LoginUseCase make() {
    
        UserRepository userRepository = new HibernateUserRepository();
        return new LoginUseCase(userRepository);
    }
}
