package arraylistAndHashmaps;

import java.util.Locale;

public class decimaltoBinaty {
    public static void main(String args[]){
        int num =6;
        int num2 = 4;
        String binary = "";
        String binary2 ="";
        int reminder;
        int reminder2;
        int i = 0;
        int j = 0;

        while(num != 0){
            reminder = num % 2;
            binary = reminder + binary;
            i = i+1;
            num = num / 2;
        }
        while(num2 != 0){
            reminder2 = num2 % 2;
            binary2 = reminder2 + binary2;
            j = j+1;
            num2 = num2 / 2;
        }
        System.out.println("This is A-  "+binary);
        System.out.println("This is B-  "+binary2);
//        System.out.println(binary);
//        System.out.println(binary2);
        if(binary.length() < binary2.length()){
            int diff = binary2.length() - binary.length();
            for(int k = 0; k < diff ; k++ ){
                binary = 0 + binary;
            }
        }else if(binary2.length() < binary.length()){
            int diff = binary.length() - binary2.length();
            for(int k = 0; k < diff ; k++ ){
                binary2 = 0 + binary2;
            }
        }
        System.out.println("This is A-  "+binary);
        System.out.println("This is B-  "+binary2);
        int count =0;
        for(int l=0; l<binary.length() ; l++){
            if(binary.charAt(l) != binary2.charAt(l)){
                count = count + 1;
            }
        }
        System.out.println(count);


    }
}
