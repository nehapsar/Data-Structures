package array;

public class waterstored {
	public static int rain(int ht[]) {
		int lm[]=new int[ht.length];
		int rm[]=new int[ht.length];
		int wt=0;
		//calculating right maximum
		lm[0]=ht[0];
		rm[ht.length-1]=ht[ht.length-1];
		for(int i=1;i<=ht.length-1;i++) {
			lm[i]=Math.max(ht[i], lm[i-1]);
		}
		// to calculate left
		for(int i=ht.length-2;i>=0;i--) {
			rm[i]=Math.max(rm[i+1],ht[i]);
		}
		// to calculte the water level
		for(int i=0;i<=ht.length-1;i++) {
	int water=Math.min(rm[i], lm[i]);
	wt+=water-ht[i];
		}
		return wt;
	}

	public static void main(String[] args) {
		int ht[]= {7,0,4,2,5,0,6,4,0,5};
		System.out.println(rain(ht));
	}

}
