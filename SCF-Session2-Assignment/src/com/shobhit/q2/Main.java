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
            System.out.println("Enter the process " + (i + 1) + " arrival time and the burst time:");
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();

        }

        jsArray.setArray(array);
        jsArray.completionTime();


        

    }




}
