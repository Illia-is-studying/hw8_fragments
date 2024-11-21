package com.example.hw8_fragments.Models;

public class Person {
    private String name;
    private String[] shortDates;
    private String nameDescription;

    public Person(String name, String[] shortDate, String nameDescription) {
        this.name = name;
        this.shortDates = shortDate;
        this.nameDescription = nameDescription;
    }


    public String getName() {
        return name;
    }

    public String[] getShortDates() {
        return shortDates;
    }

    public String getNameDescription() {
        return nameDescription;
    }
}
