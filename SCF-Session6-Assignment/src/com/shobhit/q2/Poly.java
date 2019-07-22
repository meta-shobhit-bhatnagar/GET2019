package com.shobhit.q2;

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
        int d = 0;
        for( int i = 0; i < this.array[0].length; i++ )
            if( array[0][i] != 0 ) d = i;
        return d;
    }
	
	public int[][] addPoly(Poly p1, Poly p2){
		int maxDegree=p1.degree();//p1
		int p1Degree= maxDegree;
		int p2Degree= p2.degree();
		
		if(p1Degree < p2Degree){
			maxDegree= p2Degree;
		}
		
		
			
		
		int[][] sumArray = new int[2][maxDegree+1];
		
		for(int i=maxDegree;i>=0; i--){
			if(i-p2Degree > 0){
				sumArray[0][i]= p1.array[0][i];
				sumArray[1][i]= p1.array[1][i];
			}
			else if(i-p1Degree >0){
				sumArray[0][i]= p2.array[0][i];
				sumArray[1][i]= p2.array[1][i];
			}				
			else{
				if(p1.array[0][i]==i && p2.array[0][i]==i ){
					sumArray[0][i]=i;
					sumArray[1][i]= p1.array[1][i] + p2.array[1][i];
				}
				else if(p1.array[0][i]!=i && p2.array[0][i]!=i);
				else if(p1.array[0][i]==i){
					sumArray[0][i]=i;
					sumArray[1][i]= p1.array[1][i];
				}
				else{
					sumArray[0][i]=i;
					sumArray[1][i]= p2.array[1][i];
				}	
			}
				
		}
		
		return sumArray;	
	}
	
	
	public float evaluate(float key){
		float result=0.00f;
		
		for(int i=0; i<=this.degree(); i++){
			if(this.array[0][i]!=i)
				i++;
			else{
				result += (float)Math.pow(key,array[0][i]) * array[1][i];
			}
		}
		
		return result;
	}
	
	
	public int[][] multiplyPoly(Poly p1, Poly p2){
		
		int[][] productArray = new int[2][p1.degree() + p2.degree() +2];
		
		for(int i=0; i<= p1.degree(); i++){
			if(p1.array[0][i]!=0){
				for(int j=0; j<=p2.degree(); j++){
					if(p2.array[0][j]!=0){
						productArray[0][i+j]= i+j;
						productArray[1][i+j]= p1.array[1][i] * p2.array[1][j];
					}					
				}
			}
		}
		return productArray;
		
	}
}
