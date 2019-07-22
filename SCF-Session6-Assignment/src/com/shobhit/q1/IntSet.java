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
	public int[] union(IntSet s1, IntSet s2){
		Arrays.sort(s1.array);
		Arrays.sort(s2.array);
		IntSet unionSet;
		
		ArrayList<Integer> unionArr= new ArrayList<Integer>();
		if(s1.size==0){
			unionSet= s2;
		}else if(s2.size==0)
			unionSet= s2;
		else{
			
			int i=0,j=0;
			
			while(i< s1.size && j<s2.size){
				if(s1.array[i] < s2.array[j]){
					unionArr.add(Integer.valueOf(s1.array[i]));
					i++;					
				}else if(s1.array[i] > s2.array[j]){
					unionArr.add(Integer.valueOf(s2.array[j]));
					j++;
				}else{
					unionArr.add(Integer.valueOf(s1.array[i]));
					i++;
					j++;
				}				
			}
			
			if(i< s1.size){
				for(;i<s1.size; i++)
					unionArr.add(Integer.valueOf(s1.array[i]));
			}
			
			if(j< s2.size){
				for(;j<s2.size; j++)
					unionArr.add(Integer.valueOf(s2.array[j]));
			}			
		}
		int[] result = new int[unionArr.size()];
	    Iterator<Integer> iterator = unionArr.iterator();
	    for (int i = 0; i < result.length; i++)
	    {
	        result[i] = iterator.next().intValue();
	    }
	    
	    unionSet  = new IntSet(result);
	    
//	    return unionSet;
	    return result;
	}
	
/**
 * 	This computes if the set passed as parameter is a subset of object
 * @param s1
 * @return returns true if it's a subset otherwise false
 */
	public boolean isSubset(IntSet s1){
		int [] s1Arr= new int[s1.size];
		
		for(int i=0; i<s1Arr.length; i++){
			if(!isMember(s1Arr[i])){
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
		for(int i=1; i<=1000; i++){
			if(i== this.array[i])
				i++;
			else
				complementArr[i]= i;
		}
		IntSet complementSet = new IntSet(complementArr);
//		return complementSet;
		return complementArr;
	    
	}
		
		
	
	

	
	
}
