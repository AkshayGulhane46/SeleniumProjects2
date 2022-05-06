package arraylistAndHashmaps;

public class pairsum {

    public static int[][] pairsum(int[] arr, int s) {
        for(int i=0; i<arr.length ; i++){
           // System.out.println(" ");
         //   System.out.print(arr[i]);
            for(int j = i+1; j<arr.length ; j++){
               // System.out.print(arr[j]);
                if(arr[i] + arr[j] == s){
                    System.out.println(arr[i] +" "+ arr[j]);

                }
            }
        }

        return new int[0][];
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int s = 5;
        int[][] k = pairsum(arr,s);


    }
}
