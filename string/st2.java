package treeeeee;

public class st2 {
 public static  double Shortest_path(String str) {
	 int x=0,y=0;
	 for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		
		if(ch =='E') {
			x++;
		}
		else if(ch =='W') {
			x--;
		}
		else if(ch =='N') {
			y++;
		}
		else {
			y--;
		}
	 }
	 int x1=x*x;
	 int y1=y*y;
	 int z=x1+y1;
	double result=Math.sqrt(z);
	return result;
 }
	public static void main(String[] args) {
		String str="WNEENESENNN";
		System.out.println(Shortest_path(str));
	}

}
