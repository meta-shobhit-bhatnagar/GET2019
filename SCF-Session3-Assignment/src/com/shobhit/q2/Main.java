package com.shobhit.q2;


import java.util.Scanner;

public class Main {

    public static Scanner sc= new Scanner(System.in);
    public static Marksheet grades= new Marksheet();


    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no. of students :");
        n= sc.nextInt();
        int[] marksArray= new int[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter the grade of "+ (i+1) + " :");

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
                System.out.println("Enter positive integer");
            }
        }
        grades.setMarksArray(marksArray);
        grades.averageMarks();
        grades.maxMarks();

        System.out.println("Enter passing marks: ");
        int pass= sc.nextInt();
        grades.percentagePassing(pass);

    }
}
