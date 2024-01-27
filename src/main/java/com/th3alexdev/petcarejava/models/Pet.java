package com.th3alexdev.petcarejava.models;

import jakarta.persistence.*;

@Entity
@Table(name="pets")
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
    private Integer id;
    private String name;
    private String breed;
    private String color;
    private String comments;
    private Boolean isAllergic;
    private Boolean specialAttention;

    public Pet() {}

    public Pet(String name, String breed, String color, String comments, Boolean isAllergic, Boolean specialAttention, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.comments = comments;
        this.isAllergic = isAllergic;
        this.specialAttention = specialAttention;
        this.id_owner = owner;
    }

    public Owner getOwner() {
        return id_owner;
    }

    public void setOwner(Owner owner) {
        this.id_owner = owner;
    }

    @Override
    public String toString() {
        return "Pet -> { " + '\n' +
                "\tid=" + id + ",\n" +
                "\tname='" + name + '\'' + ",\n" +
                "\tbreed='" + breed + '\'' + ",\n" +
                "\tcolor='" + color + '\'' + ",\n" +
                "\tcomments='" + comments + '\'' + ",\n" +
                "\tisAllergic=" + isAllergic + ",\n" +
                "\tspecialAttention=" + specialAttention + ",\n" +
                "\towner=" + id_owner + '\n' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getIsAllergic() {
        return isAllergic;
    }

    public void setIsAllergic(Boolean allergic) {
        isAllergic = allergic;
    }

    public Boolean getSpecialAttention() {
        return specialAttention;
    }

    public void setSpecialAttention(Boolean specialAttention) {
        this.specialAttention = specialAttention;
    }
}
