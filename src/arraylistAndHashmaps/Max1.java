package arraylistAndHashmaps;

public class Max1 {

    public static void main(String args[]){
        int[] arr = {1,1,1,0};
        int[] newarr = arr;

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print("   Refresh    ");
            for(int j = i ; j < arr.length ; j++) {
                System.out.println("");
                System.out.print(" " + i + " and " + j + " ");
                if (arr[j] == 0) {
                    newarr[j] = 1;
                } else {
                    newarr[j] = 0;
                }
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]);
                }
               newarr = arr;
            }
        }

    }
}
