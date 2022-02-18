package com.company;

public  class Horse extends DomesticAnimal{
    private String color;

    public Horse() {
    }

    public Horse(String name, String gender, int age, double weight, String color) {
        super(name, gender, age, weight);
        this.color = color;
    }
}
