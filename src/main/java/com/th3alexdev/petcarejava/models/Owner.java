package com.th3alexdev.petcarejava.models;

import jakarta.persistence.*;

@Entity
@Table (name="owners")
public class Owner {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_owner;
    private String name;
    private String phone;
    private static Long lastId;

    @OneToOne(mappedBy = "id_owner")
    private Pet pet;

    public Owner() {}

    public Owner(Long id) {
        this.id = ++lastId;
    }

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Long getLastId() {
        return lastId;
    }

    public static void setLastId(Long lastId) {
        Owner.lastId = lastId;
    }

    @Override
    public String toString() {
        return "Owner -> {" + '\n' +
                "\tid=" + id + ",\n" +
                "\tid_owner=" + id_owner + ",\n" +
                "\tname='" + name + '\'' + ",\n" +
                "\tphone='" + phone + '\'' + '\n' +
                '}';
    }
}