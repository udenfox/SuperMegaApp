package com.example.android.supermegaapp;

public class Igor {

    private int age;

    public Igor() {
    }

    public Igor(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Igor{" +
                "age=" + age +
                '}';
    }
}
