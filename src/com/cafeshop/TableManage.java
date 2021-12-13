package com.cafeshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableManage {
    public static List<Table> tables = new ArrayList<>();
    public static int cost = 0;

    public static void tableSetup() {
        for(int i = 1; i<=12;i++) {
            String number = "Bàn" +i;
            tables.add(new Table(number,"free"));
        }
    }
    public static void printTable(){
        for(Table t : tables) {
            System.out.println(t.getNumber() + "\t\t" +t.getOccupied());
        }
    }
    public static void chooseTable() {
       // System.out.println("Nhập số thứ tự bàn:");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number<=0||number>12) {
            System.out.println("Nhập số thứ tự bàn:");
            number = sc.nextInt();
        }
        if(tables.get(number-1).getOccupied().equals("Occupied")) {
            System.out.println("Bàn này đã được đặt.");
            return;
        } else {
            System.out.println("Đặt bàn thành công.");
            tables.get(number-1).setOccupied("Occupied");
            chooseFood(tables.get(number-1));
        }

    }

    public static void chooseFood(Table table) {
        //System.out.println("Nhập tên đồ ăn:");
        Scanner sc = new Scanner(System.in);
        String food = "1";
        //table.addFood(food);

        while(!food.equals("")) {
            System.out.println("Nhập tên đồ ăn:");
            food = sc.nextLine();
            table.addFood(food);
            if (food.equals("")) {
                System.out.println("Đặt món hoàn tất.");
                return;
            }
        }
    }
    public static void printBill(int number) {
        System.out.println("Bàn " + number +":");
        int money = 0;
        for (Food s : tables.get(number-1).getFood()) {
            String food = s.getName()+"\t\t" + s.getPrice() + "\t\t" + s.getType();
            System.out.println(food);
            money = money + Integer.parseInt(s.getPrice());
            cost = cost + Integer.parseInt(s.getPrice());
        }
        tables.get(number-1).setOccupied("free");
        System.out.println("Tổng:" + money);
    }


}
