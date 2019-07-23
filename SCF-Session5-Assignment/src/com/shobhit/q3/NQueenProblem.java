package com.shobhit.q3;

/**
 * The class contains methods for computing whether it is possible to place N queens on
 * an NXN board
 * @author Shobhit
 *
 */
public class NQueenProblem {

	/**
	 * A class to keep track of positions of queens in position type of object
	 * @author Shobhit
	 *
	 */
    class Position {
        int row, col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    /**
     * 
     * @param positions
     * @param n
     */
    public void print(Position[] positions, int n){
    	for(int i=0; i<n; i++){
    		for(int j=0; j<n; j++){
    			if(positions[i].row== i && positions[i].col ==j)
    				System.out.print(" Q ");
    			else
    				System.out.print(" x");
    		}
    		System.out.println();
    	}
    }

    /**
     * The method is a helper method to compute NQueen solution
     * @param n size of chess board
     * @return
     */
    public boolean solveNQueenOneSolution(int n) {
        Position[] positions = new Position[n];
        boolean hasSolution = solveNQueenOneSolutionUtil(n, 0, positions);
        if (hasSolution) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The main method to compute NQueenSolution
     * @param n size of chess board
     * @param row it keeps track whether n equals true and tracks row number of board during execution
     * @param positions 
     * @return
     */
    private boolean solveNQueenOneSolutionUtil(int n, int row, Position[] positions) {
        if (n == row) {
        	print(positions,n);
            return true;
        }
        int col;
        for (col = 0; col < n; col++) {
            boolean foundSafe = true;

            //check if this row and col is not under attack from any previous queen.
            for (int queen = 0; queen < row; queen++) {
                if (positions[queen].col == col || positions[queen].row - positions[queen].col == row - col ||
                        positions[queen].row + positions[queen].col == row + col) {
                    foundSafe = false;
                    break;
                }
            }
            if (foundSafe) {
                positions[row] = new Position(row, col);
                if (solveNQueenOneSolutionUtil(n, row + 1, positions)) {
                    return true;
                }
            }
        }
        return false;
    }
}
