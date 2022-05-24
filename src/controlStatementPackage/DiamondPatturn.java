package controlStatementPackage;

public class DiamondPatturn {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int n1 = (n+1)/2;
        while( i <= n1){
            int spaces1 = 1;
            while(spaces1 < n1-i){
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

        //int i = 1;
        int n2 = n1-1;
        int j = n1-1;
        while( j >= 1 ){
            int spaces1 = 1;
            while(spaces1 < n2-j){
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
