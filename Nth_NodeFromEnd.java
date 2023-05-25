package SinglyLinkedList;

public class Nth_NodeFromEnd {
	
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
	
	public ListNode getNthNodeFromEnd(int n) {
		if(head == null) {
			return null;
		}
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " +n);
		}
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count < n) {
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	public static void main(String[] args) {
		Nth_NodeFromEnd nNode = new Nth_NodeFromEnd();
		nNode.insertFirst(19);
		nNode.insertFirst(18);
		nNode.insertFirst(17);
		nNode.insertFirst(16);
		nNode.insertFirst(15);
		nNode.insertFirst(14);
		
		nNode.display();
		System.out.println();
		
		ListNode NthNode = nNode.getNthNodeFromEnd(2);
		System.out.println("Nth Node from End is: "+ NthNode.data);

	}

}
