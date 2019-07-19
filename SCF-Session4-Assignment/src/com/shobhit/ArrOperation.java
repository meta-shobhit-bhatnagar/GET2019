package com.shobhit;

import java.util.*;
/**
 * contains methods for various array operations 
 * @author Shobhit
 *
 */

public class ArrOperation {

	/**
	 * Computes the largest section of mirror element that can be found in an array
	 * @param arr
	 * @return lengthOfMirror
	 * @throws AssertionError
	 */
	public static int largestMirrorSize(int[] arr)throws AssertionError {


		int lengthOfMirror = 0;
		int tempLength = 0;
		if(arr.length==0){
			throw new AssertionError("Null Array Found");
		}else{
			for(int i=0; i<arr.length; i++){
				int pivotIndex=i;
				tempLength=0;
				for(int j=arr.length-1; j>=i;){
					if(arr[pivotIndex]==arr[j]){
						tempLength++;
						pivotIndex++;
						j--;
					}else if(tempLength > 0){
						if(tempLength > lengthOfMirror){
							lengthOfMirror = tempLength;
							tempLength = 0;
							pivotIndex = i;
						}else{
							tempLength = 0;
							pivotIndex = i;
						}	
					}else{
						tempLength = 0;
						pivotIndex = i;
						j--;
					}
				}
				if(tempLength>lengthOfMirror) lengthOfMirror=tempLength;

			}
		}

		return lengthOfMirror;
	}


	/**
	 * 	Computes no. of same group elements in the input array
	 * @param arrOfIntegers
	 * @return countClump
	 * @throws AssertionError
	 */
	public static int numberOfClumps(int[] arrOfIntegers) throws AssertionError{
		int countAdjacent = 0;
		int countClumps = 0;
		if(arrOfIntegers.length == 0){
			throw new AssertionError("Empty Array Found");
		}else{
			for(int i=0; i<arrOfIntegers.length-1; i++){
				if(arrOfIntegers[i] == arrOfIntegers[i+1]){
					countAdjacent++;
				}else if(countAdjacent > 0){
					countClumps++;
					countAdjacent = 0;
				}else{
					continue;
				}
			}
			if(countAdjacent > 0){
				countClumps++;
			}
		}

		return countClumps;
	}

	/**
	 * computes an array where every X is immediately followed by a Y
	 * @param X
	 * @param Y
	 * @param arrOfIntegers
	 * @return newArrayAfterFixXY
	 * @throws AssertionError
	 */
	public static int[] fixXY(int X, int Y, int[] arrOfIntegers) throws AssertionError{
		int newArrayAfterFixXY[] = new int[arrOfIntegers.length];
		if(arrOfIntegers.length == 0){
			throw new AssertionError("Empty Array Found");
		}else{
			ArrayList<Integer> indexListOfY = new ArrayList<Integer>();
			int numberOfX = 0;
			for(int i=0; i<arrOfIntegers.length; i++){
				newArrayAfterFixXY[i] = arrOfIntegers[i];
				if(X== arrOfIntegers[i]){
					numberOfX++;
				}
				if(Y == arrOfIntegers[i]){
					indexListOfY.add(i);
				}else{
					continue;
				}
			}
			if(indexListOfY.size() == 0){
				throw new AssertionError("Y is not Found");
			}else if(numberOfX != indexListOfY.size()){
				throw new AssertionError("X and Y unequal");
			}else{
				int indexOfList = 0;
				for(int i=0; i<newArrayAfterFixXY.length ; i++){
					if(X == newArrayAfterFixXY[i]){
						if( i == newArrayAfterFixXY.length -1){
							throw new AssertionError("X occurs at last index");
						}else{
							if(newArrayAfterFixXY[i] == newArrayAfterFixXY[i+1]){
								throw new AssertionError("Two Adjacent X values here");
							}else{
								int tempValue = newArrayAfterFixXY[i+1];
								newArrayAfterFixXY[i+1] = newArrayAfterFixXY[indexListOfY.get(indexOfList)];
								newArrayAfterFixXY[indexListOfY.get(indexOfList++)] = tempValue;
							}
						}
					}
				}
			}
		}

		return newArrayAfterFixXY;
	}

	/**
	 * Computes the index of the input array where it can be split so that sum on both sides of split index are equal
	 * @param arrOfIntegers
	 * @return index
	 */
	public static int indexOfSplitArray(int[] arrOfIntegers){
		int index = -1;
		if(arrOfIntegers.length == 0){
			throw new AssertionError("Null Array Found");
		}else{
			int leftSideSum = 0;
			int rightSideSum = 0;
			for(int i =0; i<arrOfIntegers.length ; i++){
				rightSideSum += arrOfIntegers[i]; 
			}
			for(int i=0; i<arrOfIntegers.length; i++){
				if(leftSideSum<rightSideSum){
					leftSideSum += arrOfIntegers[i];
					rightSideSum -= arrOfIntegers[i];
				}else if(leftSideSum == rightSideSum){
					index = i;
					break;
				}else{
					break;
				}
			}
		}		
		return index;
	}
}
