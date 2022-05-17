package arraylistAndHashmaps;

import java.util.Scanner;

public class NpowerN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1, ans = 1;

        while(i <= m){
            ans = ans * n;
            i ++;
        }
        System.out.println(ans);

    }
}
