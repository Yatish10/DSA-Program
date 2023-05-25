package Circular_Singly_Linked_List;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
	
	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
			
		}
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length ==0;
	}
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second= new ListNode(5);
		ListNode third= new ListNode(10);
		ListNode fourth = new ListNode(15);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	// to print circular Singly Linked list
	public void display() {
		if(last == null) {
			return;
		}
		
		ListNode first = last.next;
		while(first != last) {
			System.out.print(first.data +" ");
			first = first.next;
		}
		System.out.print(first.data + " ");
	}
	
	//to insert Node at beginning of Circular Singly Linked List
	public void insertFirst(int data) {
		ListNode temp = new ListNode(data);
		if(last == null) {
			last = temp;
		}
		else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}
	
	//to insert Node at End of Circular Singly Linked List
	public void insertLast(int data) {
		ListNode temp = new ListNode(data);
		if(last == null) { //isEmpty()
			last = temp;
			last.next = last;
		}
		else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
	
	// to remove First Node From circular singly linked list
	public ListNode removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Circular Singly linked list already empty");
		}
		ListNode temp = last.next;
		if(last.next == last) {
			last = null;
		}
		else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}

	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		
		csll.createCircularLinkedList();
		csll.display();
		System.out.println(" ");
		
		csll.insertFirst(4);
		csll.insertFirst(9);
		csll.display();
		System.out.println(" ");
		
		csll.insertLast(13);
		csll.insertLast(21);
		csll.display();
		System.out.println(" ");
		
		csll.removeFirst();
		csll.removeFirst();
		csll.display();
	}

}
