package arraylistAndHashmaps;

import java.util.ArrayList;
public class MagicIndices {

    public static int reverseArray1(ArrayList<Integer> arr) {
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            temp = 0;
            if (arr.get(i) < 0) {
                temp = arr.get(i) - (arr.get(i) * 2);
                arr.set(i, temp);
                //  System.out.println(temp);
            }
              if(i == arr.get(i)) return(i);

        }
        int flag = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (j == arr.get(j)) System.out.println(j);
            flag = 1;
            return (j);
        }
        return -1;
    }



        public static void main(String args[]) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(-12);
            arr.add(-10);
            arr.add(22);
            arr.add(32);
            arr.add(42);
            System.out.print(reverseArray1(arr));
           // System.out.println(arr);
        }
    }
