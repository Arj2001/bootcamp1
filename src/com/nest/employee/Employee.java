package com.nest.employee;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        int choice;
        while (true){
            System.out.println("Select an Option: ");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Quit");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Add Employee");
                    break;
                case 2:
                    System.out.println("View Employee");
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }


}
