package com;

public class LinkedList {
	
	private static class Node{
		
		private int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
		
		public String toString() {
			 return data+"";
		}
		
	}
	
	static Node head;
	
	public boolean isEmpty(){
		return head== null;
	}
	
	public void append(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = new Node(data);
		
	}
	
	public void prepend(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		
		node.next = head;
		head = node;
	}
	
	public void delete(int data){
		if(head == null) return;
		if(head.data == data){
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next!= null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	@Override
	public String toString() {
		String value = "";
		while(head != null){
			value = value + head.data + "  ";
			head = head.next;
		}
		
		
		return value;
	}

    /* Function to reverse the linked list */
    static Node reverse(Node node) { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
    
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(9);
		ll.append(1);
		ll.append(5);
//		ll.delete(1);
		ll.append(3);
		ll.append(2);
		ll.prepend(0);
		ll.prepend(-1);
		System.out.println(ll);
//		head = ll.reverse(head); 
//		System.out.println(ll);
	}

}
