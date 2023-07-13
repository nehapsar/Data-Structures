public class add{
public static class Node{
int data;
Node next;
 public Node(int data){
this.data=data;
this.next=null;
}
public static Node head;
public static Node tail;

public void addFirst(int data){
Node newNode=new Node(data);
if(Node==null){
head=tail=newNode;
}
newNode.next=head;
head=newNode;}
}
public static void main(String args[]){
LinkedList ll=new LinkedList();
ll.add(1);}}
