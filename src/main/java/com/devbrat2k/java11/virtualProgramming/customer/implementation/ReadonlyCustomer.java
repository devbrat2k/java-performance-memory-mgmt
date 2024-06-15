package com.devbrat2k.java11.virtualProgramming.customer.implementation;

import com.devbrat2k.java.memory.references.escaping.readOnly.CustomerInterface;

public class ReadonlyCustomer implements CustomerInterface {
    private String name;

    public ReadonlyCustomer(String name) {
        this.name = name;
    }

    public ReadonlyCustomer(CustomerInterface customerInterface) {
        this.name = customerInterface.getName();
    }


    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
         this.name = name;
    }


    @Override
    public String toString() {
        return this.getClass().getName().concat( " :" + this.name);
    }

}
