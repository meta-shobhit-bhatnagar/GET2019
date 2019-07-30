package com.shobhit.q2;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.shobhit.q1.LinkedList;

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
					System.out.println("Detect a loop ");
					DetectLoop isLoop= new DetectLoop();
					if(!isLoop.foundLoop()){
						System.out.println("Loop not found");
						llistRef.printList();
					}						
					break;
				case 3:
					break;
				default:
					System.out.println("Enter between 1 and 2, and press 3 to exit");
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Enter integer only!");
				choice=-1;
				sc.nextLine();
			}

		}while(choice!=3);
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
				System.out.println("Enter node value "+(count+1) );
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
}
