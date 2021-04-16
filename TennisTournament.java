/*
Task: TennisTournament (Lesson 92, Tasks from Indeed Prime 2016 College Coders challenge)
Objective: Given the numbers of players and available courts, calculate the maximum number of parallel tennis games
Difficulty: Very easy / Effortless
My score: 100% - https://app.codility.com/demo/results/trainingGAXRC5-TWN/
*/

public class TennisTournament {
    public int solution(int P, int C) {
        int maxGames = 0;
        while (C-1 >= 0 && P-2 >= 0) {
            maxGames++;
            C--;
            P = P - 2;
        }
        return maxGames;
   }
   public static void main(String[] args) {
        TennisTournament test = new TennisTournament();
        int P = 5, C = 3; //2
//        int P = 10, C = 3; //3
//        int P = 1, C = 1; //0
//        int P = 2, C = 9; //1
        System.out.println(test.solution(P, C));
    }
}
