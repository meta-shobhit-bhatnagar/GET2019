package com.shobhit.q2;

/**
 * The class contains methods for searching target value. It contains methods linearSearch and binarySearch
 * @author Shobhit
 *
 */
public class SearchElement {

	public int linearSearch(int[] arr, int searchItem, int index) {
		if(arr[index] == searchItem )
			return index;
		else if(index == arr.length+1)
			return -1;
		else
			return linearSearch(arr, searchItem, index+1);
	}

	public int binarySearch(int[] arr,int leftIndex, int rightIndex, int searchItem) {
		if(rightIndex >= leftIndex){
			int midIndex= leftIndex + (rightIndex- leftIndex)/2; 
			if(arr[midIndex] == searchItem)
				return midIndex;
			
			else if(searchItem < arr[midIndex] )
				return binarySearch(arr, leftIndex,midIndex-1, searchItem);
			else if(searchItem > arr[midIndex])
				return binarySearch(arr, midIndex+1, rightIndex, searchItem);
		}
		return -1;
	}

}
