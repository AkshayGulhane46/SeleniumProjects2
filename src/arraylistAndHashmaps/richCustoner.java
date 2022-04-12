package arraylistAndHashmaps;

public class richCustoner {
	public static void main(String args[]) {
		int accounts[][] = {{1,2,3},{5,6,7},{777,33,22},{1,2,1}};
		int fullLength = accounts.length;
        int accountlength = accounts[1].length;
		
		
		int total,max=0;
		for(int i=0; i< fullLength ; i++) {
			total = 0;
			for(int j = 0 ; j < accountlength ; j++) {
				System.out.println(accounts[i][j]);
				total = total + accounts[i][j];	
				
			}
			System.out.println("This is total "+ total);
			System.out.println("is " + total + " is greater than " +max);
			if(total >= max) {
				max = total;
			}
			

			System.out.println(" ");

			System.out.println(" ");
			
		
			}
		System.out.println(max);
	}
}
