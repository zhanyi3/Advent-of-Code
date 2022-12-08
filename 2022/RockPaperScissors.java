import java.util.Scanner;
import java.util.ArrayList;

class RockPaperScissors {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opp, player;
        int score = 0;

        while (sc.hasNext()) {
            opp = sc.next();
            player = sc.next();
            /** Part I
             * OPPONENT
             * A: Rock, B: Paper, C: Scissors
             *
             * PLAYER
             * X: Rock, Y: Paper, Z: Scissors
             *
             * SCORE
             * X: 1, Y: 2, Z: 3
             * +
             * Win: 6, Draw: 3, Lose: 0
             */
            /**
             *
            if (opp.equals("A")) {
                if (player.equals("X")) {
                    score = score + 1 + 3;
                } else if (player.equals("Y")) {
                    score = score + 2 + 6;
                } else {
                    score = score + 3 + 0;
                }
            } else if (opp.equals("B")) {
                if (player.equals("X")) {
                    score = score + 1 + 0;
                } else if (player.equals("Y")) {
                    score = score + 2 + 3;
                } else {
                    score = score + 3 + 6;
                }
            } else {
                if (player.equals("X")) {
                    score = score + 1 + 6;
                } else if (player.equals("Y")) {
                    score = score + 2 + 0;
                } else {
                    score = score + 3 + 3;
                }
            }
            */
            /** Part II
             *
             * X: Lose, Y: Draw, Z: Win
             */
            if (player.equals("X")) {
                if (opp.equals("A")) {
                    score += 3;
                } else if (opp.equals("B")) {
                    score += 1;
                } else {
                    score += 2;
                }
            } else if (player.equals("Y")) {
                score += 3;
                if (opp.equals("A")) {
                    score += 1;
                } else if (opp.equals("B")) {
                    score += 2;
                } else {
                    score += 3;
                }
            } else {
                score += 6;
                if (opp.equals("A")) {
                    score += 2;
                } else if (opp.equals("B")) {
                    score += 3;
                } else {
                    score += 1;
                }
            }
        }
        sc.close();
        System.out.println(score);
    }
}
