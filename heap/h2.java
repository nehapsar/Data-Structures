package heaps;
import java.util.*;
public class h2 {
    static class Student implements Comparable<Student>{
    	String name;
    	int rank;
    	public Student(String name, int rank) {
    		this.name=name;
    		this.rank=rank;
    	}
    	@Override
    	public int compareTo(Student s2) {
    		return this.rank - s2.rank;
    	}
    }
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>();
		pq.add(new Student("a" , 10));
		pq.add(new Student("b" , 2));
		pq.add(new Student("c" , 3));
		pq.add(new Student("e" , 4));
		pq.add(new Student("y" ,1));
while(!pq.isEmpty()) {
	System.out.println(pq.peek().name+" "+pq.peek().rank);
	pq.remove();
}

	}

}
