package com.shobhit.q3;

import java.util.Scanner;

public class Main {

    private static Scanner sc= new Scanner(System.in);
    public static Area area= new Area();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;


        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
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

    public static double validate(){
        double dimension;
        do{
            System.out.println("Enter positive number :");
            while(!sc.hasNextDouble()){
                System.out.println("Enter double :");
                sc.next();
            }dimension= sc.nextDouble();
        }while(dimension<0);

        return dimension;
    }

    public static void triangleArea(){
        System.out.println("Enter width :");
        double width= validate();
        System.out.println("Enter height :");
        double height= validate();

        double tArea= area.triangleArea(width, height);
        System.out.println("Area of triangle is :"+ tArea);
    }

    public static void rectangleArea(){
        System.out.println("Enter width :");
        double width= validate();
        System.out.println("Enter height :");
        double height= validate();

        double rArea= area.rectangleArea(width, height);
        System.out.println("Area of rectangle is : "+ rArea);
    }

    public static void squareArea(){
        System.out.println("Enter width :");
        double width= validate();

        double sArea= area.squareArea(width);
        System.out.println("Area of square is : "+ sArea);
    }

    public static void circleArea(){
        System.out.println("Enter radius :");
        double radius= validate();


        double cArea= area.circleArea(radius);
        System.out.println("Area of circle is : "+ cArea);
    }




}


