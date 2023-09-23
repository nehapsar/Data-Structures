package bit;

public class b9 {

	public static void main(String[] args) {
		int x=5, y=6;
		System.out.println("the value of x before swapping x ="+" "+x+" and  y = " +y );
          x=x^y;
          y=x^y;
          x=x^y;
        		  System.out.println("x="+x);
          System.out.println("y="+y);
	}

}
