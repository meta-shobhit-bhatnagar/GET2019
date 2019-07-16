package com.scfassignment1;

import java.util.*;

public class Main {

    private static ShoppingCart shopCart = new ShoppingCart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        shopCart.createList();
        shopCart.printStockList();


        printInstructions();

        while (!quit) {
        	
            do {
        	    try {
        	    	System.out.println("Enter your choice:");
        	    	choice = scanner.nextInt();
        	    } catch (InputMismatchException e) {
        	        System.out.println("Invalid quantity! ");
        	    }
        	    scanner.nextLine(); 
        	} while (choice <= 0);
            
            
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    printStockList();
                    break;
                case 6:
                    generateBill();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\t 0.  To print Instructions");
        System.out.println("\t 1.  To add item to your shopping cart");
        System.out.println("\t 2.  To remove item from your shopping cart");
        System.out.println("\t 3.  To update/modify item from your shopping cart");
        System.out.println("\t 4.  To print list");
        System.out.println("\t 5.  To print Stock list");
        System.out.println("\t 6.  To generate Bill");
        System.out.println("\t 7.  To quit");
    }
    
    

    /*public static int validate(){
        int validateEntry=0;
        do{
        	if(validateEntry <0)
            System.out.println("!Enter positive number :");
            while(!scanner.hasNextInt()){
                System.out.println("Enter integer only :");
                scanner.next();
            }validateEntry= scanner.nextInt();
        }while(validateEntry<0);

        return validateEntry;
    }*/

    public static void addItem() {
        System.out.println("Enter item name:");
        String item = scanner.nextLine();
        System.out.println("How much Qty do you need:");
        int qty=0;
		do {
    	    try {
    	        System.out.println("Enter the item quantity : ");
    	        qty = scanner.nextInt();
    	    } catch (InputMismatchException e) {
    	        System.out.println("Invalid quantity! ");
    	    }
    	    scanner.nextLine(); 
    	} while (qty <= 0);
        shopCart.addShopItem(item, qty);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        shopCart.removeShopItem(itemName);
    }

    public static void updateItem() {

        System.out.print("Current item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        shopCart.modifyShopItem(itemName, newItem);
        System.out.println("How much Qty do you need:");
        int qty=0;
		do {
    	    try {
    	    	System.out.println("How much Qty do you need:");
    	        qty = scanner.nextInt();
    	    } catch (InputMismatchException e) {
    	        System.out.println("Invalid quantity! ");
    	    }
    	    scanner.nextLine(); 
    	} while (qty <= 0);
        shopCart.addShopItem(newItem, qty);



    }

    public static void printList() {
        shopCart.printShopList();
    }

    public static void printStockList() {
        shopCart.printStockList();
    }

    public static void generateBill() {
        shopCart.generateBill();
    }



}

