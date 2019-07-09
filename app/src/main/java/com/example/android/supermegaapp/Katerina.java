package com.example.android.supermegaapp;

public class Katerina {

    private String firstName;
    private String secondName;

    public Katerina(String secondName) {
        this.firstName = "Katerina";
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "First name='" + firstName + '\'' +
                ", second name='" + secondName + '\'';
    }
}
