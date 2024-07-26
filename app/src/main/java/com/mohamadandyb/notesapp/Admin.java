package com.mohamadandyb.notesapp;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean validate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}