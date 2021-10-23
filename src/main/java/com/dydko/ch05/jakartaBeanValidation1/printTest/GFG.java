package com.dydko.ch05.jakartaBeanValidation1.printTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class GFG extends Test {

    @Override
    String print(String s) {
        Function<String, String> func1 = super::print;
        String newValue = func1.apply(s);
        newValue += "Bye " + s + " \n";
        System.out.println("xxx=" + newValue);
        return newValue +"eeee";
    }

    static void someFunction(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the instance method
        // using double colon operator
        list.forEach(new GFG()::print);
    }
}
