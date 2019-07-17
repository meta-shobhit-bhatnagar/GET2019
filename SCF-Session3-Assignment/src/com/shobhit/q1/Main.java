package com.shobhit.q1;


import java.util.*;


public class Main {

    public static Scanner sc= new Scanner(System.in);
    public static Operation op= new Operation();

    public static void main(String[] args){
        String s1;
        String s2;
        int choice=0;
        boolean quit = false;
        
        printInstructions();
        
        
        
while (!quit) {
        	
            do {
        	    try {
        	    	System.out.println("Enter your choice:");
        	    	choice = sc.nextInt();
        	    } catch (InputMismatchException e) {
        	        System.out.println("Invalid choice! ");
        	    }
        	    sc.nextLine(); 
        	} while (choice < 0);
            
            
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                	System.out.println("Comparing :\nEnter first string: ");
                    s1= sc.nextLine();
                    System.out.println("Enter second string: ");
                    s2= sc.nextLine();

                    op.set(s1,s2);
                    int flg= op.compare();
                    if(flg ==1)
                        System.out.println("Same");
                    else
                        System.out.println("Not same");
                    break;
                case 2:
                	System.out.println("Enter string to get reverse string: ");
                    s1= sc.nextLine();
                    System.out.println("Reversed string : "+ op.reverse(s1));
                    break;
                case 3:
                	//change lower case to upper case and vice-versa
                    System.out.println("Enter string for changing case ");
                    s1= sc.nextLine();
                    System.out.println("new string: "+ op.reverseCase(s1));
                    break;
                case 4:
                	 System.out.println("Enter the sentence: ");
                     s1=sc.nextLine();
                     op.longestWord(s1);
                    break;
                case 5:
                    quit= true;
                    break;
                
            }
        }
        
        
     

    }
    
    public static void printInstructions() {
        System.out.println("\t 0.  To print Instructions");
        System.out.println("\t 1.  To compare strings");
        System.out.println("\t 2.  To reverse string");
        System.out.println("\t 3.  To replace lowercase characters with uppercase and vice-versa");
        System.out.println("\t 4.  To return the largest word of a string");
        System.out.println("\t 5.  To quit");
        
    }



}
