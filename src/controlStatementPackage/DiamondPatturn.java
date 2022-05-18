package controlStatementPackage;

public class DiamondPatturn {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        while( i <= n/2){
            int spaces1 = 1;
            while(spaces1 < n-i){
                System.out.print(" ");
                spaces1 = spaces1 + 1;
            }
            int stars1 = 1;
            while(stars1 <= 2*i-1){
                System.out.print("*");
                stars1 = stars1 + 1;
            }
            i = i + 1;
            System.out.println();
        }

        // lower half
        int j = n/2 - 1;
        while( j >= 1){
            int spaces1 = 1;
            while(spaces1 < n-j){
                System.out.print(" ");
                spaces1 = spaces1 + 1;
            }
            int stars1 = 1;
            while(stars1 <= 2*j-1){
                System.out.print("*");
                stars1 = stars1 + 1;
            }
            j = j - 1;
            System.out.println();
        }

    }
}
