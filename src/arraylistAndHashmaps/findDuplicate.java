package arraylistAndHashmaps;
import java.util.ArrayList;

public class findDuplicate {
    public static Integer reverseArray(ArrayList<Integer>arr) {
        int LastIndex = arr.size()-1 ;
        System.out.println(LastIndex);
        int temp = 0;

        for (int i = 0; i < LastIndex-1; i++) {
            for (int j = i+1 ; i < LastIndex; j++) {
                System.out.println(arr.get(i));
                System.out.print(arr.get(j));
                if (arr.get(j).equals(arr.get(i))) {
                    temp = arr.get(i);
                    return (temp);
                }
            }
        }
        return (temp);
    }



    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        System.out.print(reverseArray(arr));
        System.out.println(arr);
    }
}
