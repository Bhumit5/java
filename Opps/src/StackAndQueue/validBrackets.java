package StackAndQueue;

import java.util.Stack;

public class validBrackets {

    static int nBrackats(String s){
        Stack<Character> c = new Stack<>();
        for (char ch: s.toCharArray()) {
            if(ch == '(')
                c.push(ch);
            else
                c.pop();
        }
//        int count = 0;
//        while(!c.isEmpty()){
//            c.pop();
//            count++;
//        }

        return c.size();
    }

    static boolean validate(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                if(ch == ')'){
                    if(stack.pop() != '(')
                        return false;
                }

                if(ch == ']'){
                    if(stack.pop() != '[')
                        return false;
                }

                if(ch == '}'){
                    if(stack.pop() != '{')
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "((((((((((";

        System.out.println(nBrackats(s));
    }
}
