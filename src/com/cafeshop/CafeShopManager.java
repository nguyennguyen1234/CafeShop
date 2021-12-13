package com.cafeshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeShopManager {
    public List<String> orderList = new ArrayList<>();
    public static void order() {
        TableManage.chooseTable();
    }
    public static void pay() {
        System.out.println("Nhập bàn thanh toán:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        TableManage.printBill(number);
    }
    public static void getRevenue(){
        System.out.println("Tổng doanh thu: " + TableManage.cost);
    }
}


