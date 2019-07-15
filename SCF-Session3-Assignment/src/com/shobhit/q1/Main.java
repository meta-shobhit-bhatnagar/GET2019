package com.shobhit.q1;


import java.util.Scanner;

public class Main {

    public static Scanner sc= new Scanner(System.in);
    public static Operation op= new Operation();

    public static void main(String[] args){
        String s1;
        String s2;

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


        System.out.println("Enter string to get reverse string: ");
        s1= sc.nextLine();
        System.out.println("Reversed string : "+ op.reverse(s1));

        //change lower case to upper case and vice-versa
        System.out.println("Enter string for changing case ");
        s1= sc.nextLine();
        System.out.println("new string: "+ op.reverseCase(s1));


        System.out.println("Enter the sentence: ");
        s1=sc.nextLine();
        op.longestWord(s1);

    }



}
