package com.cafeshop;

import java.util.Scanner;

public class Search {

    public static void findStaff() {
        boolean exist = false;
        System.out.println("Nhap tên nhân viên cần tìm:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(Staff s : StaffManager.staffList) {
            if(s.getName().equals(name)) {
                String staff = s.getName()+"\t\t" +s.getAge() + "\t\t" +s.getPosition();
                System.out.println(staff);
                return;
            } else if (s.getName().contains(name)) {
                String staff = s.getName()+"\t\t" +s.getAge() + "\t\t" +s.getPosition();
                System.out.println(staff);
                exist =true;
            }

        }
        if(!exist) {
            System.out.println("Không có nhân viên trên.");
            return;
        }
    }

    public static void findFood() {
        boolean exist = false;
        System.out.println("Nhap tên món ăn cần tìm:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(Food s : Menu.foodList) {
            if(s.getName().equals(name)) {
                String food = s.getName()+"\t\t" +s.getPrice() + "\t\t" +s.getPrice();
                System.out.println(food);
                return;
            } else if (s.getName().contains(name)) {
                String food = s.getName()+"\t\t" +s.getPrice() + "\t\t" +s.getPrice();
                System.out.println(food);
                exist =true;
            }

        }
        if(!exist) {
            System.out.println("Không có món ăn trên.");
            return;
        }
    }
}
