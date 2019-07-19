package com.shobhit;

import java.util.*;

/**
 * 
 * @author Shobhit
 *
 */

public class Main {
	public static void main(String[] args){
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array :");
		int[] arr=null;
		try{
			int lengthOfArray= sc.nextInt();
			arr= new int[lengthOfArray];
			for(int i = 0; i<lengthOfArray;){
				try{
					System.out.println("Enter value of " + (i+1) + " element");
					arr[i] = sc.nextInt();
					if(arr[i] < 1){
						System.out.println("Enter positive integer only");
					}else{
						i++;
					}
				}catch(InputMismatchException e){
					System.out.println("That's not an Integer !! Try Again ");
					sc.next();
				}
			}
		}
		catch(NegativeArraySizeException e){
			System.out.println("Array length cannot be a negative integer! Enter again");
			main(args);
		}catch(InputMismatchException e){
			System.out.println("That's not an integer! Enter again");
			main(args);
		}
		
		int choice=0;
		
		do{
			try{
				printInstructions();
				System.out.println("Enter your choice :");
				choice= sc.nextInt();
				
				switch(choice){
				case 1: 
					System.out.println("Size of the largest Mirror section : " + ArrOperation.largestMirrorSize(arr));
					break;
				case 2:
					System.out.println("Number of clumps :"+ ArrOperation.numberOfClumps(arr));
					break;
				case 3:
					int X,Y;
					System.out.println("Enter value of X:");
					X = sc.nextInt();
					System.out.println("Enter value of Y:");
					Y = sc.nextInt();
					int[] rearrangedArray= ArrOperation.fixXY(X, Y, arr);
					System.out.println("Rearranged array after fix :");
					for(int i=0; i<arr.length; i++){
						System.out.print(" " + arr[i]);
					}
					
					break;
				case 4:
					System.out.println("Split Index of array  : " + ArrOperation.indexOfSplitArray(arr));
				
				case 5:
					break;
					default: 
						System.out.println("Invalid choice! Enter between 0 and 5");
				}
				
				
			}catch(AssertionError e){
				System.out.println("Assertion Error : " + e);
			}catch(InputMismatchException e){
				System.out.println("Enter integer only!");
				choice=-1;
				sc.nextLine();
			}
		}while(choice!=5);
		
	}
	
	
	public static void printInstructions(){
		System.out.println("1.Largest Mirror Section");
		System.out.println("2.Number of clumps");
		System.out.println("3.Array after fixXY");
		System.out.println("4.Split Index of array");
		System.out.println("5.Exit");
	}
	
	
}
