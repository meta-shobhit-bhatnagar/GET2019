package com.Shobhit;

import java.util.*;

public class main {

    private static ShoppingCart shopCart = new ShoppingCart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        shopCart.createList();
        shopCart.printStockList();


        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
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
                case 6:
                    generateBill();
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\t 0.  To print Instructions");
        System.out.println("\t 1.  To add item");
        System.out.println("\t 2.  To remove item");
        System.out.println("\t 3.  To update/modify item");
        System.out.println("\t 4.  To print list");
        System.out.println("\t 5.  To print Stock list");
        System.out.println("\t 6.  To generate Bill");
        System.out.println("\t 7.  To quit");
    }


    public static void addItem() {
        System.out.println("Enter item name:");
        String item = scanner.nextLine();
        int qty;
        System.out.println("How much Qty do you need:");
        qty = scanner.nextInt();
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
        int qty;
        System.out.println("How much Qty do you need:");
        qty = scanner.nextInt();
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

