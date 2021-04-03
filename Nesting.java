/*
Task: Nesting (Lesson 7, Stacks & Queues)
Objective: Determine whether a given string of parentheses (single type) is properly nested.
Difficulty: Easy / Painless
Score: 100% - https://app.codility.com/demo/results/trainingBZWWNP-SR8/
*/

import java.util.Stack;

public class Nesting {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);
            if (current == '(') {
                stack.push(current);
            } else {
                if (stack.size() == 0) {
                    return 0;
                }
                if (current == ')') {
                    stack.pop();
                }
            }
        }
        if (stack.size() > 0) {
            return 0;
        }
        return 1;
    }

    public static void main (String[]args){
        Nesting test = new Nesting();
        String S = "(()(())())";
        String T = "())";
        System.out.println(test.solution(S));
    }
}
