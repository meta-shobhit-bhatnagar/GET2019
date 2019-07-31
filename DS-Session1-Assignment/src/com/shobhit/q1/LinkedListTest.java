package com.shobhit.q1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * contains test class for Linked List rotation
 * @author Shobhit
 *
 */
public class LinkedListTest {

	@Test
	public void test1() {
		LinkedList list= new LinkedList();
		list.head= new LinkedList.Node(2);							//Linked list is assumed  2-> 3-> 4-> 5-> 6->2
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.subListRotate(2, 5, 2);
		
		
		LinkedList expectedList= new LinkedList();
		expectedList.head= new LinkedList.Node(2);							//Linked list is assumed  2-> 3-> 4-> 5-> 6->2
		expectedList.append(5);
		expectedList.append(6);
		expectedList.append(3);
		expectedList.append(4);
		
		assertEquals(expectedList, list);
	}

}
