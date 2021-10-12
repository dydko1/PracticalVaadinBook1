package com.dydko.ch04.inputComponents;

import java.util.Arrays;
import java.util.List;

public class Service {
    public List<Department> getDepartment() {
        return Arrays.asList(
                new Department(1, "R&D"),
                new Department(2, "Marketing"),
                new Department(3, "Sales"));
    }
}
