package com.cafeshop;

public class Staff extends Employee{
    public Staff(String name, String age, String position) {
        super(name, age, position);
    }

    @Override
    public void addPosition(Employee e, String position) {
        e.position = position;
    }
}
