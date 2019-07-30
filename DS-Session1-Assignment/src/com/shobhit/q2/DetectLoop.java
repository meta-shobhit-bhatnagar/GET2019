package com.shobhit.q2;

import com.shobhit.q1.LinkedList;

public class DetectLoop extends LinkedList{
	
	public boolean foundLoop(Node head){
		Node slow_p=head, fast_p=head;
		while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                System.out.println("Found loop"); 
                return true; 
            } 
        } 
        return false; 
	}
}
