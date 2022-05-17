package arraylistAndHashmaps;

public class alphabetPatturn {

    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        int i = 1;
        while(i <= n){
            int j = 1;
            ch = (char) (ch+1);
            while( j <= i){
            System.out.print((char)(j+ch-1));
            j = j + 1;
        }
        System.out.println();
        i = i + 1;
    }}
}
