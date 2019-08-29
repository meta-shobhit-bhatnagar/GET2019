package com.shobhit.q1;


/**
 * This class describes the implementation of Stack using array.
 * 
 * @author Shobhit
 *
 */
public class StackArray implements StackInterface {
	int topElement = -1;
	int size;
	String stackArray[];

	public StackArray(int size){
		this.size= size;
		stackArray= new String[size];
	}


	public boolean push(String newElement) throws StackException {
		if (newElement == null) {
			throw new NullPointerException("String cannot be null");				//Unchecked Exception
		}
		if (topElement == size) {
			throw new StackException("Stack is Full!");
		}
		topElement++;
		stackArray[topElement] = newElement;		
		return true;
	}

	public String pop() throws StackException {
		String returnItem;
		if (topElement == -1) {
			throw new StackException("Stack Underflow");
		}
		returnItem = stackArray[topElement];
		topElement--;
		return returnItem;
	}


	public boolean isEmpty() {
		return (topElement == -1 ? true : false);
	}


	public String top() throws StackException {
		if (topElement == -1) {
			throw new StackException("Stack is empty!");
		} else {
			return stackArray[topElement];
		}
	}
}
