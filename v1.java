package trrr;

public class treea {
    static class Node{
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int data) {
    		this.data=data;
    		this.left=null;
    		this.right=null;
    	}}
    	static class Info{
    		int ht;
    		int di;
    		public Info(int di,int ht) {
    			this.di=di;
    			this.ht=ht;
    			
    		}
    	}
    	
    	public static Info diameter(Node root) {
    		if(root==null) {
    			return new Info(0,0);
    		}
    		Info leftInfo=diameter(root.left);
    		Info rightInfo=diameter(root.right);
    		int dia=Math.max(Math.max(leftInfo.di, rightInfo.di), leftInfo.ht+rightInfo.ht+1);
    		int height=Math.max(leftInfo.ht, rightInfo.ht)+1;	
          return new Info(dia,height);	
    	}   	
    
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.right=new Node(7);
		root.right.left=new Node(6);
		
		System.out.println(diameter(root).ht);
	}

}
