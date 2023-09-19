package heaps;
import java.util.PriorityQueue;
import java.util.*;
public class h1 {

	public static void main(String[] args) {
	
		 PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(1);
	pq.add(10);
	pq.add(2);
	pq.add(5);
	pq.add(4);
//	while(!pq.isEmpty()) {
		System.out.println(pq.peek());
//		pq.remove();
	}
		
	}

}
