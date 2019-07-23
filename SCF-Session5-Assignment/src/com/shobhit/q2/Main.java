package com.shobhit.q2;

import java.util.*;

/**
 * The program contains linearSearch and binarySearch 
 * @author Shobhit
 *
 */
public class Main {
		public static void main(String[] args){
			
			Scanner sc =new Scanner(System.in); 
			SearchElement searchTarget= new SearchElement();
			System.out.println("Program for searching an element");
			
			int choice=0;
			
			System.out.println("Enter length of array :");
			int[] arr=null;
			
			try{
				int lengthOfArray= sc.nextInt();
				arr= new int[lengthOfArray];
				for(int i = 0; i<lengthOfArray;){
					try{
						System.out.println("Enter value of " + (i+1) + " element");
						arr[i] = sc.nextInt();
						i++;
						
					}catch(InputMismatchException e){
						System.out.println("That's not an Integer !! Try Again ");
						sc.nextLine();
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
			
			
			do{
				System.out.println("1.Linear search\n2.Binary Search\n3.Exit\n4.Re-enter array\n\nEnter Your Choice");
				try{
					choice= sc.nextInt();
					
					switch(choice){
					
					case 1:
						try{
							System.out.println("Enter the number you wish to search:");
							int targetVal= sc.nextInt();
							System.out.println("The target value is present at " + " index "+ searchTarget.linearSearch(arr,targetVal,0));
							break;
							
						}catch(InputMismatchException e){
							System.out.println("That's an invalid searchItem !! Try again");
							sc.nextLine();
							break;
						}					
						
					case 2:
						try{
							System.out.println("Enter the number you wish to search:");
							int targetVal= sc.nextInt();	
							System.out.println("The target value is present at"+  " index " + searchTarget.binarySearch(arr,0, arr.length-1,targetVal));
							break;
							}
						catch(InputMismatchException e){
							System.out.println("That's an invalid number !! Try again");
							sc.nextLine();
							break;
						}	
						
					case 3:
						break;
					case 4:
						main(args);
						break;
						default: 
							System.out.println("Enter choice between 1 and 4!");					
				    }
				}
				catch(InputMismatchException e){
					System.out.println("Enter integer values only!");
					sc.nextLine();
				}
				
			}while(choice!=3);
			
			
		}
}
