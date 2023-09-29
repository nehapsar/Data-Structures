package ll;

public class LinkedList4 {
      static class Node {
    	  int data;
    	  Node next;
    	  public   Node(int data) {
    		  this.data = data ;
    		  this.next = null ;
    		  
    	  }
    	  
      }
public static Node head =null;
      public static Node tail =null;
      public static void AddFirst(int data) {
    	  Node newNode = new Node(data);
    	  if(head == null) {
    		  head = tail = newNode ;
    		  return ;
    	  }
    	  newNode.next = head;
    	  head = newNode;
      }
