package com.shobhit.q2;

import java.util.ArrayList;

public class Poly {
	private int[][] array;

	public Poly(int[][] array) {
		this.array = array;
	}
	
	/**
	 *  return the degree of this polynomial (0 for the zero polynomial)
	 * @return degree of the polynomial
	 */
    public int degree(){
    	int d=0,temp=0;
        for(int i=0 ; i<this.array[0].length; i++){
        	temp=this.array[0][i];
        	if(temp>d)
        		d=temp;
        }
        return d;
    }
	
    /**
     * adds polynomials
     * @param p1
     * @param p2
     * @return returns 2d array of resultant
     */
	public int[][] addPoly(Poly p1, Poly p2){
			
		int p1Degree= p1.degree();	
		int p2Degree= p2.degree();
		
		if(p1Degree > p2Degree){
			int[][] sumArray = new int[2][p1Degree+1];
			for(int i=0; i<p1.array[0].length; i++){
				sumArray[0][i]=p1.array[0][i];	
				sumArray[1][i]= p1.array[1][i];			//initialising sumArray with polynomial of highest degree, here p1
			}
			
			for(int i=0; i<p1.array[0].length;i++){
				for(int j=0; j<p2.array[0].length; j++){
					if(p1.array[0][i]==p2.array[0][j]){
						sumArray[1][i]+= p2.array[1][j];
					}
				}
			}
			
			return sumArray;
		}else{
			int[][] sumArray = new int[2][p1Degree+1];
			for(int i=0; i<p2.array[0].length; i++){
				sumArray[0][i]=p2.array[0][i];	
				sumArray[1][i]= p2.array[1][i];			//initialising sumArray with polynomial of highest degree, here p1
			}
			
			for(int i=0; i<p2.array[0].length;i++){
				for(int j=0; j<p1.array[0].length; j++){
					if(p1.array[0][i]==p1.array[0][j]){
						sumArray[1][i]+= p1.array[1][j];
					}
				}
			}
			return sumArray;
		}
		
		
}		
	/**
	 * evaluates value of polynomial at a particular key value
	 * @param key
	 * @return	returns float value of the polynomial
	 */
	public float evaluate(float key){
		float result=0.00f;
		
		for(int i=0; i<=this.degree(); i++){
			if(this.array[1][i]==0)
				i++;
			else{
				result += (float)Math.pow(key,array[0][i]) * array[1][i];
			}
		}
		
		return result;
	}
	
	/**
	 * multiplies two polynomials and returns the resultant array
	 * @param p1
	 * @param p2
	 * @return
	 */
	public int[][] multiplyPoly(Poly p1, Poly p2){
		
		int[][] productArray = new int[2][p1.degree() + p2.degree() +1];
		
		for(int i=0; i<p1.array[0].length;i++){
			for(int j=0; j<p2.array[0].length;j++){
					int index= p1.array[0][i] + p2.array[0][j];
					int coeff= p1.array[1][i] * p2.array[1][j];
					
					if(productArray[0][index]==0)
						productArray[0][index]=index;
					
					productArray[1][index] += coeff;
			}
		}
		int count=0;
		for(int i=0; i<productArray[0].length; i++){
			if(productArray[1][i]==0);
			else
			count++;
		}
		
		int[][] newArr= new int[2][count];
		int index=0;
		for(int i=0; i<productArray[0].length; i++){
			
				if(productArray[0][i]==0 && productArray[1][i]==0){
					;
				}else{
					newArr[0][index]= productArray[0][i];
					newArr[1][index]= productArray[1][i];
					index++;
				}
				
		}
		
/*		for(int i=0; i<newArr[0].length; i++){
			for(int j=0; j<newArr[0].length; j++){				//for the purpose of dry run
			System.out.print(newArr[i][j]+ " ");
			}System.out.println();
		}
*/		return newArr;
		
	}
}
