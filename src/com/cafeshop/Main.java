package com.cafeshop;

import java.util.Scanner;

public class Main {
    public static void init() {
        StaffManager.getStaffFromFile("src/resources/Staff.txt");
        //StaffManager.printStaffList();
        Menu.getMenuFromFile("src/resources/Menu.txt");
        //Search.findStaff();
        TableManage.tableSetup();
    }
    public static void printFunction() {
        System.out.println("Xem menu: Press 1.");
        System.out.println("Xem danh sách nhân viên: Press 2.");
        System.out.println("Tìm nhân viên: Press 3.");
        System.out.println("Tìm món ăn: Press 4.");
        System.out.println("Đặt bàn : Press 5.");
        System.out.println("Thanh toán : Press 6.");
        System.out.println("Xem doanh số : Press 7.");
        System.out.println("Trở về bảng điều khiển : Press 0");
    }

    public static void main(String[] args) {
	// write your code here
       init();
       printFunction();
       while (true) {
           System.out.println("Nhập lựa chọn:");
           Scanner sc = new Scanner(System.in);
           int choose = sc.nextInt();
           switch (choose) {
               case 0 :
                   printFunction();
                   break;
               case 1 :
                   Menu.printMenuList();
                   break;
               case 2 :
                   StaffManager.printStaffList();
                   break;
               case 3:
                   Search.findStaff();
                   break;
               case 4:
                   Search.findFood();
                   break;
               case 5:
                   CafeShopManager.order();
                   break;
               case 6:
                   CafeShopManager.pay();
                   break;
               case 7:
                   CafeShopManager.getRevenue();
                   break;
           }
       }
        //Menu.printMenuList();
    }
}
