package practice_set;

public class LinkedList {

	Node head;
	
	public class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	
	public LinkedList insertData(LinkedList list,int data) {
		Node new_node= new Node(data);
		new_node.next=null;
		//if Empty
		if(list.head==null) {
			list.head=new_node;
		}
		//from second element onwards
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
	
	public static void display(LinkedList list) {
		Node current_node=list.head;
		System.out.println("Linked List : ");
		while(current_node.next!=null) {
			System.out.println(current_node.data);
			current_node=current_node.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertData(list,1);
		list.insertData(list,3);
		list.insertData(list,5);
		list.insertData(list,7);
		list.insertData(list,9);
		display(list);
	}

}
