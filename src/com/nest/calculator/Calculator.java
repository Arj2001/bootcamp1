package com.nest.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int choice,a,b;
        while (true){
            System.out.println("Select an Option: ");
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();


            System.out.println("Enter the operands");
             a = in.nextInt();
             b = in.nextInt();

            switch (choice){

                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
