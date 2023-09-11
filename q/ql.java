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
public static int remove() {
				if(tail==head) {
					tail=head=null;
					return -1;
					
				}
				int front=head.data;
				head=head.next;
				return front;
			}
public static int peek() {
				if(isEmpty()) {
					System.out.println("the ll is empty");
					
					return -1;}
					return head.data;
				}
			}
public static void main(String[] args) {
        qll newql=new qll();
         newql.add(1);
        newql.add(2);
       newql.add(4);
        while(!newql.isEmpty()) {
        System.out.println(newql.peek());
		newql.remove();
        	 
        }
         
	}

}
