package com.th3alexdev.petcarejava.services;

import com.th3alexdev.petcarejava.models.Owner;
import com.th3alexdev.petcarejava.models.Pet;
import com.th3alexdev.petcarejava.persistence.PersistenceController;

public class PetService {
    PersistenceController persistenceController = new PersistenceController();

    public void save(String petName, String petBreed,String petColor, String petOwnerName, String petOwnerPhone, String petOwnerComments, Boolean isAllergic, Boolean specialAttention){
        Owner owner = new Owner();
        owner.setName(petOwnerName);
        owner.setPhone(petOwnerPhone);
        
        Pet pet = new Pet();
        pet.setName(petName);
        pet.setBreed(petBreed);
        pet.setColor(petColor);
        pet.setIsAllergic(isAllergic);
        pet.setSpecialAttention(specialAttention);

        pet.setOwner(owner);
        // pet.setComments(petOwnerComments);

        System.out.println(pet.toString());
        System.out.println(owner.toString());
    }
}
