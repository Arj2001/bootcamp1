package com.nest.coffeshop;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        int mode,choice,qty;

        ArrayList<String>  itemName = new ArrayList<>();
        ArrayList<Integer>  qunatity = new ArrayList<>();
        ArrayList<Integer>  price = new ArrayList<>();
        FoodItems dineIn = new FoodItems(6, 5, 10, 8, 5, 5);
        FoodItems takeAway = new FoodItems(7, 6, 11, 9, 6, 6);
        Scanner in = new Scanner(System.in);

            System.out.println("Select mode");
            System.out.println("1. DineIn");
            System.out.println("2. Takeaway");
            System.out.println("3. Exit");
            mode = in.nextInt();
            switch (mode){
                case 1:
                    while(true){

                        System.out.println("Select an Option: ");
                        System.out.println("1. Black Coffee   :"+dineIn.getBlackCoffee());
                        System.out.println("2. Black Tea      :"+dineIn.getBlackTea());
                        System.out.println("3. Tea            :"+dineIn.getTea());
                        System.out.println("4. Cake           :"+dineIn.getCake());
                        System.out.println("5. Coffee         :"+dineIn.getCoffee());
                        System.out.println("6. Vada           :"+dineIn.getVada());
                        System.out.println("7. Bill");
                        System.out.println("8. Exit");

                        choice = in.nextInt();
                        switch (choice){

                            case 1:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Black Coffee");
                                qunatity.add(qty);
                                price.add(qty* dineIn.getBlackCoffee());
                                break;
                            case 2:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("BLack Tea");
                                qunatity.add(qty);
                                price.add(qty* dineIn.getTea());
                                break;
                            case 3:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Tea");
                                qunatity.add(qty);
                                price.add(qty*dineIn.getTea());
                                break;
                            case 4:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Cake");
                                qunatity.add(qty);
                                price.add(qty*dineIn.getCake());
                                break;
                            case 5:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Coffee");
                                qunatity.add(qty);
                                price.add(qty* dineIn.getCoffee());
                                break;
                            case 6:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Vada");
                                qunatity.add(qty);
                                price.add(qty* dineIn.getVada());
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
                                sum=0;
                                System.exit(0);
                            case 8:
                                System.exit(0);
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    }
                case 2:
                    while(true){

                        System.out.println("Select an Option: ");
                        System.out.println("1. Black Coffee   :"+takeAway.getBlackCoffee());
                        System.out.println("2. Black Tea      :"+takeAway.getBlackTea());
                        System.out.println("3. Tea            :"+takeAway.getTea());
                        System.out.println("4. Cake           :"+takeAway.getCake());
                        System.out.println("5. Coffee         :"+takeAway.getCoffee());
                        System.out.println("6. Vada           :"+takeAway.getVada());
                        System.out.println("7. Bill");
                        System.out.println("8. Exit");

                        choice = in.nextInt();
                        switch (choice){

                            case 1:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Black Coffee");
                                qunatity.add(qty);
                                price.add(qty*takeAway.getBlackTea());
                                break;
                            case 2:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("BLack Tea");
                                qunatity.add(qty);
                                price.add(qty* takeAway.getBlackTea());
                                break;
                            case 3:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Tea");
                                qunatity.add(qty);
                                price.add(qty* takeAway.getTea());
                                break;
                            case 4:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Cake");
                                qunatity.add(qty);
                                price.add(qty* takeAway.getCake());
                                break;
                            case 5:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Coffee");
                                qunatity.add(qty);
                                price.add(qty* takeAway.getCoffee());
                                break;
                            case 6:
                                System.out.println("Enter the qty");
                                qty = in.nextInt();
                                itemName.add("Vada");
                                qunatity.add(qty);
                                price.add(qty* takeAway.getVada());
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
                                sum=0;
                                System.exit(0);
                            case 8:
                                System.exit(0);
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    }
                case 3:
                    System.exit(0);
            }

    }
}
