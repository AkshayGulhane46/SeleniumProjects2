package arraylistAndHashmaps;

public class StonesandJules {
	public static void main(String args[]) {
		String stones = "z";
		String jules = "ZZ";
		int count = 0;
		for(int i=0; i < stones.length() ; i++) {
			for(int j= 0; j < jules.length() ; j++) {
				System.out.println(stones.charAt(i));
				System.out.print(" "+jules.charAt(j));
				
				if(stones.charAt(i) == jules.charAt(j)) {
					count = count + 1;
				}
			}
		}System.out.println(count);
	}
}
