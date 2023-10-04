
package Entities;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gym")
public class Gym {
    
  @Id
  @Column(name = "id", columnDefinition = "UUID")
  private UUID id;
  
  @Column(name = "nome", unique = true)
  private final String name;
  
  @Column(name = "phoneNumber")
  private final String phoneNumber;
  
  @Column(name = "description")
  private final String description;
  
  @Column(name = "latitude")
  private final Double latitude;
  
  @Column(name = "longitude")
  private final Double longitude;
  
  @Column(name = "data_create")
  @Temporal(TemporalType)
  private final Date date_create;

    public Gym(String name, String phoneNumber, String description, Double latitude, Double longitude) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date_create = new Date();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Date getDate_create() {
        return date_create;
    }
  
  
}
