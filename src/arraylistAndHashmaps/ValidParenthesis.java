package arraylistAndHashmaps;

import java.util.*;

public class ValidParenthesis {
    public static void main(String args[]) {
        //String s = "([}}])";
        String s = "{{}[][[]]]}";
        int flag = 0;

        System.out.println(s.length());
        System.out.println(s.charAt(0));
        int length = s.length();
        int i = 0;
        char element;

        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push('$');
            for (i = 0; i < length; i++) {
                System.out.println("Top of stack " + stack.peek());
                System.out.println("Char at i " + s.charAt(i));
                element = s.charAt(i);

                if(element == '{' || element== '[' || element == '('){
                    stack.push(element);
                }else if((stack.peek()=='{' && element =='}') ||
                            stack.peek()=='[' && element ==']' ||
                                stack.peek()=='(' && element ==')'){
                        stack.pop();
                    }
                    else{
                        System.out.println("False1");
                    }
                }
            if(stack.peek() == '$'){
                System.out.println("True3");
            }else{
                System.out.println("False3");
            }
    }
}
