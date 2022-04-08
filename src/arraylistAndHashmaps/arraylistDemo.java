package arraylistAndHashmaps;

import java.util.ArrayList;

public class arraylistDemo {

	public static void main(String args[]) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("one");
		ar.add("Two");
		ar.add("Three");
		System.out.println(ar.get(1));
		//----------------------- loop for arraylist to traverse -------------------//
		for(String counting:ar) {
			System.out.println(counting);
		}
		
	}
}
