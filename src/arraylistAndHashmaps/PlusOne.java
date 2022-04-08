package arraylistAndHashmaps;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	
	
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<Integer>();

		int nums[] = {9,8,7,6,5,4,3,2,0};
		
		System.out.println(nums.length);
		
	
		int i =0;

		int total = 0;
		
		
		
		int degree = nums.length-1;
		int j = nums.length-1;
		int l = nums.length;
		int a[]=new int[l];
		int k = 0;
		
		System.out.println(degree);
		
		//for(i=0; i<= degree  ;i++) {
		while(degree > -1) {
			System.out.println(nums[i]);
			System.out.println(degree);
			System.out.println(nums[i] * Math.pow(10, degree));
			total = (int) (total + (nums[i] * Math.pow(10, degree)));
			i = i + 1;
			degree = degree -1;

					
		}
		total = total+1;
		System.out.println(total);
		
		
		while(total != 0) {
			//list.add(total % 10);
			System.out.println("Running");
			list.add(total % 10);
			total = total / 10;
		}	
		System.out.println(list);
		System.out.println(list.size());	
		
		int size = list.size() ;
		
		int nums2[]= new int[size];
		int numofelements = list.size()-1;
		
		System.out.println(nums2.length);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		for(k =0 ; k < size ; k++) {
			nums2[k] = list.get(numofelements);
			System.out.println(nums2[k]);
			numofelements = numofelements - 1;
		}
		
		
		
		System.out.println(nums2);
		


			//System.out.println(nums[i]);
			//System.out.println(degree);
		//.out.println(nums[i] * Math.pow(10, degree));
		//	degree = degree -1 ;
			
			//multiple = multiple * 10;
			
		//}
		
	}
	
}


