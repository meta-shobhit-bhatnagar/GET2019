package com.shobhit.q1;

import java.util.*;

public class Main {

    private static Number Hex= new Number();
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        String h1, h2;
        System.out.println("Enter first hex number: ");
        h1 = scanner.nextLine();
        System.out.println("Enter second hex number: ");
        h2 = scanner.nextLine();

        boolean quit = false;
        int choice = 0;


        System.out.println("Enter base: ");
        Hex.setBase(scanner.nextInt());
        scanner.nextLine();




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
                    Hex.add(h1,h2);
                    System.out.println("Enter first hex number: ");
                    h1 = scanner.nextLine();
                    System.out.println("Enter second hex number: ");
                    h2 = scanner.nextLine();
                    break;
                case 2:
                    Hex.subtract(h1, h2);
                    System.out.println("Enter first hex number: ");
                    h1 = scanner.nextLine();
                    System.out.println("Enter second hex number: ");
                    h2 = scanner.nextLine();
                    break;
                case 3:
                    Hex.multiply(h1,h2);
                    System.out.println("Enter first hex number: ");
                    h1 = scanner.nextLine();
                    System.out.println("Enter second hex number: ");
                    h2 = scanner.nextLine();
                    break;
                case 4:
                    Hex.divide(h1, h2);
                    System.out.println("Enter first hex number: ");
                    h1 = scanner.nextLine();
                    System.out.println("Enter second hex number: ");
                    h2 = scanner.nextLine();
                    break;
                case 5:
                    quit= true;
                    break;

            }
        }




    }
    public static void printInstructions() {
        System.out.println("\t 0. To print Instructions");
        System.out.println("\t 1. Add()");
        System.out.println("\t 2. Subtract()");
        System.out.println("\t 3. Multiply()");
        System.out.println("\t 4. Divide");

        System.out.println("\t 5. To quit");
    }


}

