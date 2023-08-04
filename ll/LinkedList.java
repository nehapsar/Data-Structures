public class LinkedList{
public static class Node{
int data;
Node next;

//contructor

public Node(int data){
this.data=data;
this.next=null;
}
}
public static Node head;
public static Node tail;


public void addFirst(int data){
Node newNode=new Node(data);
if(head==null){
head=tail=newNode;
return;}
newNode.next=head;
head=newNode;

}


//public void addLast(int data){
//Node newNode=new Node(data);
//if(head==null){
//head=tail=newNode;
//return;}
//tail.next=newNode;
//newNode.next=null;
//tail=newNode;
//} 








public static void main(String args[]){

LinkedList ll=new LinkedList();
ll.addFirst(1);
ll.addFirst(2);
ll.addFirst(3);
}


}
