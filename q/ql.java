package q;

public class ql {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}}
		static class qll{
			static Node head;
			static Node tail ;
			

			public static boolean isEmpty() {
				return head ==null && tail==null;
				
			}
			public static void add(int data) {
				Node newNode = new Node(data);
				if(head==null) {
					head=tail=newNode;
					return;
						}
				tail.next=newNode;
				tail=newNode;		
					
			}
