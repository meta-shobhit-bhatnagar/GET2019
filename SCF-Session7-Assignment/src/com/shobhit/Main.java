package com.shobhit;

import java.util.*;

/**
 * The program computes operations on sparse matrix such as transpose
 * addition and multiplication
 * @author Shobhit
 *
 */

public class Main {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args){
				
		System.out.println("Sparse Matrix program\n");
		
		int[][] arr=null;
		int row=0;
		int col=0;
		try{	
			do{
				System.out.println("Enter positive integer only!");
				System.out.println("Enter length of row :");
				row= sc.nextInt();
				System.out.println("Enter length of column :");
				col= sc.nextInt();
			}while(row<=0 || col<=0);
			
			arr= new int[row][col];
			for(int i = 0; i<arr.length;i++)
				for(int j=0; j<arr[i].length;){
					try{
						System.out.println("Enter value of element at row " + (i+1) + " and column "+ (j+1));
						arr[i][j] = sc.nextInt();
						if(arr[i][j] < 0){
							System.out.println("Enter positive integer only");
						}else{
							j++;
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
		SparseMatrix sp= new SparseMatrix(arr);
		
		int choice=0;
		
		do{
			try{
				printInstructions();
				System.out.println("Enter your choice :");
				choice= sc.nextInt();
				
				switch(choice){
				case 0:
					main(args);
				case 1: 
					System.out.println("Transpose of the matrix is: "); 
					printMatrix(sp.getTranspose());
					break;
				case 2:
					if(sp.isSymmetrical()){
						System.out.println("Yes, the matrix is Symmetrical");
					}						
					else{
						System.out.println("No, the matrix is not Symmetrical");
					}
					break;
				case 3:
					System.out.println("Enter second matrix");
					SparseMatrix sp2=secondMatrix();
					if(sp2 == null){
						//choice=3;
						break;
					}else{
						System.out.println("Addition of two matrices is: ");
						printMatrix(sp.addMatrix(sp2));
					}				
					break;
				case 4:
					System.out.println("Enter second matrix");
					SparseMatrix sp3=secondMatrix();
					if(sp3 == null){
						//choice=4;
						break;
					}else{
						System.out.println("Multiplication of two matrices is: ");
						printMatrix(sp.multiplyMatrix(sp3));
					}				
					break;				
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
	
	/**
	 * prints options for the user to choose from
	 */
	public static void printInstructions(){
		System.out.println("0.Re-write first matrix");
		System.out.println("1.Transpose of matrix");
		System.out.println("2.Is matrix symmetric");
		System.out.println("3.Add two matrices");
		System.out.println("4.Multiply two matrices");
		System.out.println("5.Exit");
	}
/**
 * method for printing 2-D normal matrix 	
 * @param Nmatrix
 */
	public static void printMatrix(int [][] Nmatrix){
		
		for(int i=0; i<Nmatrix.length; i++){
			for(int j=0; j<Nmatrix[0].length; j++){
				System.out.print(Nmatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * method inputs secondMatrix from user 
	 * @return returns SparseMatrix
	 */
	public static SparseMatrix  secondMatrix(){
		
		int[][] arr=null;
		try{
			int r;
			int c;
			do{
				System.out.println("Enter positive integer only!");
				System.out.println("Enter length of row :");
				r= sc.nextInt();
				System.out.println("Enter length of column :");
				c= sc.nextInt();
			}while(r<=0 || c<=0);
			
			arr= new int[r][c];
			for(int i = 0; i<arr.length;i++)
				for(int j=0; j<arr[i].length;){
					try{
						System.out.println("Enter value of element at row " + (i+1) + " and column "+ (j+1));
						arr[i][j] = sc.nextInt();
						if(arr[i][j] < 0){
							System.out.println("Enter positive integer only");
						}else{
							j++;
						}
					}catch(InputMismatchException e){
						System.out.println("That's not an Integer !! Try Again ");
						sc.next();
					}
				}
		}
		catch(NegativeArraySizeException e){
			System.out.println("Array length cannot be a negative integer! Enter again");
			return null;
		}catch(InputMismatchException e){
			System.out.println("That's not an integer! Enter again");
			return null;
		}
		SparseMatrix sp2 = new SparseMatrix(arr);
		return sp2;
	}
	
}
