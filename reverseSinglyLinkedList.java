package SinglyLinkedList;

import SinglyLinkedList.Singly_linked_List.ListNode;

public class reverseSinglyLinkedList {
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
		public void display(ListNode head) {
			ListNode current = head;
			while(current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.print(current);
		}
		
		// to reverse a singly Linked list
		public ListNode reverse(ListNode head) {
			if(head == null) {
				return head;
			}
			ListNode current = head;
			ListNode previous = null;
			ListNode next = null;
			
			while(current != null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			return previous;
		}
	

	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		ListNode fifth = new ListNode(15);
		//Now we will connect them together to form a chain
		head.next = second; // 10-->8
		second.next = third;    // 10-->8-->1
		third.next = fourth;    // 10-->8-->1-->11
		fourth.next = fifth;    // 10-->8-->1-->11-->15-->null
		
		reverseSinglyLinkedList rsll = new reverseSinglyLinkedList();
		rsll.display(head);
		System.out.println();
		ListNode reverseListHead = rsll.reverse(head);
		rsll.display(reverseListHead);
		

	}

}
