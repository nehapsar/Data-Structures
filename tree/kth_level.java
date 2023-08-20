package trrr;
public class treef {
	static class Node{
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int data) {
    		this.data=data;
    		this.left=null;
    		this.right=null;
    	}
    	}
	
	public static void Kth_level(Node root,int level,int k) {
		if (root==null) {
			return;
			
		}
		if(level==k) {
			System.out.print(root.data+" ");
			
		}
		
		Kth_level(root.left,level+1,k);
//		Kth_level(root.right,level+1,k);
	}
	
	public static void main(String args[]) {
	Node root=new Node(1);
	root.left=new Node(2);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	root.right=new Node(3);
//	root.right.right=new Node(7);
//	root.right.left=new Node(6);
	int k =3;
	Kth_level(root,1,k);
	}

}
