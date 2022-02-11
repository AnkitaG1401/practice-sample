package practice_set;

import practice_set.LinkedList.Node;

public class FindInList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertData(list,1);
		list.insertData(list,3);
		list.insertData(list,5);
		list.insertData(list,7);
		list.insertData(list,9);
		LinkedList.display(list);
		
		System.out.println("Length of list : ");
		findNode(list);
		
		
	}

	
	public static void findNode(LinkedList list) {
		Node current_node=list.head;
		int length=0;
		while(current_node.next!=null) {
			length++;
		}
		System.out.println(length);
	}
	
}
