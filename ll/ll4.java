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
 public static boolean palindrome() {
          if(head==null || head.next == null) {
        	  return true;
          }
    	  Node mid = Mid(head);
    	  Node prev = null;
           Node curr = mid ;
           Node next;
           
           while(curr != null) {
        	  next = curr.next;
        	  curr.next = prev ;
        	  prev= curr;
        	  curr = next;
        	  
           }
           Node left = head;
           Node right = prev;
           while(left!= null) {
        	   if(right.data != left.data) {
        		   return false;
        	   }
        	   left = left.next;
        	   right= right.next;
           }
           return true;
           
      }
      
public static void main(String[] args) {
		// TODO Auto-generated method stub
           LinkedList4 ll = new LinkedList4();
           ll.AddFirst(1);
           ll.AddFirst(2);ll.AddFirst(4);
           ll.print();
           System.out.println(ll.palindrome());
           
	}

}
