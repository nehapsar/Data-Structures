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
 public static void print() {
    	  Node tmp = head ;
    	  while(tmp != null) {
    		  System.out.print(tmp.data +"-->");
    		  tmp = tmp.next;
    	  }
    	  System.out.println("null");
      }
      public static Node Mid(Node head) {
    	  Node sl=head;
    	  Node fs = head ;
    	  while(fs.next !=null ) {
    		  sl= sl.next;
    		  fs = fs.next.next;
    	  }
    	  return sl;
      }
