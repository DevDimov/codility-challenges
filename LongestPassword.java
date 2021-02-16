public class LongestPassword {

    public int solution(String S) {
        int N = -1;
        String[] passwords = S.split(" ");
        for (int i = 0; i < passwords.length; i++) {
            int letters = 0;
            int numbers = 0;
            for (int j = 0; j < passwords[i].length(); j++) {
                char ch = passwords[i].charAt(j);
                if (Character.isLetter(ch)) {
                    letters++;
                }
                else if (Character.isDigit(ch)) {
                    numbers++;
                }
                else {
                    letters = 0;
                    numbers = 0;
                    break;
                }
            }
            if (letters % 2 == 0 && numbers % 2 != 0) {
                N = Math.max(N, passwords[i].length());
            }
        }
        return N;
    }

    public static void main(String[] args) {
        LongestPassword test = new LongestPassword();
        String S = "test 5 a0A pass007 ?xy1";
        String T = "test1?";
        String U = "0abd 0ab 0a 0";
        System.out.println(test.solution(S));
    }
}