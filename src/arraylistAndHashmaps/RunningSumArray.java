package arraylistAndHashmaps;

public class RunningSumArray {
  public static void main(String args[]) {
	  int a[] = {1,2,3,4,5};
	  int length = a.length-1;
	  int sum= 0;
	  
	  for(int i =0 ; i <= length ; i++) {
		sum = sum + a[i];
		a[i]=sum;
		System.out.println(a[i]);
	  }
	  
	 
  }
}
