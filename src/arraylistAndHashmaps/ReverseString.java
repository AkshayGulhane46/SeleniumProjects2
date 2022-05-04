package arraylistAndHashmaps;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		int s[] = {10,9,8,7,6};
		//System.out.println(s.length);
		int lastindex = s.length-1;
		int i = 3;
		int temp;
		while(i < lastindex){
			temp = s[i];
			s[i] = s[lastindex];
			s[lastindex]=temp;
			i=i+1;
			lastindex = lastindex - 1;
		}
		
	for(int j = 0 ; j <= s.length-1 ; j ++) {
		System.out.println(s[j]);
	}
	}
}
