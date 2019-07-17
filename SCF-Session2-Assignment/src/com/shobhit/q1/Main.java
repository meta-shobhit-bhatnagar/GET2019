package com.shobhit.q1;

import java.util.*;

/**
*The programs aims to do operations such as add, subtract, multiply, divide and comparison.
*It also adds decimal to hex calculator and its vice versa
*@author Shobhit
*@version 1.0
*/
public class Main {

    private static Number Hex= new Number();
    private static Scanner scanner= new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        
        
        

        boolean quit = false;
        int choice = 0;


        
        Hex.setBase(16);




        printInstructions();

        while (!quit) {
         
            do {
        	    try {
        	    	System.out.println("Enter your choice:");
        	    	choice = scanner.nextInt();
        	    } catch (InputMismatchException e) {
        	        System.out.println("Invalid choice! ");
        	    }
        	    scanner.nextLine(); 
        	} while (choice < 0);
            
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                	Hex.setInput();
                    Hex.add();
                    
                    break;
                case 2:
                	Hex.setInput();
                    Hex.subtract();
                    
                    break;
                case 3:
                	 Hex.setInput();
                    Hex.multiply();
                   
                    break;
                case 4:
                	 Hex.setInput();
                    Hex.divide();
                   
                    break;
                case 5:
                	Hex.setInput();
                	if(Hex.equalTo()){
                  		 System.out.println("hex numbers are equal");
                  		 
                  	 }
                	else{
                		System.out.println("hex numbers are not equal");
                	}
                	break;
                case 6:
                	Hex.setInput();
                	if(Hex.greaterThan()){
                  		 System.out.println("hex number1: " + Hex.geth1() + " is greater than "+ Hex.geth2());
                  	 }else{
                  		System.out.println("hex number1: " + Hex.geth1() + " is not greater than "+ Hex.geth2());
                  	 }
                	break;
                case 7:
                	Hex.setInput();
                	if(Hex.lessThan()){
                  		 System.out.println("hex number1: " + Hex.geth1() + " is less than "+ Hex.geth2());
                  	 }else{
                  		System.out.println("hex number1: " +Hex.geth1() + " is not less than "+ Hex.geth2());
                  	 }
                	break;
                case 8:
                	int decVal=0;
                	
                	do {
                	    try {
                	    	System.out.println("Enter decimal format number :");
                	    	decVal=scanner.nextInt();
                	    } catch (InputMismatchException e) {
                	        System.out.println("Invalid decimal number! ");
                	    }
                	    scanner.nextLine(); 
                	} while (decVal < 0);
                	
                	
                	String hexVal= Hex.decToHex(decVal);
                	System.out.println("converted to Hex:" + hexVal);
                	break;
                case 9:
                	System.out.println("Enter hexadecimal format number :");
                	hexVal=scanner.nextLine();
                	decVal=Hex.hexToDec(hexVal);
                	System.out.println("converted to Dec :" + decVal);
                	break;
                case 10:
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
        System.out.println("\t 4. Divide()");
		System.out.println("\t 5. equalto()");
		System.out.println("\t 6. lessThan()");
		System.out.println("\t 7. greaterThan()");
        System.out.println("\t 8. decimal to hex");
        System.out.println("\t 9. hex to dec");
        System.out.println("\t 10. Quit");
    }


}

