import java.util.Random;
import java.util.Scanner;

public class RockPaperSeasorGame {
    static int gameTemplate(int round, int comScore, int myScore) {
        System.out.println("Instruction \nPress 1 for Stone \nPress 2 for Paper \nPress 3 for Seashore");
        System.out.println("Round " + round + "round+ \nComputer score: " + comScore + "\nYour Score " + myScore);
        return 0;
    }

    public static void main(String[] args) {
        int myScore = 0;
        int computerScore = 0;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        for (int round = 1; round <= 3; round++) {
            gameTemplate(round, computerScore, myScore);
            int comTurn = random.nextInt(3);
            comTurn++;
            int myTurn = sc.nextInt();
            if (comTurn == myTurn) {
                System.out.println("Draw turn");
                continue;
            } else {
                System.out.println("Computer turn\n" + comTurn);
                switch (comTurn) {
                    case 1:
                        if (myTurn == 3) {
                            computerScore++;
                        } else {
                            myScore++;
                        }
                        break;
                    case 2:
                        if (myTurn == 1) {
                            computerScore++;
                        } else {
                            myScore++;
                        }
                        break;
                    case 3:
                        if (myTurn == 2) {
                            computerScore++;
                        } else {
                            myScore++;
                        }
                }

            }
        }
        System.out.println("Computer vs Me\t" + computerScore + ":" + myScore);
        if (computerScore > myScore) {
            System.out.println("Computer win");
        } else {
            System.out.println("I win");
        }
    }
}
