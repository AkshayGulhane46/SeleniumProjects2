package arraylistAndHashmaps;

import java.util.ArrayList;

import static java.util.Arrays.sort;

public class kthSmallest {
    public static void main(String args[]){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(5);
//        ar.add(4);
//        ar.add(3);
//        ar.add(2);
//        ar.add(1);
        int max =0;

        int arr[] = new int[ar.size()];

        for(int i=0; i < ar.size() ; i++){
           arr[i] = ar.get(i);
           System.out.print(arr[i]);
        }
        int small = 0;

        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        int k = 1;

        System.out.println(arr[0+k-1]);
        System.out.println(arr[arr.length  - k]);
    }
}
