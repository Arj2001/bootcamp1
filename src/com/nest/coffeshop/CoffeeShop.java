package com.nest.coffeshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class CoffeeShop {
    public static void main(String[] args) {

        int mode,choice,qty;
        String custName;

        ArrayList<String>  itemName = new ArrayList<>();
        ArrayList<Integer>  qunatity = new ArrayList<>();
        ArrayList<Integer>  price = new ArrayList<>();

        FoodItems dineIn = new FoodItems(6, 5, 10, 8, 5, 5);
        FoodItems takeAway = new FoodItems(7, 6, 11, 9, 6, 6);

        HashMap<String,String> map= new HashMap<>();
        ArrayList<String> transcationList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        outer:while (true){
            System.out.println("Select mode");
            System.out.println("1. DineIn");
            System.out.println("2. Takeaway");
            System.out.println("3. View accounts");
            System.out.println("4. Exit");
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
                                int random = ((int)(Math.random()*9000)+1000);
                                System.out.println("Enter customer name");
                                custName = in.next();
                                System.out.println("******************");
                                System.out.println("Item \t Qty \t Price");
                                int sum = 0;
                                for (int i = 0; i <= itemName.size()-1; i++) {
                                    System.out.println(itemName.get(i)+" \t "+qunatity.get(i)+" \t :"+price.get(i));
                                    sum += price.get(i);
                                }
                                System.out.println("Total is "+sum);
                                map.put("Name",custName);
                                map.put("Amount",String.valueOf(sum));
                                map.put("Invoice", String.valueOf(random));
                                map.put("Mode", "DineIn");

                                transcationList.add(String.valueOf(map));
                                itemName.clear();
                                price.clear();
                                qunatity.clear();
                                continue outer;
                            case 8:
                                continue outer;
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
                                int random = ((int)(Math.random()*9000)+1000);
                                System.out.println("Enter customer name");
                                custName = in.next();
                                System.out.println("******************");
                                System.out.println("Invoice:"+random);
                                System.out.println("Name:"+custName);
                                System.out.println("Item \t Qty \t Price");
                                int sum = 0;
                                for (int i = 0; i <= itemName.size()-1; i++) {
                                    System.out.println(itemName.get(i)+" \t "+qunatity.get(i)+" \t :"+price.get(i));
                                    sum += price.get(i);
                                }
                                System.out.println("Total is "+sum);
                                map.put("Name",custName);
                                map.put("Amount",String.valueOf(sum));
                                map.put("Invoice", String.valueOf(random));
                                map.put("Mode", "TakeAway");
                                transcationList.add(String.valueOf(map));
                                itemName.clear();
                                price.clear();
                                qunatity.clear();
                                sum=0;
                                break;
                            case 8:
                                continue outer;
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    }
                case 3:
                    System.out.println("Transaction lIst");
                    //transcationList.forEach((n)->(System.out.println(n));
                    for (int i = 0; i < transcationList.size(); i++) {
                        System.out.println(transcationList.get(i));
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }

    }
}
