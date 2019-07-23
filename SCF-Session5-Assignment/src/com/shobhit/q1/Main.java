package com.shobhit.q1;

import java.util.*;
/**
 * The program comutes HCF and LCM of two numbers using recursion implementation
 * @author Shobhit
 *
 */
public class Main {
	public static void main(String[] args){
		RecursiveHCFnLCM op= new RecursiveHCFnLCM();
		Scanner sc =new Scanner(System.in); 
		
		System.out.println("Program to calculate HCF and LCM");
		

		int choice=0;
		int firstNumber;
		int secondNumber;
		do{
			System.out.println("1.Find HCF\n2.Find LCM\n3.Exit\n\nEnter Your Choice");
			try{
				choice= sc.nextInt();
				
				switch(choice){
				
				case 1:
					try{
						System.out.println("Enter First Number :");
						firstNumber= sc.nextInt();
						System.out.println("Enter Second Number");
						secondNumber = sc.nextInt();
						if(firstNumber < 0 || secondNumber < 0){
							System.out.println("You entered negative values !! Try again");
							choice=1;
							break;
						}
					}catch(InputMismatchException e){
						System.out.println("That's an invalid number !! Try again");
						sc.nextLine();
						break;
					}					
					System.out.println("HCF :" + op.highestCommonFactor(firstNumber, secondNumber));
					break;
				case 2:
					try{
						System.out.println("Enter First Number :");
						firstNumber= sc.nextInt();
						System.out.println("Enter Second Number");
						secondNumber = sc.nextInt();
						if(firstNumber <= 0 || secondNumber <= 0){
							System.out.println("You did not enter positive values !! Try again");
							choice=2;
							break;
						}
					}catch(InputMismatchException e){
						System.out.println("That's an invalid number !! Try again");
						sc.nextLine();
						break;
					}	
					System.out.println("LCM :" + op.leastCommonMultiple(firstNumber, secondNumber));
					break;
				case 3:
					break;
					default: 
						System.out.println("Enter choice between 1 and 3!");
				}
				
			}
			catch(InputMismatchException e){
				System.out.println("Enter integer values only!");
				sc.nextLine();
			}
		}while(choice!=3);
	
	}		
}
