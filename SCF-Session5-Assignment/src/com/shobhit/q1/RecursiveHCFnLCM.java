package com.shobhit.q1;

/**
 * The class contains LCM and HCF methods 
 * @author Shobhit
 *
 */
public  class RecursiveHCFnLCM {
	
	private int multiple;
	
	/*
	 * This is a helper method for least common multiple
	 */
	public int leastCommonMultiple(int a,int b) {
		this.multiple = b;
		return leastCommonMultiple_1(a,b);
		
	}
	
	/**
	 * The method for computing HCF
	 * @param firstNumber 
	 * @param secondNumber
	 * @return
	 */
	public int highestCommonFactor(int firstNumber, int secondNumber){
		if(secondNumber==0)
			return firstNumber;
		return highestCommonFactor(secondNumber, firstNumber%secondNumber);
	}
	
	/**
	 * The main LCM method which is called by LCM helper method
	 * @param a firstNumber
	 * @param b secondNumber
	 * @return
	 * @throws AssertionError
	 */
	public  int leastCommonMultiple_1(int a, int b)throws AssertionError{  //Assuming b larger than a
		if(a==0 || b==0)
			throw new AssertionError("Invalid! 0 cannot be entered to find LCM");
		else{
			if(a>b)
				leastCommonMultiple_1(b,a); 
			 
					
			if(b%a ==0)
				return b;
			else{
				b+=multiple;
				return leastCommonMultiple_1(a,b);
			}
		}
			
		
	}
}
