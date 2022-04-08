package arraylistAndHashmaps;

public class DoubleArray {
	public static void main(String args[]) {
		int a[] = {1,2,3};
		System.out.println(a.length);	
		int oldlength = a.length;
		int newlength = (a.length) * 2;
		
		System.out.println("This is new length "+ newlength);
		
		int b[] = new int[newlength];
		
		for(int i =0 ; i < newlength ; i++) {
			if(i >= oldlength) {
				System.out.println("This is i" + i);
				b[i] = a[i-oldlength];
				System.out.println(b[i]);
			}else {
				b[i] = a[i];
				System.out.println("This is i" + i);
				System.out.println(b[i]);
			}
		}
	 System.out.println(b);
		System.out.println("Program COmpletes");
	}
	
}
