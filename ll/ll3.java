package ll;

public class LinkedList2 {
 public  static class  Node{
	 int data;
	 Node next;
	 
	 public Node(int data) {
		 this.data=data;
		 this.next=null;
	 }
 }
public static Node head=null;
 public static Node tail=null;
 public static int  size;
 // adding first element
 public static void AddFirst(int data) {
	Node newNode= new Node(data);
	size++;
	 if(head==null) {
		 head=tail=newNode;
		 return;
	 }
	 newNode.next=head;
	 head=newNode;
	 
 }
public static void AddLast(int data) {
	  Node newNode = new Node(data);
	  size++;
	  if(head==null) {
		  head=tail=newNode;
		  return;
	  }
	  tail.next=newNode;
	   tail=newNode;
 }
