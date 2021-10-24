package com.dydko.ch05.jakartaBeanValidation1.serializable;

import java.io.Serializable;

public class Demo implements Serializable {
    private int a;
    private String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
