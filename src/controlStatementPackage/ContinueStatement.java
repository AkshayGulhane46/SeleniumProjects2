package controlStatementPackage;

public class ContinueStatement {
	public static void main(String args[]) {
	int i=0;
	int j=0;
	
	for(i=0;i<5;i++) {
		
		for(j=0;j<=5;j++) {
			if(j==2) {
				System.out.println("For i" +i);
				System.out.println("For j" +j);
				continue;

			}
		}
	}

	}
}
