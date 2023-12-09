package com.th3alexdev.petcarejava.models;

public class Pet {

    /*
       In this project, a pet only has one owner (single person responsible)
       that is, the entity-relationship is 1-1.

       This will generate duplicate rows in the database,
       but the entity relationship will be optimized in future features. (N-1)
    */
    private Owner owner;

    private Integer clientNumber;
    private String name;
    private String breed;
    private String color;
    private String comments;
    private Boolean isAllergic;
    private Boolean specialAttention;

    private static int lastClientNumber;

    public Pet(Integer clientNumber) {
        this.clientNumber = ++lastClientNumber;
    }

    public Pet(Owner owner, String name, String breed, String color, String comments, Boolean isAllergic, Boolean specialAttention) {
        this.owner = owner;
        this.name = name;
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
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
