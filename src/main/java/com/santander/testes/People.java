package com.santander.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class People {

    private String name;
    private LocalDate birth;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public People(String name, String birth) throws ParseException {
        this.name = name;
        this.birth = LocalDate.of(
            Integer.parseInt(birth.split("/")[2]),
            Integer.parseInt(birth.split("/")[1]),
            Integer.parseInt(birth.split("/")[0])
        );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birth, LocalDate.now());
    }
}



