package com.shobhit.q2;

/**
 * The class contains methods to Sort employee based on their salaries provided equal salaried get sorted based on their age in increasing order
 * @author Shobhit
 *
 */
public class LinkedListEmployee {
	Node head;
	
	public static class Node{
		Employee data;
		Node next;
		
		public Node(Employee data){
			this.data= data;
			this.next= null;
		}
		
	}
	
	
	/**
	 * Overriding Equals object
	 */
	@Override
	public boolean equals(Object obj) {

	    if (obj == null)
	        return false;
	    LinkedListEmployee listToCompare = (LinkedListEmployee) obj;
	    LinkedListEmployee thisList = this;
	    while (listToCompare.head != null && thisList.head != null) {
	        if (!listToCompare.head.data.getName().equals(thisList.head.data.getName()))
	            return false;

	        listToCompare.head = listToCompare.head.next;
	        thisList.head = thisList.head.next;
	    }
	    if (listToCompare.head == null && thisList.head == null)
	        return true;

	    return false;

	}
	
	
    @Override
    public int hashCode() 
    { 
          
        // We are returning the Geek_id  
        // as a hashcode value. 
        // we can also return some  
        // other calculated value or may 
        // be memory address of the  
        // Object on which it is invoked.  
        // it depends on how you implement  
        // hashCode() method. 
        return 1; 
    }
	
	/**
	 * The method adds new Node to the linked list with Employee data
	 * @param new_data 
	 */
	public void append(Employee data){
		
		
		if(head==null){
			head= new Node(data);
			return;
		}
		Node new_Node= new Node(data);
		new_Node.next= null;
		
		Node tempHead= head;
		while(tempHead.next !=null){
			tempHead= tempHead.next;
		}
		
		tempHead.next= new_Node;
		
		
		return;
			
	}
	/**
	 * Merge method of MergeSort
	 * @param e1
	 * @param e2
	 * @return
	 */
	Node sortedMerge(Node e1, Node e2 ) 
    { 
        Node result = null; 
        /* Base cases */
        if (e1 == null) 
            return e2; 
        if (e2 == null) 
            return e1; 
  
        /* Pick either a or b, and recur */
        if (e1.data.getSalary() > e2.data.getSalary()) { 
            result = e1; 
            result.next = sortedMerge(e1.next, e2); 
        }else if(e1.data.getSalary() == e2.data.getSalary()){ 					//if the salaries are Equal
        	if(e1.data.getAge() < e2.data.getAge()){
        		result = e1; 
                result.next = sortedMerge(e1.next, e2); 
        	}else{
        		result = e2; 
                result.next = sortedMerge(e1, e2.next); 
        	}
        }
        else { 
            result = e2; 
            result.next = sortedMerge(e1, e2.next); 
        } 
        return result; 
    } 
	
	/**
	 * Divide method of MergeSort
	 * @param h
	 * @return
	 */
	Node mergeSort(Node h) 
    { 
        // Base case : if head is null or there is only one element in the linked list
        if (h == null || h.next == null) { 
            return h; 
        } 
  
        // get the middle of the list 
        Node middle = getMiddle(h); 
        Node nextofmiddle = middle.next; 
  
        // set the next of middle node to null 
        middle.next = null; 
  
        // Apply mergeSort on left list 
        Node left = mergeSort(h); 
  
        // Apply mergeSort on right list 
        Node right = mergeSort(nextofmiddle); 
  
        // Merge the left and right lists 
        Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
    // Utility function to get the middle of the linked list 
    Node getMiddle(Node h) 
    { 
        // Base case 
        if (h == null) 
            return h; 
        Node fastptr = h.next; 
        Node slowptr = h; 
  
        // Move fastptr by two and slow ptr by one 
        // Finally slowptr will point to middle node 
        while (fastptr != null) { 
            fastptr = fastptr.next; 
            if (fastptr != null) { 
                slowptr = slowptr.next; 
                fastptr = fastptr.next; 
            } 
        } 
        return slowptr; 
    } 
    
    
    
 // Utility function to print the linked list 
    void printList(Node headref) 
    { 
        while (headref != null) { 
            System.out.println("Name : "+ headref.data.getName() + ", age:  "+ headref.data.getAge()+ ", Salary :"+ headref.data.getSalary()); 
            headref = headref.next; 
        } 
    } 
}
