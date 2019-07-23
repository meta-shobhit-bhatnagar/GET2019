package com.shobhit.q3;

import java.util.*;

/*
 * The program is based on the problem set NQueen. It computes whether
 * it is possible to place say, N queens on an NXN chess board 
 */
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Chess Board Size  ");
		try{
			int boardSize = sc.nextInt();
			NQueenProblem  nqObj = new NQueenProblem(); 
			if(boardSize < 1){
				System.out.println("Board size cannot be less than 1 ");
				main(args);
				
			}
			boolean result = nqObj.solveNQueenOneSolution(boardSize);
			if(result == true){
				System.out.println("Output : True\nSolution is possible for "+ boardSize + "x"+ boardSize);				
			}else{
				System.out.println("Output : False\nSolution is not possible for "+ boardSize + "x"+ boardSize);
			}
			
			main(args);
		}catch(InputMismatchException e){
			System.out.println("Please enter only integer value");
			sc.nextLine();
			main(args);
		}
		

	}

}