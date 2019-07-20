package com.shobhit.q1;

public  class RecursiveHCF_LCM {
	
	private int multiple;
	
	
	public int leastCommonMultiple(int a,int b) {
		this.multiple = b;
		return leastCommonMultiple_1(a,b);
		
	}
	public int highestCommonFactor(int firstNumber, int secondNumber){
		if(secondNumber==0)
			return firstNumber;
		return highestCommonFactor(secondNumber, firstNumber%secondNumber);
	}
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
