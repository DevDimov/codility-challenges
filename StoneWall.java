/*
Task: StoneWall (Lesson 7, Stacks and Queues)
Objective: Cover "Manhattan skyline" using the minimum number of rectangles
Difficulty: Easy / Painless
My score: https://app.codility.com/demo/results/training6MRR4J-MM5/
*/

import java.util.Stack;

class Solution {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        stack.push(H[0]);
        for (int i = 1; i < H.length; i++) {
            if (H[i] > stack.peek()) {
                stack.push(H[i]);
                count++;
            }
            if (H[i] < stack.peek()) {
                while (!stack.empty() && H[i] < stack.peek()) {
                    stack.pop();
                }
                if (!stack.empty() && H[i] == stack.peek()) {
                    continue;
                }
                else {
                    stack.push(H[i]);
                    count++;
                }
            }
        }
        return count;
    }
}
