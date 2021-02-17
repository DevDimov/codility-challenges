/*
Task: MissingInteger (Lesson 4, Counting Elements)
Objective: Find the smallest positive integer that does not occur in a given sequence
Difficulty: Medium / Respectable
My score: https://app.codility.com/demo/results/trainingHBFGZA-ZNV/
*/

import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        if (A[A.length - 1] <= 0) {
            return result;
        }
        for (int i=0; i < A.length; i++) {
            if (A[i] > 0 && A[i] == result) {
                result = A[i] + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MissingInteger test = new MissingInteger();
        System.out.println(test.solution(new int[]{1,3,6,4,1,2}));  // 5
        System.out.println(test.solution(new int[]{1,2,3}));        // 4
        System.out.println(test.solution(new int[]{-1,-3}));        // 1
        System.out.println(test.solution(new int[]{-3,-1,1}));      // 2
        System.out.println(test.solution(new int[]{-3,-1,2}));      // 1
        System.out.println(test.solution(new int[]{0,0,0,2,1,0}));  // 3
    }
}