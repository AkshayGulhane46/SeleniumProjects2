package arraylistAndHashmaps;

import java.net.StandardSocketOptions;

public class factors {
    public static void main(String[] args) {
        int n = 7;
        int div = 2;

        boolean isPrime = true;

        while(div <= n - 1 ){
            if(n % div == 0){
                System.out.print(div + " ");
                isPrime = false;
            }
            //System.out.println(div);
            div = div + 1;
        }
        if(isPrime == true){
            System.out.println(1 + " " + n);
//            System.out.println("Prime");
//        }else{
//            System.out.println("Not Prime");
        }
    }
}
