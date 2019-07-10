package com.example.android.supermegaapp.participants;

import android.util.Log;

import com.example.android.supermegaapp.MainActivity;

import java.util.Objects;

public final class AlexTarasyuk {

    private final String name;
    private int age;

    public AlexTarasyuk() {
        this.name = "AlexTarasyuk";
        this.age = age;
        Log.d(this.getClass().getCanonicalName(), "AlexTarasyuk instance is created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlexTarasyuk that = (AlexTarasyuk) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "AlexTarasyuk{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
