package com.shobhit.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The program calculates area of rectangle, square, triangle and circle
 *
 */
public class Main {

    private static Scanner sc= new Scanner(System.in);
    public static Area area= new Area();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;


        printInstructions();

        while (!quit) {
        	
        	
        	do {
        		
        	    try {
        	    	System.out.println("Enter your choice:");
        	    	  choice = sc.nextInt();
                    if(choice<0 || choice >5)
        			System.out.println("Invalid choice!");
        	    } catch (InputMismatchException e) {
        	        System.out.println("Invalid choice! Enter integer only");
        	        choice=-1;
        	    }
        	    sc.nextLine(); 
        	} while (choice < 0);
   
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    triangleArea();
                    break;
                case 2:
                    rectangleArea();
                    break;
                case 3:
                    squareArea();
                    break;
                case 4:
                    circleArea();
                    break;
                case 5:
                    quit= true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\t 0.  To re-print Instructions");
        System.out.println("\t 1.  Area of triangle");
        System.out.println("\t 2.  Area of rectangle");
        System.out.println("\t 3.  Area of square");
        System.out.println("\t 4.  Area of circle");
        System.out.println("\t 5.  To quit");
    }
    //this method is optional. According to question height, width, radius are greater than 0
    /**
     * It validates whether the entered dimension is double only
     * @return dimension returns double value of dimension
     */
    public static double validate(){
        double dimension=0;
        
        
        do {
        	if(dimension<-0.10)
        		System.out.println("Enter positive value only :");
    	    try {
    	    	dimension = sc.nextDouble();
    	    } catch (InputMismatchException e) {
    	        System.out.println("Invalid ! Enter double only :");
    	        dimension= -0.10;
    	    }
    	    sc.nextLine(); 
    	} while (dimension < 0);
        
        return dimension;
    }
    
    /**
     * helping methods to calculate area
     */
    public static void triangleArea(){
        System.out.println("Enter width of the triangle:");
        double width= validate();
        System.out.println("Enter height of the triangle:");
        double height= validate();

        double tArea= area.triangleArea(width, height);
        System.out.println("Area of triangle is :"+ tArea);
    }
    /**
     * helping methods to calculate area
     */
    public static void rectangleArea(){
        System.out.println("Enter width of rectangle :");
        double width= validate();
        System.out.println("Enter height of rectangle :");
        double height= validate();

        double rArea= area.rectangleArea(width, height);
        System.out.println("Area of rectangle is : "+ rArea);
    }

    /**
     * helping methods to calculate area
     */
    public static void squareArea(){
        System.out.println("Enter width of square :");
        double width= validate();

        double sArea= area.squareArea(width);
        System.out.println("Area of square is : "+ sArea);
    }

    /**
     * helping methods to calculate area
     */
    public static void circleArea(){
        System.out.println("Enter radius of the circle :");
        double radius= validate();


        double cArea= area.circleArea(radius);
        System.out.println("Area of circle is : "+ cArea);
    }




}


