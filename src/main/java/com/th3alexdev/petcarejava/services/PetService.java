package com.th3alexdev.petcarejava.services;

import com.th3alexdev.petcarejava.models.Owner;
import com.th3alexdev.petcarejava.models.Pet;
import com.th3alexdev.petcarejava.persistence.PersistenceController;

public class PetService {
    PersistenceController persistenceController = new PersistenceController();

    public void save(String petname, String petbreed,String petcolor, String ownername, String ownerphone, String ownercomments, Boolean isAllergic, Boolean specialAttention){
        Pet pet = new Pet();
        pet.setName(petname);
        pet.setBreed(petbreed);
        pet.setColor(petcolor);
        pet.setComments(ownercomments);
        pet.setIsAllergic(isAllergic);
        pet.setSpecialAttention(specialAttention);

        Owner owner = new Owner();
        owner.setName(ownername);
        owner.setPhone(ownerphone);

        System.out.println(pet.toString());
        System.out.println(owner.toString());
    }
}
