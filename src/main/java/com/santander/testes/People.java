package com.santander.testes;

public class People {

    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isMajor() {
        return this.age >= 18;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
