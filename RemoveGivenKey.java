package SinglyLinkedList;

import SinglyLinkedList.toInsertInSortedList.ListNode;

public class RemoveGivenKey {
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
	
	public void deleteNode(int key) {
		ListNode current = head;
		ListNode temp = null;
		
		if(current != null && current.data == key) {
			head = current.next;
			return;
		}
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) {
			return;
		}
		temp.next = current.next;
	}
	
	

	public static void main(String[] args) {
		RemoveGivenKey  dltNode = new RemoveGivenKey ();
		dltNode.insertFirst(24);
		dltNode.insertFirst(20);
		dltNode.insertFirst(15);
		dltNode.insertFirst(8);
		dltNode.insertFirst(6);
		dltNode.insertFirst(1);
		
		dltNode.display();
		System.out.println();
		
		dltNode.deleteNode(20);
		dltNode.deleteNode(24);
		dltNode.deleteNode(1);
		dltNode.display();

	}

}
