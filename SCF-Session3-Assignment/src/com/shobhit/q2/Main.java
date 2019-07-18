package com.shobhit.q2;


import java.util.*;

/**
 * Program computes Marksheet of the students on the basis of their grades
 * @author Shobhit
 * @version 1.0
 */

public class Main {

    public static Scanner sc= new Scanner(System.in);
    public static Marksheet grades= new Marksheet();


    public static void main(String[] args) {
        int n=0;
        
        do {
        	
    	    try {
    	    	System.out.println("Enter the no. of students :");
    	    	n= sc.nextInt();
                if(n<0)
        		System.out.println("Enter positive integer!");
    	    } catch (InputMismatchException e) {
    	        System.out.println("No. of students should be integer ");
                n=-1;
    	    }
    	    sc.nextLine(); 
    	} while (n <=0);
     
        
        int[] marksArray= new int[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter the grade of "+ "student "+ (i+1) +" :");

            if(sc.hasNextInt()){
                int temp= sc.nextInt();
                if(temp<0){
                    System.out.println("That's a negative number");
                    i--;
                    continue;
                }
                else if(temp>100){
                    System.out.println("That's greater than 100");
                    i--;
                    continue;
                }
                marksArray[i]= temp;
            }
            else{
                i--;
                sc.next();
                System.out.println("Enter positive integer only");
            }
        }
        
        int pass=40;
        do{
        	try{
        		System.out.println("Enter passing marks greater than equal 40: ");
        		pass= sc.nextInt();
        		if(pass<40 || pass>100)
        			System.out.println("Passing marks should be entered between 40 and 100");
        	}
        	catch(InputMismatchException e){
        		System.out.println("Invalid entry! Please check ");
        		pass=-1;
        	}
        	sc.nextLine();
        	
        }while(pass<40);
        
        grades.setMarksArray(marksArray);
        grades.averageMarks();
        grades.maxMarks();

        
        
        grades.percentagePassing(pass);

    }
}
