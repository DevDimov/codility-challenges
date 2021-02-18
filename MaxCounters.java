/*
Task: MaxCounters (Lesson 4, Counting Elements)
Objective: Calculate the values of counters after applying all alternating operations.
Difficulty: Medium / Respectable
My scores: 66% - https://app.codility.com/demo/results/trainingRKVWVS-2U8/
           77% - https://app.codility.com/demo/results/trainingCPRBPX-6AN/
          100% - https://app.codility.com/demo/results/trainingTESS6V-M9E/
*/

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int currentMax = 0;
        int lastIncrease = 0;
        int[] result = new int[N];
        Arrays.fill(result, 0);
        for (int i=0; i<A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                result[A[i]-1] = Math.max(result[A[i]-1], lastIncrease);
                result[A[i]-1] += 1;
                currentMax = Math.max(currentMax, result[A[i]-1]);
            }
            else if (A[i] == N + 1) {
                lastIncrease = currentMax;
            }
        }
        for (int i=0; i<N; i++) {
            result[i] = Math.max(result[i], lastIncrease);
        }
        return result;
    }
    
    public static void main(String[] args) {
        MaxCounters test = new MaxCounters();
        System.out.println(Arrays.toString(test.solution(5, new int[]{3,4,4,6,1,4,4})));     // {3,2,2,4,2}
        System.out.println(Arrays.toString(test.solution(5, new int[]{1,1,2,2})));           // {2,2,0,0}
        System.out.println(Arrays.toString(test.solution(1, new int[]{1,1,2,2})));           // {2}
    }
