package com.mohamadandyb.notesapp;

public class Student extends Person {
    private String email;

    public Student(String name, int age, String email) {
        super(name, age);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama : " + getName());
        System.out.println("Umur : " + getAge());
        System.out.println("Email: " + getEmail());
    }
}