package com.th3alexdev.petcarejava.models;
import jakarta.persistence.*;

@Entity
@Table (name="pets")
public class Pet {

    /*
       In this project, a pet only has one owner (single person responsible)
       that is, the entity-relationship is 1-1.

       This will generate duplicate rows in the database,
       but the entity relationship will be optimized in future features. (N-1)
    */
    @OneToOne
    private Owner id_owner;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String breed;
    private String color;
    private String comments;
    private Boolean isAllergic;
    private Boolean specialAttention;

    private static Long lastClientNumber;

    public Pet() {}

    public Pet(Long id) {
        this.id = ++lastClientNumber;
    }

    public Pet(Owner owner, String name, String breed, String color, String comments, Boolean isAllergic, Boolean specialAttention) {
        this.name = name;
        this.id_owner = owner;
        this.breed = breed;
        this.color = color;
        this.comments = comments;
        this.isAllergic = isAllergic;
        this.specialAttention = specialAttention;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getAllergic() {
        return isAllergic;
    }

    public void setAllergic(Boolean allergic) {
        isAllergic = allergic;
    }

    public Boolean getSpecialAttention() {
        return specialAttention;
    }

    public void setSpecialAttention(Boolean specialAttention) {
        this.specialAttention = specialAttention;
    }

    public Owner getOwner() {
        return id_owner;
    }

    public void setOwner(Owner owner) {
        this.id_owner = owner;
    }
}
