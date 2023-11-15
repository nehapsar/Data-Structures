public class tree1{
   static class Node{
    int data;
    Node left;
    Node right;

      public  Node(int data){
        this.data=data;
        this.left=left;
        this.right=right;

      }
   }
   static class Binarytree{
    static int idx=-1;
    public static Node buildtree(int nodes[]){
       idx++;
       if(nodes[idx] == -1){
        return null;
       }

         Node newNode= new Node(nodes[idx]);
        newNode.left=buildtree(nodes);
        newNode.right=buildtree(nodes);
         return newNode;

    }
    
  }
    public static void main(String arags[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
         Node x=tree.buildtree(nodes);
         System.out.println(x.data);
}
}