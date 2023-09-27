package Repositories.Hibernates;

import Entities.User;
import Repositories.UserRepository;
import Utils.JpaManager;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class HibernateUserRepository implements UserRepository{
    
    private EntityManager entityManager;
    
    public HibernateUserRepository(){
        this.entityManager = JpaManager.getEntityManager();
    }

    @Override
    public User createUser(User user){
         try {
            this.entityManager.getTransaction.begin();
            this.entityManager.persist(user);
            this.entityManager.commit();
        }finally{
            this.entityManager.close();
        }
    }
    
    @Override
    public User findByEmail(String  email){
        try {
            TypedQuery<User> query = this.entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class);
            query.setParameter("email", email);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }finally{
            this.entityManager.close();
        }
    }
    
}
