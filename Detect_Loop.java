package SinglyLinkedList;

public class Detect_Loop {
private static ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
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
	
	
	// To detect a loop in linked list or not
	public boolean containsLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	// to find start of loop in singly linked list
	public ListNode startingNodeInALoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}
	
	private ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		while(slowPtr != temp) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp; // starting node of the loop
	}
	
	//to remove loop from Singly liked list
	public void removeLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				removeLoop(slowPtr);
			}
		}
		
	}
	
	private void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while(slowPtr.next != temp.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}
	
	
	public void createLoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third= new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth= new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next= second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	// to merge Two Sorted singly linked list
	public static ListNode merge(ListNode a, ListNode b) {
		// a--> 1--> 3--> 5-->7--> 9--> null
		// b--> 2--> 4--> 6--> null
		// result-->1-->2-->3-->4-->5-->6-->7-->9-->null
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(a != null && b != null) {
			if(a.data <= b.data){
				tail.next = a;
				a = a.next;
			}
			else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if(a == null) {
			tail.next = b;
		}
		else {
			tail.next = a;
		}
		return dummy.next;	
	}
	

	public static void main(String[] args) {
		Detect_Loop DL = new Detect_Loop();
		DL.createLoopInLinkedList();
		
		System.out.println(DL.containsLoop());
		
		System.out.println(DL.startingNodeInALoop().data);
		
		DL.removeLoop();
		DL.display();
		
		/*
		Detect_Loop DL1 = new Detect_Loop();
		DL1.insertLast(1);
		DL1.insertLast(3);
		DL1.insertLast(6);
		DL1.insertLast(8);
		DL1.insertLast(11);
		
		DL1.display();
		
		Detect_Loop DL2 = new Detect_Loop();
		DL2.insertLast(2);
		DL2.insertLast(4);
		DL2.insertLast(5);
		DL2.insertLast(13);
		
		DL2.display();
		
		//Detect_Loop result = new Detect_Loop();
		//result.head = merge(DL1.head, DL2.head);
		
		//result.display();
		 */
		 
	}
	
}
