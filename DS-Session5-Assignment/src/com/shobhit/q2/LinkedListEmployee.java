package com.shobhit.q2;


public class LinkedListEmployee {
	Node head;
	
	public class Node{
		Employee data;
		Node next;
		
		public Node(Employee data){
			this.data= data;
			this.next= null;
		}
		
	}
	
	
	/*@Override
    public boolean equals(Object obj) 
    { 
          
    // checking if both the object references are  
    // referring to the same object. 
    if(this == obj) 
            return true; 
          
        // it checks if the argument is of the  
        // type Geek by comparing the classes  
        // of the passed argument and this object. 
        // if(!(obj instanceof Geek)) return false; ---> avoid. 
        if(obj == null || obj.getClass()!= this.getClass()) 
            return false; 
          
        // type casting of the argument.  
        LinkedListEmployee eList = (LinkedListEmployee) obj; 
          
        // comparing the state of argument with  
        // the state of 'this' Object. 
        return (eList.head.data.getName() == this.head.data.getName()); 
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
    } */
	
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
