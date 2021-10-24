package com.dydko.ch05.jakartaBeanValidation1.serializable;

import java.io.Serializable;

//public class Employee implements Serializable {
public class Employee extends Human {
    //private static final long serialversionUID = 129348938L;

    //private transient int a;
    private int a;
    private static int b;
    private String name;
    private int age;
    private Cat cat;

    public Employee(){}

    /*
    public Employee(String name, int age, int a, int b, Cat cat) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
        this.cat = cat;
    }
    */

    public Employee(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Employee.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
