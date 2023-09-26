package Arraylist;
import java.util.ArrayList;
public class ar1 {

	public static void main(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		System.out.println(list.contains(1));

		System.out.println(list.get(1));
	}

}
