package com.dydko.ch05.jakartaBeanValidation1.serializable;

public class Cat extends SerializeExample{
    private String catRace;
    private String catName;

    public Cat() {
    }

    public Cat(String catRace, String catName) {
        this.catRace = catRace;
        this.catName = catName;
    }

    public String getCatRace() {
        return catRace;
    }

    public void setCatRace(String catRace) {
        this.catRace = catRace;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catRace='" + catRace + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }
}
