package SinglyLinkedList;

import SinglyLinkedList.Nth_NodeFromEnd.ListNode;

public class ToRemoveDuplicate {
	
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
	
	public void removeDuplicates() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while(current != null && current.next != null ) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		ToRemoveDuplicate removeDuplicate = new ToRemoveDuplicate();
		removeDuplicate.insertFirst(19);
		removeDuplicate.insertFirst(19);
		removeDuplicate.insertFirst(17);
		removeDuplicate.insertFirst(16);
		removeDuplicate.insertFirst(16);
		removeDuplicate.insertFirst(14);
		
		removeDuplicate.display();
		System.out.println();
		
		removeDuplicate.removeDuplicates();
		removeDuplicate.display();
	}

}
