package com;

public class DLL {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public void push(int new_data){
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		new_node.prev = null;
		
		if(head != null)
			head.prev = new_node;
			
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int data){
		
		Node new_node = new Node(data);
		
		new_node.next = prev_node.next;
		
		prev_node.next = new_node;
		new_node.prev = prev_node;
		
	}

	public static void main(String[] args) {
		DLL dll = new DLL(); 
		  
        // Insert 7 at the beginning. So linked list becomes 7->6->NULL 
        dll.push(7); 
  
        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL 
        dll.push(1); 
  
  
        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL 
        dll.insertAfter(dll.head.next, 8); 
        dll.printlist(dll.head);   
	}

	 public void printlist(Node node) 
	    { 
	        Node last = null; 
	        System.out.println("Traversal in forward Direction"); 
	        while (node != null) { 
	            System.out.print(node.data + " "); 
	            last = node; 
	            node = node.next; 
	        } 
	        System.out.println(); 
	        System.out.println("Traversal in reverse direction"); 
	        while (last != null) { 
	            System.out.print(last.data + " "); 
	            last = last.prev; 
	        } 
	    } 
}
