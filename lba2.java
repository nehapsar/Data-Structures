

	import java.util.List;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
//	    	NumberContainer cc= new NumberContainer();
	    	while(true) {
	    		System.out.println("\nenter your choice\n1.enter the two numbers\n2.add the numbers\n3.sort the numbers\n4.return list\n5.exit");
	    		int ch= sc.nextInt();
	    		switch(ch) {
	    		case 1:
//	    			int a =sc.nextInt();
	    			cc.add(a);
	    			int b= sc.nextInt();
	    			cc.add(b);
	    			break;
	    		case 2:
	    			double sum=cc.calculatesum(cc.getlist());
	    			System.out.println("sum="+ sum);
	    			break;
	    		case 3:
//	    			List ll=cc.sort(cc.getlist());
	    			System.out.println(ll);break;
	    		case 4:
	    			List lt= cc.getlist();
	    			System.out.println(lt);
	    			break;
	    		}
	    	}
//	    }}
