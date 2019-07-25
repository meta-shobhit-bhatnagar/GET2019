package com.shobhit.q1;

import java.util.*;
/**
 * IntSet class defines various methods like union complement on the set
 * @author Shobhit
 *
 */
public final class IntSet {

	
	private final int[] array;
	private final int size;
/**
 * It's a constructor IntSet which initializes object of IntSet type	
 * @param setArray
 */
	public IntSet(int[] setArray) {
		
		this.array = removeDuplicate(setArray);
		this.size = setArray.length;
	}
	

/*
 * This method removes duplicates from the set initialized
 */
	int[] removeDuplicate(int input[])
	{
		
		int end=input.length;
		for(int i=0;i<end;i++){
			for(int j=i+1;j<end;j++){
				if(input[i]==input[j]){       //if found an duplicate element ..shift array by one index 
					int shl =j;
					
					for(int k=j+1;k<end;k++){
						input[shl++]=input[k];
					}
					end--;
					j--;
				}
				
			}
		}
		
		int result[]=new int[end];								
		for(int i = 0; i < end; i++){					//storing it in reduced array
	        result[i] = input[i];
	    }
	    return result;
	
		
	}
	
	/**
	 * To calculate size of set
	 * @return Returns size of set
	 */
	public int sizeOfSet(){
		return this.size;
	}

	public boolean isMember(int x){
		boolean isMember= false;
		
		for(int i=0; i<size; i++){
			if(array[i]== x){
				isMember= true;
				break;
			}
		}
		return isMember;
	}
/**
 * The method performs union operation on sets passed as parameter	
 * @param s1 of IntSet class
 * @param s2 of IntSet class
 * @return
 */
	
	
	public int[] union(IntSet set1, IntSet set2) {
		
		int addedLength=0;
		for(int index1 = 0; index1 < set2.size; index1++)
			if(!set1.isMember(set2.array[index1]))
				addedLength++;
			
		int [] array = new int[set1.size + addedLength];
		int index = 0;
		for(int index1 = 0; index1 < set1.size; index1++) {
			array[index] = set1.array[index1];
			index++;
		}
		for(int index1 = 0; index1 < set2.size; index1++) {
			if(!set1.isMember(set2.array[index1])) {
				array[index] = set2.array[index1];
				index++;
			}
		}
		return array;
	}
	
		
/**
 * 	This computes if the set passed as parameter is a subset of object
 * @param s1
 * @return returns true if it's a subset otherwise false
 */
	public boolean isSubset(IntSet s1){
				
		for(int i=0; i<s1.array.length; i++){
			if(!isMember(s1.array[i])){
				return false;
			}				
		}
		return true;	
	}
/**
 * This method computes complement of the set where universal set 
 * is defined for 1-1000	
 * @return returns integer array 
 */
	public int[] getComplement(){
		int[] complementArr= new int[1000- this.size];
		
		Arrays.sort(this.array);
		int index=0;
		for(int i=1; i<= 1000; i++){
			if(!this.isMember(i)){
				complementArr[index] = i;
				index++;
			}	
		}
		IntSet complementSet = new IntSet(complementArr);
//		return complementSet;
		return complementArr;
	    
	}
		
		
	
	

	
	
}
