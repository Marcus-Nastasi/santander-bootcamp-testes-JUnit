package com.santander.testes;

public class Main {
    public static void main(String[] args) {
        try {
            People people = new People("Mark", "26/10/2001");
            System.out.println(people);
            System.out.println(people.getBirth());
            System.out.println(people.getAge());
            System.out.println(people.isMajor());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

