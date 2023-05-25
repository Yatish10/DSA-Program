package SinglyLinkedList;

public class Singly_linked_List {
	private static ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// print element of a singly linked list
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
	}
	
	// To find the Length of Singly linked List
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	// To insert Node at the beginning of singly Linked List
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	//To insert Node at the End of singly Linked List
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;	
	}
	
	//To insert Node at any given position of singly Linked List
	public void insert(int position, int value) {
		ListNode node = new ListNode(value);
		if(position == 1) {
			node.next = head;
			head = node;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			node.next = current;
			previous.next = node;
		}
	}
	
	// to Delete First node of Singly linked List
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	// to Delete Last node of Singly linked List
	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	// to Delete node from Singly linked List at Given Position
	public void delete(int position) {
		if(position == 1) {
			head = head.next;
		} 
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	//To search an element in linked list in java
	public boolean find(ListNode head, int searchKey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// create singly linked list
		Singly_linked_List sll = new Singly_linked_List();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		ListNode fifth = new ListNode(15);
		//Now we will connect them together to form a chain
		sll.head.next = second; // 10-->8
		second.next = third;    // 10-->8-->1
		third.next = fourth;    // 10-->8-->1-->11
		fourth.next = fifth;    // 10-->8-->1-->11-->15-->null
		
		sll.display();
		System.out.println();
		
		sll.insertFirst(13);
		sll.insertFirst(12);
		sll.insertFirst(7);
		System.out.println();
		
		sll.insertLast(19);
		sll.insertLast(28);
		sll.insertLast(22);
		System.out.println();
		
		sll.insert(1, 16); // 16-->10-->8-->1-->11-->15-->null
		sll.insert(2, 14); // 16-->14-->10-->8-->1-->11-->15-->null
		sll.insert(1, 26); //26-->16-->14-->10-->8-->1-->11-->15-->null
		sll.insert(2, 21); //26-->21-->16-->14-->10-->8-->1-->11-->15-->null
		sll.insert(10,25); //26-->21-->16-->14-->10-->8-->1-->11-->15-->25-->null 
		
		sll.display();
		System.out.println();
		
		System.out.println(sll.deleteFirst().data);
		System.out.println(sll.deleteFirst().data);
		sll.display();
		System.out.println();
		
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);
		sll.display();
		
		System.out.println();
		
		sll.delete(1);
		sll.delete(3);
		sll.display();
		
		System.out.println();
		
		sll.display(head);
		System.out.println();
		if (sll.find(head, 11)) {
			System.out.println("Search Key is Found !!");
		}
		else {
			System.out.println("Search Key is not Found !!");
		}
		
		
		
		System.out.println();
		System.out.println("Length is: " + sll.length());
	}

	private void display(ListNode head2) {
		// TODO Auto-generated method stub
		
	}
        
		
	
	
	}


