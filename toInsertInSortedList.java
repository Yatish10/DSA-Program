package SinglyLinkedList;



public class toInsertInSortedList {
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
	}
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public ListNode InsertInSortedList(int value) {
		ListNode newNode = new ListNode(value);
		
		if (head == null) {
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	

	public static void main(String[] args) {
		toInsertInSortedList insertNode = new toInsertInSortedList();
		insertNode.insertFirst(24);
		insertNode.insertFirst(20);
		insertNode.insertFirst(15);
		insertNode.insertFirst(8);
		insertNode.insertFirst(6);
		insertNode.insertFirst(1);
		
		insertNode.display();
		System.out.println();
		
		insertNode.InsertInSortedList(10);
		insertNode.InsertInSortedList(23);
		insertNode.display();

	}

}
