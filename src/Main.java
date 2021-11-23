

import java.util.Scanner;

public class Main {
    public static String computerChoice;
    public static String playerChoice = "";
    public static Scanner input = new Scanner(System.in);

    public static void Battle() {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("i chose " + computerChoice + " ,draw");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("Scissors") && (computerChoice.equals("paper")))) {
            System.out.println("i chose " + computerChoice + " , you win!");
        } else {
            System.out.println("i chose " + computerChoice + " , you lose");
        }
    }

    public static void main(String[] args) {
        System.out.println("lets play rock, paper, scissors, choose one to begin!");
        String[] computerOptions = {"rock", "paper", "scissors"};

        while (!(playerChoice.equals("no"))) {
            computerChoice = computerOptions[(int) ((Math.random() * 3) + 1)];
            playerChoice = input.next();
            if (!((playerChoice.equals("rock")) || (playerChoice.equals("paper")) || (playerChoice.equals("scissors")))) {
                System.out.println("please enter a valid choice");
            } else {
                Battle();
            }
            System.out.println("would you like to play again? (type \"no\" to finish)");
        }
        System.out.println("that was fun!");
    }
}
