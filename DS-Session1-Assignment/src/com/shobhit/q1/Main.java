package com.shobhit.q1;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		LinkedList llistRef=null;
		int choice=0;
		do{
			printInstructions();
			System.out.println("Enter your choice: ");
			try{
				choice= sc.nextInt();
				
				switch(choice){
				case 1: 
					System.out.println("Insert node... ");
					llistRef= insertNode(sc);
					break;
				case 2:
					System.out.println("Rotate subList... ");
					subList(llistRef, sc);
					break;
				case 3:
					llistRef.printList();
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Enter integer only!");
				choice=-1;
				sc.nextLine();
			}
			
		}while(choice!=5);
	}
	
	
	public static void printInstructions(){
		System.out.println("\n1.Insert a new node");
		System.out.println("2.To rotate a sublist of linkedList");
		System.out.println("3.Print the list");
	}
	
	public static LinkedList insertNode(Scanner sc){
		int entry,count=1;
		LinkedList llist= new LinkedList();
		
		System.out.println("Enter "+ " node value "+count);
		llist.head= new LinkedList.Node(sc.nextInt());
		do{
			try{
				System.out.println("Enter "+ " node value "+(count+1) );
				System.out.println("....Enter 911 to terminate linked list" );
				entry= sc.nextInt();
				if(entry== 911)
					break;
				llist.append(entry);
				count++;
			}
			catch(InputMismatchException e){
				System.out.println("Enter integer only!");
				entry=-1;
				sc.nextLine();
			}
			
		}while(entry!= -2);
		return llist;
		
	}
	
	public static void subList(LinkedList llistRef, Scanner sc){
		do{
			try{
				System.out.println("Enter left index of linked list(starting from 1)");
				int lIndex= sc.nextInt();
				System.out.println("Enter right index of linked list(starting from 1)");
				int rIndex= sc.nextInt();
				System.out.println("Enter N, no.of rotations for the subList");
				int N= sc.nextInt();
				llistRef.subListRotate(lIndex, rIndex, N);
				break;
			}catch(InputMismatchException e){
				System.out.println("Enter integer only!");
				sc.nextLine();
			}
		}while(true);
		
	}
}
