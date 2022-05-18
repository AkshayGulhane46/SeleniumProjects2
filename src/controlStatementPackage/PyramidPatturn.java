package controlStatementPackage;

public class PyramidPatturn {
    public static void main(String[] args) {
        int n = 5;
        int i =1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n - i) {
                System.out.print(" ");
                spaces = spaces + 1;
            }
            int stars = 1;
            int nums = 1;
            while(stars <= i){
                System.out.print(nums);
                stars = stars + 1;
                nums = nums + 1;
            }
            int nextStars = 1 ;
            int nums2 = i - 1;
            while(nextStars < stars - 1 ){
                System.out.print(nums2);
                nextStars = nextStars + 1;
                nums2 = nums2 - 1;
            }
            i = i + 1;
            System.out.println();
        }
    }
}
