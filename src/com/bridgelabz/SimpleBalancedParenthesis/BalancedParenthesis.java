package com.bridgelabz.SimpleBalancedParenthesis;

import com.bridgelabz.DataStructurePrograms.UnOrderedList.LinkedList;

public class BalancedParenthesis {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        System.out.println(string);

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
//            System.out.println(ch);
            /*
             Stack Class to push open parenthesis "(" and pop closed parenthesis “)”.
             */
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop(ch);
            }
        }
        stack.check();
    }
}
