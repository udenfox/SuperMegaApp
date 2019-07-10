package com.example.android.supermegaapp;

public class HorpenkoDan {

    private String firstName = "Dan";
    private String lastName = "Horpenko";
    private int age ;

    public HorpenkoDan(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String sayHi(){
        return "Hi! My name is "+getFirstName()+" "+getLastName()+".";
    }
}
