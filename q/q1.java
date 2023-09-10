package q;

public class qb {
      static class Queue{
    	   static int arr[];
    	  
    	   static int size;
    	   static int rear;
    	   Queue(int n){
    		   arr = new int[n];
    		   size=n;
    		   rear= -1;
    	   }
