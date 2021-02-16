import java.util.Stack;

public class CodilityFish {

    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0 && stack.isEmpty()) {
                count++;
            }
            else if (B[i] == 1) {
                stack.push(A[i]);
            }
            else if (B[i] == 0 && !stack.isEmpty()) {
                int x = stack.peek();
                while (x < A[i] && !stack.isEmpty()) {
                    x = stack.pop();
                    if (!stack.isEmpty()) {
                        x = stack.peek();
                    }
                    else {
                        count++;
                    }
                }
            }
        }
        return stack.size() + count;
    }

    public static void main(String[] args) {
        CodilityFish test = new CodilityFish();
        int[] A = {8,6,1,2,7,10};
        int[] B = {1,1,0,0,0,0};
        int[] C = {4,3,2,1,5};
        int[] D = {0,1,0,0,0};
        System.out.println(test.solution(C, D));
    }
}
