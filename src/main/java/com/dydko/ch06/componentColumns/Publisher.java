package com.dydko.ch06.automaticColumns;

public class Publisher {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Publisher(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
