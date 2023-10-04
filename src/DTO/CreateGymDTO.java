/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author raissa_leite
 */
public class CreateGymDTO {
    private final String name;
    private final String phoneNumber;
    private final String description;
    private final Double latitude;
    private final Double longitude;

    public CreateGymDTO(String name, String phoneNumber, String description, Double latitude, Double longitude) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
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
    
    
}
