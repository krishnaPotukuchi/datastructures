package com;

public class Stack {
	
	private static class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data = data;
		}
	}

	private Node top;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int peek(){
		return top.data;
	}
	
	public void push(int data){
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public int pop(){
		int data = top.data;
		top = top.next;
		return data;
	}
	 @Override
		public String toString() {
			String value = "";
			while(top != null){
				value = value + top.data + "  ";
				top = top.next;
			}
			return value;
		}
	 
	 public static void main(String[] args) {
		Stack s = new Stack();
		s.push(9);
		s.push(1);
		s.push(7);
		s.push(6); 
		s.push(5);
		s.push(3);
		s.pop();
		System.out.println(s);
		
	}
	 
}
