package com.cafeshop;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaffManager {
    public static Set<Staff> staffList = new HashSet<>();
    public static String url = "";
    public static void getStaffFromFile(String path) {
        url = path;
        try (FileInputStream fileInputStream = new FileInputStream(path);
             BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(fileInputStream))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                 String[] newStaff = line.split("\t");
                staffList.add(new Staff(newStaff[0],newStaff[1],newStaff[2]));
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printStaffList(){
        System.out.println("Tên\t\tTuổi\t\tChức vụ");
        for(Staff s : staffList) {
            String staff = s.getName()+"\t\t" +s.getAge() + "\t\t" +s.getPosition();
            System.out.println(staff);
        }
    }
    public static void addNewStaff(Staff staff) {
        staffList.add(staff);
        for(Staff s : staffList) {
            String aStaff = s.getName() + "\t" + s.getAge() + "\t" + s.getPosition();
            try (FileWriter fileWriter = new FileWriter(url, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(aStaff);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Set<Staff> getStaffList() {
        return staffList;
    }

}
