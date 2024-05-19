package com.santander.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People {

    private String name;
    private Date birth;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public People(String name, String birth) throws ParseException {
        this.name = name;
        this.birth = sdf.parse(birth);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        long now = new Date().getTime();
        long brt = this.birth.getTime();
        long age = now - brt;
        return (int) age/10000;
    }
}


