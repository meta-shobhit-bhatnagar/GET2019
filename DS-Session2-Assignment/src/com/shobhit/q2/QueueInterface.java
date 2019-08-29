package com.shobhit.q2;
/**
 * Interface for Queue
 * @author Shobhit
 *
 */
interface QueueInterface {
	
	void enqueue();
	int dequeue();
	int front();
	int rear();
	boolean isFull();
	boolean isEmpty();
	void display();
	
	
}
