package arraylistAndHashmaps;

public class CheckPalindrom {
    public static void main(String args[]){
        String s = "123211";
        System.out.println(s.length());
        int lastIndex = s.length() - 1;
        int flag = 0;
        int i=0;
        int count =0;
       while(count < s.length()/2){
           if (s.charAt(i) == s.charAt(lastIndex)){
               i++;
               lastIndex--;
           }else{
               System.out.println("this is not a palindrodm");
               System.exit(1);
           }
       }
        System.out.println("this is  a palindrodm");

    }

//        public static Boolean isPalindrome(String s) {
//            // Write your code here..
//            int lastindex = s.length() - 1;
//            for(int i=0;i<=lastindex;i++){
//                if(s.charAt(i) == s.charAt(lastindex)){
//                    lastindex--;
//                }
//                else{
//                    isPalindrome = false;
//                    return(isPalindrome);
//                }
//            }
//
//        }
//        isPalindrome = true;
//	return(isPalindrome);


}
