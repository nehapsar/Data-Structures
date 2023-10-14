package ll;

public class LinkedList6 {
static class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
	public static Node head;
	public static Node tail;
	public static void AddFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	
	public static void print() {
		Node tmp=head;
		while(tmp!= null) {
			System.out.print(tmp.data+"-->");
			tmp=tmp.next;
			
		}
		System.out.println("null");
	}
		
		private static Node fidmid(Node head) {
		Node fast=head.next;
		Node slow=head;
		while(fast!=null && fast.next!= null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
			return slow;
			
			
		}
		private static Node merge(Node head1,Node head2) {
			Node mergedLL=new Node(-1);
			Node tmp=mergedLL;
			while(head1!=null && head2!=null) {
				if(head1.data <=head2.data) {
					tmp.next=head1;
					head1=head1.next;
					tmp=tmp.next;
					
				}else {
					tmp.next=head2;
					head2=head2.next;
					tmp=tmp.next;
				}
			}
			while(head1!=null){
				tmp.next=head1;
				head1=head1.next;
				tmp=tmp.next;
				}
			while(head2!=null){
				tmp.next=head2;
				head2=head2.next;
				tmp=tmp.next;
				}
			return mergedLL.next;
		}
	
		public static Node mergeSort(Node head) {
		    if (head == null || head.next == null) {
		        return head;
		    }

		    Node mid = fidmid(head);
		    Node rightHead = mid.next;
		    mid.next = null;

		    Node leftHead = mergeSort(head);
		    Node rightHead2 = mergeSort(rightHead);

		    return merge(leftHead, rightHead2);
		}

		

                public static void main(String[] args) {
		
                	LinkedList6 ll = new LinkedList6();
                	ll.AddFirst(0);
                	ll.AddFirst(1);ll.AddFirst(2);
                	ll.AddFirst(3);ll.AddFirst(4);
                	ll.AddFirst(5);
                	ll.print();
                	ll.head=ll.mergeSort(ll.head);
ll.print(); 

	}

}
