package example;

public class stackb {
	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
		
	}
	
     static class stack{
      public static Node head;
      public static Node tail;
      
      //to check the linked list is empty or not
      public static boolean isEmpty() {
    	  return head==null;
    	 
      }
    	 //to add the elements
      public static void push(int data) {
    	  Node newNode=new Node(data);
    	  if(isEmpty()) {
    		  head=newNode;
    		  return;
    	  }
    	  newNode.next=head;
    	  head=newNode;
      }
      //to delete an elements
      public static int pop() {
    	  if(isEmpty()) {
    		  return -1;
    	  }
    	  int top=head.data;
    	  head=head.next;
    	  return top;
    	  
      }
      //to print the elements
      public static int peek() {
    	  if(isEmpty()) {
    		  return -1;
    	  }
    	  return head.data;
    	  
      }
 }
	
     public static void main(String[] args) {
		stack s=new stack();
        s.push(1);
        s.push(2); 
        s.push(3);
        
        while(!s.isEmpty()) {
        	System.out.println(s.peek());
        	s.pop();
        	
        }
	}

}
