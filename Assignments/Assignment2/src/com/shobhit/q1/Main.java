package com.shobhit.q1;

import java.util.*;

public class Main {

    private static Number Hex= new Number();
    private static Scanner scanner= new Scanner(System.in);
    
    private static String h1, h2;
    public static void main(String[] args) {
        
        
        
        

        boolean quit = false;
        int choice = 0;


        
        Hex.setBase(16);




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
                	setInput();
                    Hex.add(h1,h2);
                    
                    break;
                case 2:
                	setInput();
                    Hex.subtract(h1, h2);
                    
                    break;
                case 3:
                	 setInput();
                    Hex.multiply(h1,h2);
                   
                    break;
                case 4:
                	 setInput();
                    Hex.divide(h1, h2);
                   
                    break;
                case 5:
                	int decVal;
                	System.out.println("Enter decimal format number :");
                	decVal=scanner.nextInt();
                	String hexVal= Hex.decToHex(decVal);
                	System.out.println("converted to Hex:" + hexVal);
                case 6:
                	System.out.println("Enter hexadecimal format number :");
                	hexVal=scanner.nextLine();
                	decVal=Hex.hexToDec(hexVal);
                	System.out.println("converted to Dec :" + decVal);
                case 7:
                    quit= true;
                    break;

            }
        }




    }
    
    public static void setInput(){
    	System.out.println("Enter first hex number: ");
        h1 = scanner.nextLine();
        System.out.println("Enter second hex number: ");
        h2 = scanner.nextLine();
    }
    public static void printInstructions() {
        System.out.println("\t 0. To print Instructions");
        System.out.println("\t 1. Add()");
        System.out.println("\t 2. Subtract()");
        System.out.println("\t 3. Multiply()");
        System.out.println("\t 4. Divide");

        System.out.println("\t 5. decimal to hex");
        System.out.println("\t 5. hex to dec");
        System.out.println("\t 5. Quit");
    }


}

