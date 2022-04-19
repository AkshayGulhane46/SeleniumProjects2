package arraylistAndHashmaps;

public class GreatestCandies {




    public static void main(String args[]){



        int [] candies = {1,2,5,3,2,66};
        int max = 0;
        int maxi =12;
        boolean[] array = new boolean[candies.length];
        for(int i=0; i<candies.length ; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        System.out.println(max);
        for(int j=0; j<candies.length;j++){
            if(candies[j] + maxi > max){
                candies[j] = 1;

                System.out.println("True");
            }else{
                array[j] = false;
                System.out.println("False");
            }
        }

    }
}
