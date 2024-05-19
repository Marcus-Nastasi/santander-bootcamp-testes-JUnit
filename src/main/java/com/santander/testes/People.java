package com.santander.testes;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class People {

    private String name;
    private LocalDate birth;

    public People(String name, String birth) throws ParseException {
        this.name = name;
        this.birth = LocalDate.of(
            Integer.parseInt(birth.split("/")[2]),
            Integer.parseInt(birth.split("/")[1]),
            Integer.parseInt(birth.split("/")[0])
        );
    }

    public boolean isMajor() {
        return this.getAge() >= 18;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birth, LocalDate.now());
    }
}



