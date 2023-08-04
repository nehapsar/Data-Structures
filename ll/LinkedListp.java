
package example;

public class LinkedListp {

	public class Node{
		int data;
		Node next;
		
		// create a constructo
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	// create head and tail
	public static Node head;
	public static Node tail;
	
	//adding elements
	
	public void addFirst(int data) {;
	
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	// adding element to tail
	public void addlast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			}
		tail.next=newNode;
		newNode.next=null;
		tail=newNode;
				
		}
	
	//to print linked list
	public void print() {	
		Node tmp=head;
			
		while(tmp!=null) {
			System.out.print(tmp.data+" -->");
			tmp=tmp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[]) {
		LinkedListp ll=new LinkedListp();
		ll.addFirst(1);
		//ll.print();
		ll.addFirst(2);
		//ll.print();
		ll.addFirst(3);
		ll.addlast(11);
		ll.print();
	}
}
