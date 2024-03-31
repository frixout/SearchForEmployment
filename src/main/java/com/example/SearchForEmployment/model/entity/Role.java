package com.example.SearchForEmployment.model.entity;

public enum Role {
    ADMIN("Администратор"),
    EMPLOYEE("Работник"),
    EMPLOYER("Работодатель");

    private final String title;

    Role (String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString() {
        return "Role{" +
                "title='" + title + '\'' +
                '}';
    }
}
