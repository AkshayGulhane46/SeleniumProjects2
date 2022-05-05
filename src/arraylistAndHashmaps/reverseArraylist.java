package arraylistAndHashmaps;

import java.io.FileReader;
import java.util.ArrayList;

public class reverseArraylist {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer>arr , int m) {
        int LastIndex = arr.size() - 1;
        int StartIndex = m + 1;
        int temp;
        while (StartIndex < LastIndex) {
            temp = arr.get(StartIndex);
            arr.set(StartIndex, arr.get(LastIndex));
            arr.set(LastIndex, temp);
            StartIndex++;
            LastIndex--;
        }
    return(arr);
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        System.out.print(reverseArray(arr,1));
        System.out.println(arr);
    }
}
