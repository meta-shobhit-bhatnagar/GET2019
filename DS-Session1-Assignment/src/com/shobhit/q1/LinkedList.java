package com.shobhit.q1;
/**
 * Linked List class contains functions to perform sublist rotations till given N
 * @author Shobhit
 *
 */
public class LinkedList {
	public Node head;									//head declared as Node type without instance
	//Nested class, static 
	public static class Node{
		int data;
		public Node next;
		
		public Node(int d){
			data=d;
			next=null;
		}
	}
	
	/**
	 * The method adds new node at the end of the linked list along with the data value
	 * @param new_data 
	 */
	public void append(int new_data){
		Node new_node= new Node(new_data);
		
		if(head==null){
			head= new Node(new_data);
			return;
		}
		
		new_node.next= null;
		Node last= head;
		while(last.next !=null){
			last= last.next;
		}
		
		last.next= new_node;
		
		
		return;
			
	}
	
	/**
	 * This function prints the linked list starting from the head node
	 */
	public void printList(){
		
		Node tempNode= head;
		if(head==null){
			System.out.println("Linked list is empty");
			return;
		}
			
		while(tempNode != null){
			System.out.print(tempNode.data+" "); 
            tempNode = tempNode.next; 
		}
	}
	
	public void subListRotate(int lIndex, int rIndex, int n){
		int count=1;
		Node tNode= head,tNodeLeft=null, tNodeRight=null,linkNode=null;
		do{
			if(count== (lIndex-1)){								//(lIndex-1) in order to get its predecessor node.next value
				tNodeLeft= tNode;
			}else if(rIndex== count + n){
				linkNode = tNode;
			}else if(count == rIndex){						
				tNodeRight= tNode;
				Node tempNode= linkNode.next;
				linkNode.next= tNodeRight.next;
				tNodeRight.next= tNodeLeft.next;
				tNodeLeft.next= tempNode;
				break;
			}
			count++;
			tNode= tNode.next;
		}while(tNode!= null);
		
		
		
	}
	
}
