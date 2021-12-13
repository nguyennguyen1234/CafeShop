package com.cafeshop;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Menu {


    public static Set<Food> foodList = new HashSet<>();
    public static String url = "";
    public static void getMenuFromFile(String path) {
        url = path;
        try (FileInputStream fileInputStream = new FileInputStream(path);
             BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(fileInputStream))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] newFood = line.split("\t");
                foodList.add(new Food(newFood[0],newFood[1],newFood[2]));
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printMenuList(){
        System.out.println("Tên\t\t Giá \t\t Loại" );
        for(Food s : foodList) {
            String food = s.getName()+"\t\t" + s.getPrice() + "\t\t" + s.getType();
            System.out.println(food);
        }
    }


    public static void addNewFood(Food food) {
        foodList.add(food);
        for(Food s : foodList) {
            String afood = s.getName()+"\t\t" + "\t\t" +s.getPrice() + s.getType();
            try (FileWriter fileWriter = new FileWriter(url, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(afood);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Set<Food> getFoodList() {
        return foodList;
    }

}
