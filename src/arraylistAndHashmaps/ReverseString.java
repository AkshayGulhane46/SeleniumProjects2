package arraylistAndHashmaps;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		int s[] = {1,2,3,4,5,6,7,8};
		//System.out.println(s.length);
		int end = s.length-1;
		int temp = 0;
		int mid = (int) Math.floor(end/2) + 1;
	//	System.out.println(mid);
		for(int i = 0 ; i < mid ; i++) {
			temp = s[i];
			s[i] = s[end];
			s[end] = temp;
			//System.out.println(s[i]);
		//	System.out.println(s[end]);
			end--;
			}
		
	for(int j = 0 ; j <= s.length-1 ; j ++) {
		System.out.println(s[j]);
	}
	}
}
