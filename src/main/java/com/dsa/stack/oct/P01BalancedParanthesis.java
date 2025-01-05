package src.main.java.com.dsa.stack.oct;
/*
str=[{}] --true
[()}-- false
([)]--false
{}[({})]-- true
 */

import java.util.Arrays;
import java.util.Stack;

public class P01BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(isBalancedParanthesis("}{()}"));
    }

    private static boolean isBalancedParanthesis(String str) {
        char[] chars=str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return false;
                } else if (c=='}' && stack.peek()!='{') {
                    return false;
                }else if (c==']' && stack.peek()!='[') {
                    return false;
                }else if (c==')' && stack.peek()!='(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
