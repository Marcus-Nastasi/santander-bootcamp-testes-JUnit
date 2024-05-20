package com.santander.testes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class People {

    private final String name;
    private final LocalDate birth;

    public People(String name, String birth) {
        this.name = name;
        this.birth = LocalDate.of(
            Integer.parseInt(birth.split("/")[2]),
            Integer.parseInt(birth.split("/")[1]),
            Integer.parseInt(birth.split("/")[0])
        );
    }

    @Override
    public String toString() {
        return("People{" + "name='" + name + '\'' + ", birth=" + this.getBirth() + ", age=" + this.getAge() + '}');
    }

    public boolean isMajor() {
        return this.getAge() >= 18;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        String d = this.birth.toString().split("-")[2];
        String m = this.birth.toString().split("-")[1];
        String y = this.birth.toString().split("-")[0];
        return d + '/' + m + '/' + y;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birth, LocalDate.now());
    }
}



