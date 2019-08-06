package com.shobhit.q1;

public class Main {
	public static void main(String args[]) {

		String filePath = "pairs.json";

		BST bst = new BST(filePath);

		Node obj3 = new Node(3, "Seeta");
		Node obj4 = new Node(4, "Komal");

		// Adding nodes to the BST.
		bst.add(obj3, bst.root);
		bst.add(obj4, bst.root);

		System.out.println("Sorted List***************************** After Deletion");

		bst.delete(11, bst.root);														//key 45 to be deleted

		bst.sortedList(bst.root);

		System.out.println("Sorted list of the Dictionary according to Key is:");
		
		for (int i = 0; i < bst.sortedListValues.size(); i++) {
			System.out.println(bst.sortedListValues.get(i).getKey() + "  :  "
					+ bst.sortedListValues.get(i).getValue());
		}

		System.out.println("Searching value***************************** For a Key");
		String objsearch = bst.getValue(2, bst.root);
		if (objsearch == null)
			System.out.println("Given key is not found.. Wrong input key!!.. So null value returned!!..");
		else
			System.out.println("Key found! " + objsearch);

		System.out.println("Sorted list of the Dictionary according to Key is:");
		for (int i = 0; i < bst.sortedListValues.size(); i++) {
			System.out.println(bst.sortedListValues.get(i).getKey() + "  :  "
					+ bst.sortedListValues.get(i).getValue());
		}

		System.out.println("Sorted*****************************List");
		bst.sortedListRange(bst.root, 1, 4);

		System.out.println("Sorted list of the Dictionary according to Keys in the specified range is:");
		for (int i = 0; i < bst.sortedListRangeValues.size(); i++) {
			System.out.println(bst.sortedListRangeValues.get(i).getKey()
					+ "  :  " + bst.sortedListRangeValues.get(i).getValue());
		}
	}
}
