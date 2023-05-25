package Doubly_Linked_List;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		private ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;	
	}
	
	public boolean isEmpty() {
		return length == 0; // head == null;
	}
	
	public int length() {
		return length;
	}
	
	//to insert node at the beginning of doubly linked list 
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}
	
	//to insert node at the beginning of doubly linked list 
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			tail = newNode;
		}
		else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	// to delete first node in doubly linked list
	
		public ListNode deleteFirst() {
			if (isEmpty()) {
				throw new NoSuchElementException();
			}
			ListNode temp = head;
			if(head == tail) {
				tail = null;
			}
			else {
				head.next.previous = null;
			}
			head = head.next;
			temp.next = null;
			length--;
			return temp;
		}
		
		// to delete Last node in doubly linked list
		
		public ListNode deleteLast() {
			if(isEmpty()){
				throw new NoSuchElementException();
			}
			
			ListNode temp = tail;
			if(head == tail) {
				head = null;
			}
			else {
				tail.previous.next = null;
			}
			tail = tail.previous;
			temp.previous = null;
			length--;
			return temp;
		}
	
	public void displayForward() {
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");	
		System.out.println();
	}

    
    public void displayBackward() {
    	if(tail == null) {
    		return;
    	}
    	ListNode temp = tail;
 		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.previous;
		}
		System.out.print("null");	
	}
    
    
    
    public static void main(String args[]) {
    	DoublyLinkedList dll = new DoublyLinkedList();
    	//dll.insertLast(1);
    	//dll.insertLast(2);
    	//dll.insertLast(3);
    	//dll.insertLast(4);
    	//dll.insertLast(5);
    	
    	dll.insertFirst(1);
    	dll.insertFirst(10);
    	dll.insertFirst(15);
    	dll.insertFirst(20);
    	dll.insertFirst(25);
    	dll.displayForward();
    	
    	//dll.deleteFirst();
    	//dll.deleteFirst();
    	
    	//dll.deleteLast();
    	//dll.deleteLast();
    	
    	dll.displayForward();
    	dll.displayBackward();
    }
    	
  }	
    
    
