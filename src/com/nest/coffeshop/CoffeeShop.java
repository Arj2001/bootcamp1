package com.nest.coffeshop;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        int choice;

        ArrayList<String>  itemName = new ArrayList<>();
        ArrayList<Integer>  qunatity = new ArrayList<>();
        ArrayList<Integer>  price = new ArrayList<>();
        while (true){
            System.out.println("Select an Option: ");
            System.out.println("1. Black Coffee   6");
            System.out.println("2. Black Tea   5");
            System.out.println("3. Tea   10");
            System.out.println("4. Cake   5");
            System.out.println("5. Coffee   8");
            System.out.println("6. Vada   5");
            System.out.println("7. Bill");
            System.out.println("8. Exit");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            int qty;
            switch (choice){

                case 1:
                    System.out.println("Enter the qty");
                    qty = in.nextInt();
                    itemName.add("Black Coffee");
                    qunatity.add(qty);
                    price.add(qty*6);
                    break;
                case 2:
                    System.out.println("Enter the qty");
                    qty = in.nextInt();
                    itemName.add("BLack Tea");
                    qunatity.add(qty);
                    price.add(qty*5);
                    break;
                case 3:
                    System.out.println("Enter the qty");
                    qty = in.nextInt();
                    itemName.add("Tea");
                    qunatity.add(qty);
                    price.add(qty*10);
                    break;
                case 4:
                    System.out.println("Enter the qty");
                    qty = in.nextInt();
                    itemName.add("Cake");
                    qunatity.add(qty);
                    price.add(qty*10);
                    break;
                case 5:
                    System.out.println("Enter the qty");
                    qty = in.nextInt();
                    itemName.add("Coffee");
                    qunatity.add(qty);
                    price.add(qty*8);
                    break;
                case 6:
                    System.out.println("Enter the qty");
                    qty = in.nextInt();
                    itemName.add("Vada");
                    qunatity.add(qty);
                    price.add(qty*5);
                    break;
                case 7:
                    System.out.println("******************");
                    System.out.println("Item   Qty   Price");
                    int sum = 0;
                    for (int i = 0; i <= itemName.size()-1; i++) {
                        System.out.println(itemName.get(i)+"  "+qunatity.get(i)+"  :"+price.get(i));
                        sum += price.get(i);
                    }
                    System.out.println("Total is "+sum);
                    System.exit(0);
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
    }
}
