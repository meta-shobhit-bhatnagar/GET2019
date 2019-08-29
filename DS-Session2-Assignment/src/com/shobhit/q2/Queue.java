package com.shobhit.q2;
/**
 * The class contains methods such as add, delete, isEmpty, isFull and also implemented 
 * circular queue in face of queue getting full despite of unused space 
 * @author Shobhit
 *
 */
public class Queue {
	
	private int front,rear,size;
	int capacity;
	int array[];
	
	/**
	 * Constructor for Queue class
	 * @param capacity
	 */
	public Queue(int capacity){
		this.capacity= capacity;
		front= 0;
		rear= capacity-1;
		array= new int[capacity];
	}
	
	/**
	 * isFull method
	 * @param queue
	 * @return
	 */
	public boolean isFull(Queue queue){
		if(capacity==size)
			System.out.println("Queue is full!");
		return (capacity== size);
	}
	/**
	 * isEmpty method
	 * @param queue
	 * @return
	 */
	public boolean isEmpty(Queue queue){
		if(queue.size==0)
			System.out.println("Queue is empty!");
		return (queue.size == 0);
	}
	
	/**
	 * adds item to queue
	 * @param item
	 */
	void enqueue(int item) 
    { 
        if (isFull(this)) 
            return; 
        this.rear = (this.rear + 1)%this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1; 
        System.out.println(item+ " enqueued to queue"); 
    } 
	
	/**
	 * deletes item from queue
	 * @return
	 */
	 int dequeue() 
	    { 
	        if (isEmpty(this)) 
	            return Integer.MIN_VALUE; 
	           
	        int item = this.array[this.front]; 
	        this.front = (this.front + 1)%this.capacity; 
	        this.size = this.size - 1; 
	        return item; 
	    } 
	 
	 
	// Method to get front of queue 
	    int front() 
	    { 
	        if (isEmpty(this)) 
	            return Integer.MIN_VALUE; 
	           
	        return this.array[this.front]; 
	    } 
	        
	    // Method to get rear of queue 
	    int rear() 
	    { 
	        if (isEmpty(this)) 
	            return Integer.MIN_VALUE; 
	           
	        return this.array[this.rear]; 
	    } 
	
	/**
	 * Driver main method 
	 * @param args
	 */
	public static void main(String[] args){
		Queue queue = new Queue(5); 				//capacity as input to constructor
        
        queue.enqueue(1); 
        queue.enqueue(2); 
        queue.enqueue(3); 
        queue.enqueue(4); 
        
        System.out.println(queue.dequeue() +  
                     " dequeued from queue\n"); 
        
        System.out.println("Front item is " +  
                               queue.front()); 
           
        System.out.println("Rear item is " +  
                                queue.rear()); 
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
	}
}
