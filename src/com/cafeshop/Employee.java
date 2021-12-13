package com.cafeshop;

public abstract class Employee {
    public String name;
    public String age;
    public String position;

    public Employee(String name, String age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract void addPosition(Employee e, String position);

}
