package examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseCharacters {

    public String reverseInParentheses(String inputString) {
        Stack<Integer> parentheses = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(')
                parentheses.push(i);
            else if (inputString.charAt(i) == ')') {
                char[] A = inputString.toCharArray();
                reverse(A, parentheses.peek() + 1, i);
                inputString = String.copyValueOf(A);
                parentheses.pop();
            }
        }
        System.out.println(inputString);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != '(' && inputString.charAt(i) != ')')
                result.append(inputString.charAt(i));
        }
        return result.toString();
    }

    static void reverse(char A[], int l, int h) {
        if (l < h) {
            char ch = A[l];
            A[l] = A[h];
            A[h] = ch;
            reverse(A, l + 1, h - 1);
        }
    }
}
