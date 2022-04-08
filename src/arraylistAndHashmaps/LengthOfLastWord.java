package arraylistAndHashmaps;

public class LengthOfLastWord {
	public static void main(String args[]) {
		String s = "dsf  acv 2           ";
		s=s.trim();
		System.out.println(s);
		
		int LastIndex = s.length()-1;
		int count = 0;
		System.out.println(LastIndex);
		System.out.println(s.charAt(LastIndex));
		
		
		for(int i = LastIndex ; i >= 0 ; i--) {
			if(s.charAt(i) == ' ') {
			
				break;
			}
			count = count + 1;
			//System.out.println(s.charAt(i));
		}
		
		
		System.out.println(count);
		
		}
	
}

