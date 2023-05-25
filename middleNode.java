package SinglyLinkedList;

import SinglyLinkedList.Singly_linked_List.ListNode;

public class middleNode {
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
	
	public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	

	public static void main(String[] args) {
		middleNode MN = new middleNode();
		MN.insertFirst(19);
		MN.insertFirst(18);
		MN.insertFirst(17);
		MN.insertFirst(16);
		MN.insertFirst(15);
		MN.insertFirst(14);
		
		MN.display();
		System.out.println();
		
		ListNode MiddleNode = MN.getMiddleNode();
		System.out.println("Middle Node is: "+ MiddleNode.data);
		

	}

}
