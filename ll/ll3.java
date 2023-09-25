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
public static void print() {
	 Node tmp= head;
	 while(tmp!= null) {
		 System.out.print(tmp.data+"-->");
		 tmp=tmp.next;
	 }
	 System.out.println("null");
 }
public static void AddMid(int idx , int data) {
	 Node newNode = new Node(data);
	 Node tmp = head; int i=0;
	// Node newNode = new Node(data);
	 while(i < idx-1) {
		 tmp = tmp.next ;
		 i++;
	 }
	 newNode.next =tmp.next;
	 tmp.next =newNode;
	  }
