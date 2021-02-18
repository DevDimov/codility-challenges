/*
Task: CountDiv (Lesson 5, Prefix Sums)
Objective: Compute number of integers divisible by k in range [a..b]
Difficulty: Medium / Respectable
My scores: 37% - https://app.codility.com/demo/results/training4WFVPV-C4N/
           62% - https://app.codility.com/demo/results/trainingJY4AG8-Z2X/
           87% - https://app.codility.com/demo/results/training7SFRJD-CRE/
          100% - https://app.codility.com/demo/results/trainingBXH34Z-DU8/
*/

public class CountDiv {

    public int solution(int A, int B, int K) {
        int result = 0;
        // If K is one, everything between A and B (inclusive) is divisible by K
        if (K == 1) {
            return B - A + 1;
        }
        // If A is zero or is divisible by K, take it into account
        if (A % K == 0) {
            result++;
        }
        // Find all numbers from B to 1 that are divisible by K
        int i = B / K;
        // Find all numbers from A to 1 that are divisible by K
        int j = A / K;
        // Return all numbers between A and B that are divisible by K
        return result + i - j;
    }

    public static void main(String[] args) {
        CountDiv test = new CountDiv();
        System.out.println(test.solution(6,11,2));                       // 3
        System.out.println(test.solution(5,23,1));                       // 19
        System.out.println(test.solution(5,23,2));                       // 9
        System.out.println(test.solution(5,23,11));                      // 2
        System.out.println(test.solution(5,23,25));                      // 0
        System.out.println(test.solution(0,0,2));                        // 1
        System.out.println(test.solution(0,0,11));                       // 1
        System.out.println(test.solution(0,14,2));                       // 8
        System.out.println(test.solution(10,2000000000,1));              // 1999999991
        System.out.println(test.solution(10,2000000000,2000000000));     // 1
        System.out.println(test.solution(0,2000000000,2000000000));      // 2
        System.out.println(test.solution(100,123456789,2));              // 61728345
        System.out.println(test.solution(0,13,2));                       // 7
    }
}
