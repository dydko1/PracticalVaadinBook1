package com.dydko.ch05.jakartaBeanValidation;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.NotBlank;



public class Product {

    @NotNull
    @NotBlank
    private String name;

    private Code code = new Code(Type.DRINK, "");

    private boolean available = true;

    private Manufacturer manufacturer = new Manufacturer("", "", "");

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
