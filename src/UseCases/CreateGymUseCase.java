/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseCases;

import DTO.CreateGymDTO;
import Entities.Gym;
import Repositories.GymRepository;

/**
 *
 * @author raissa_leite
 */
public class CreateGymUseCase {
    private final GymRepository gymRepository;
    
    public CreateGymUseCase(GymRepository gymRepository1){
        this.gymRepository = gymRepository1;
    }
    
    public Gym execute(CreateGymDTO dto){
        
    }
}
