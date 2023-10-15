package ll;

public class LinkedList7 {
static class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
static Node head=null;
static Node tail=null;
public static void addFirst(int data) {
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
	while(tmp != null) {
		System.out.print(tmp.data+"-->");
		tmp=tmp.next;
	}
	System.out.println("null");
}
public static void zigzag() {
    Node sl = head;
    Node fast = head.next;

    // Finding the middle of the linked list
    while (fast != null && fast.next != null) {
            sl = sl.next;
            fast = fast.next.next;
    }

    Node mid = sl;
    Node prev = null;
    Node curr = mid.next;
    mid.next = null;
    Node next;

    // Reversing the second half of the linked list
    while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
    }

    Node lhead = head;
    Node rhead = prev;
    Node ltmp;
    Node rtmp;

    // Merging the two halves in a zigzag fashion
    while (lhead != null && rhead != null) {
            ltmp = lhead.next;
            lhead.next = rhead;
            rtmp = rhead.next;
            rhead.next = ltmp;
            lhead = ltmp;
            rhead = rtmp;
    }

    // Updating the tail pointer
    tail = lhead == null ? head : lhead;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList7 ll = new LinkedList7();
      ll.addFirst(1);ll.addFirst(4);
      ll.addFirst(2);ll.addFirst(5);
      ll.addFirst(3);ll.print();
      ll.zigzag();
      ll.print();
	}

}
