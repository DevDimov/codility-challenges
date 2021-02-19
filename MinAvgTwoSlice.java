/*
Task: MinAvgTwoSlice (Lesson 5, Prefix Sums)
Objective: Find the minimal average of any slice containing at least two elements
Difficulty: Medium / Respectable
My scores: 60% - https://app.codility.com/demo/results/trainingGNEC2P-QSU/
          100% - https://app.codility.com/demo/results/trainingJF2SDP-EB6/
*/

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int start = 0;
        double min = 10000;
        double currentMin;
        for (int i=0; i<A.length-1; i++) {
            double x = A[i];
            double y = A[i+1];
            currentMin = (x + y) / 2;
            if (currentMin < min) {
                min = currentMin;
                start = i;
            }
            if (i < A.length-2) {
                double z = A[i+2];
                currentMin = (x + y + z) / 3;
                if (currentMin < min) {
                    start = i;
                    min = currentMin;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        MinAvgTwoSlice test = new MinAvgTwoSlice();
        System.out.println(test.solution(new int[]{4,2,2,5,1,5,8}));                // 1
        System.out.println(test.solution(new int[]{-3,-5,-8,-4,-10}));              // 2
        System.out.println(test.solution(new int[]{6,11,2}));                       // 0
        System.out.println(test.solution(new int[]{5,23,1}));                       // 0
        System.out.println(test.solution(new int[]{5,23,2}));                       // 0
        System.out.println(test.solution(new int[]{0,5,0,4,0,3,0,2}));              // 4
        System.out.println(test.solution(new int[]{-5,-23,-25}));                   // 1
        System.out.println(test.solution(new int[]{0,0,2}));                        // 0
    }
}