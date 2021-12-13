package com.cafeshop;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {
    private String number;
    private String occupied;
    public List<Food> food = new ArrayList<>();

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    public Table(String number, String occupied) {
        this.occupied = occupied;
        this.number = number;
    }

    public String getOccupied() {
        return occupied;
    }

    public void setOccupied(String occupied) {
        this.occupied = occupied;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void addFood(String name) {
        boolean exist = false;
        for (Food s : Menu.foodList) {
            if (s.getName().equals(name)|| s.getName().toLowerCase().equals(name)) {
                food.add(s);
                System.out.println("Đặt món thành công.");
                return;
            } else if ((s.getName().contains(name)|| s.getName().toLowerCase().contains(name))&&!name.equals("")) {
                //System.out.println("Các món liên quan:");
                String food = s.getName() + "\t\t" + s.getPrice() + "\t\t" + s.getPrice();
                System.out.println(food);
                exist = true;
            }

        }
        if (!exist && !name.equals("")) {
            System.out.println("Không có món ăn trên.");
            return;
        }

    }

}
