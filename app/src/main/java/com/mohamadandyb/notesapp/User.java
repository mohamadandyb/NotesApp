package com.mohamadandyb.notesapp;

public abstract class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean validate(String username, String password);
}