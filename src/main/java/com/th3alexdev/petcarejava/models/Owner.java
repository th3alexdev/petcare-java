package com.th3alexdev.petcarejava.models;

public class Owner {
    private Integer id;
    private String name;
    private String phone;
    private static int lastId;

    public Owner(Integer id) {
        this.id = ++lastId;
    }

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Owner.lastId = lastId;
    }
}
