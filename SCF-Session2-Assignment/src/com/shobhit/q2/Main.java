package com.shobhit.q2;

import java.util.*;

/**
    *JobScheduler to simulate FCFS (First Come First Serve) scheduling algorithm which means 
    *the process which arrives first, gets executed first. 
    *@author Shobhit
*/
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static JobScheduler jsArray = new JobScheduler();

    public static void main(String[] args) {
        
        int process = 0;
        do{
        	try{
        		System.out.println("Enter the number of processes you wish: ");
        		process= scanner.nextInt();
        		
        	}
        	catch(InputMismatchException e){
        		System.out.println("Enter positive integer only! ");
        	}
        	scanner.nextLine();
        }while(process<=0);
        

        int[][] array = new int[process][2];

        for (int i = 0; i < process; i++) {
            
            
            
            do{
            	if(array[i][0]==0 && array[i][1]==0){
            		System.out.println("Burst time can't be zero");
            	}
            	try{
            		System.out.println("Enter the process " + (i + 1) + " arrival time and the burst time:");
            		array[i][0] = scanner.nextInt();
            		array[i][1] = scanner.nextInt();
            	}
            	catch(InputMismatchException e){
            		System.out.println("Enter integer only! ");
            	}
            	scanner.nextLine();
            }while(array[i][0]<0 || array[i][1]<=0);
            
            
            

        }

        jsArray.setArray(array);
        jsArray.completionTime();


        

    }




}
