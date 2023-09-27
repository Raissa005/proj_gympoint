package Entities;

import Enums.Funcion;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.mindrot.jbcrypt.BCrypt;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;
    
    @Column(name = "nome")
    private String name;
    
    @Column(name = "email", unique = true)
    private String email;
    
    @Column(name = "password_hash")
    private String password_hash;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "funcion")
    private Funcion funcion_user;
    
    @Column(name = "create_as")
    @Temporal(TemporalType.TIMESTAMP)
    private Date create_as;

    public User(String name, String email, String password_hash, Funcion funcion_user) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.password_hash = BCrypt.hashpw(password_hash, BCrypt.gensalt());
        this.funcion_user = funcion_user;
        this.create_as = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public Funcion getFuncion_user() {
        return funcion_user;
    }

    public Date getCreate_as() {
        return create_as;
    }
    
    
}
