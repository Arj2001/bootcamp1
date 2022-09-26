package com.nest.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> empList = new ArrayList<>();
        while (true){
            System.out.println("Select an Option: ");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Quit");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter the name of an employee");
                    empName = in.next();
                    empList.add(empName);
                    break;
                case 2:
                    System.out.println(empList);
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }
}
