package com.shobhit.q2;

import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static JobScheduler jsArray = new JobScheduler();

    public static void main(String[] args) {
        System.out.println("Enter the number of processes you wish: ");
        int size = scanner.nextInt();

        int[][] array = new int[size][2];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the process " + (i + 1) + " arrival time :");
            array[i][0] = scanner.nextInt();
            System.out.println("Enter its burst time ");
            array[i][1] = scanner.nextInt();

        }

        jsArray.setArray(array);
        jsArray.completionTime();


        /*int choice=0;
        boolean quit=false;*/

        //printInstructions();


        /*while(!quit){
            System.out.println("Enter choice: ");
            choice= scanner.nextInt();

            printInstructions();

            switch(choice){
                case 1:
                    jsArray.completionTime();
                    break;
                case 2:
                    jsArray.waitingTime();
                    break;
                case 3:
                    jsArray.turnAroundTime();
                    break;
                case 4:
                    jsArray.averageWaitingTime();
                    break;
                case 5:
                    jsArray.maxWaitTime();
                    break;
                case 6:
                    quit= true;
                    break;


            }*/

    }


   /* public static void printInstructions(){
        System.out.println("1. completion time");
        System.out.println("2. waiting time");
        System.out.println("3. turn around time");
        System.out.println("4. average waiting time");
        System.out.println("5. max wait time");
        System.out.println("6. Quit");
    }*/



}
