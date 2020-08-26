package com;

public class Queue {
	 private static class Node{
		 private int data;
		 private Node next;
		 
		 Node(int data){
			 this.data = data;
		 }
	 }
	 
	 private Node head;
	 private Node tail;
	 
	 public boolean isEmpty(){
		 return head == null;
	}
	 public int peek(){
		 return head.data;
	 }
	 public void add(int data){
		 Node newNode = new Node(data);
		 if(tail != null){
			tail.next = newNode;
		 }
		 if(head == null){
			 head = newNode;
		 }
		 tail = newNode;
	 }
	 
	 public int remove(){
		 int data =  head.data;
			 head = head.next;
		 return data;
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
	 
	 public static void main(String[] args) {
		Queue q = new Queue();
		q.add(9);
		q.add(5);
		q.add(7);
		q.add(3);
		q.add(1);
		q.add(4);
		q.remove();
		System.out.println(q);
	}
}
