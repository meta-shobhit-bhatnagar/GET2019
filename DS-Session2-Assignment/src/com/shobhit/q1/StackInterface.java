package com.shobhit.q1;

/**
 * It implements various operations on Stack
 * 
 * @author Shobhit
 *
 */
public interface StackInterface {
	/**
	 * Push the given element to Stack
	 * 
	 * @param newElement
	 * @return true if newElement is pushed to Stack
	 * @throws 
	 */
	public boolean push(String newElement) throws StackException;

	/**
	 * Pop the Top Element in Stack		 * 
	 * @return Popped Element from Stack
	 */
	public String pop() throws StackException;

	/**
	 * It checks whether the Stack is Empty or not
	 * 
	 * @return true if the Stack is Empty
	 */
	public boolean isEmpty() throws StackException;

	/**
	 * It returns the Top Element of Stack
	 * 
	 * @return Top Element Stored at Stack
	 */
	public String top() throws StackException;
}


