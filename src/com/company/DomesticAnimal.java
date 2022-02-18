package com.company;

public abstract class DomesticAnimal {
    private String nickName;
    private String gender;
    private int age;
    private double weight;

    public DomesticAnimal() {
    }

    public DomesticAnimal(String name, String gender, int age, double weight) {
        this.nickName = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return nickName;
    }

    public void setName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "NickName: " + nickName +
                ", gender: " + gender +
                ", age: " + age +
                ", weight: " + weight;
    }
}

