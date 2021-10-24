package com.dydko.ch05.jakartaBeanValidation1.serializable;

import java.io.*;

public class SerializeExample {
    public static void printData(Employee object1) {
        System.out.println("name = " + object1.getName());
        System.out.println("age = " + object1.getAge());
        System.out.println("a = " + object1.getA());
        System.out.println("b = " + object1.getB());
        System.out.println("a = " + object1.getHeight());
        System.out.println("b = " + object1.getWeight());
        //System.out.println("b = " + object1.getCat().getCatName());
        //System.out.println("b = " + object1.getCat().getCatRace());

    }

    public static void main(String[] args) {

        //Employee objectEmployee = new Employee("Miro", 20, 2, 1000, new Cat("europejski","Filus"));
        Employee objectEmployee = new Employee("Miro", 20, 2, 1000);
        //
        objectEmployee.setHeight(182);
        objectEmployee.setWeight(98);

        //objectEmployee.setCat(cat);
        Employee objectEmployee2 = new Employee();
        String filename = "C:/Temp/aa/employee.txt";

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(objectEmployee);
            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printData(objectEmployee);
            objectEmployee.setB(2000);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        objectEmployee = null;

        // Deserialization
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            objectEmployee2 = (Employee) in.readObject();
            in.close();
            file.close();

            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            printData(objectEmployee2);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }

    }
}
