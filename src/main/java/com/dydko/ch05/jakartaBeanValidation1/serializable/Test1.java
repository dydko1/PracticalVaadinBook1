package com.dydko.ch05.jakartaBeanValidation1.serializable;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        Demo demo2 = new Demo(1, "Teściklllllll");
        String fileName = "C:/Temp/aa/file.set";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(demo2);

            out.close();
            file.close();

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        Demo demo1 = null;

        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            demo1 = (Demo) in.readObject();
            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + demo1.getA());
            System.out.println("b = " + demo1.getB());

        } catch (IOException exception) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException exception) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
