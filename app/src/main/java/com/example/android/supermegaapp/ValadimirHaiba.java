package com.example.android.supermegaapp;

import java.util.Objects;

public class ValadimirHaiba {
    private String name;
    private String sName;

    public ValadimirHaiba(String name, String sName) {
        this.name = name;
        this.sName = sName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValadimirHaiba haiba = (ValadimirHaiba) o;
        return Objects.equals(name, haiba.name) &&
                Objects.equals(sName, haiba.sName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sName);
    }

    @Override
    public String toString() {
        return "ValadimirHaiba{" +
                "name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
