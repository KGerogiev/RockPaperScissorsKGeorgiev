import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors and press Enter: ");
        String playerMove = scanner.next();

        if (playerMove.equals("r") || playerMove.equals("R") || playerMove.equals("Rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("P") || playerMove.equals("Paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("S") || playerMove.equals("Scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }
        Random random = new Random();
        int radnomComputerChoise = random.nextInt(3);

        String computerMove = "";

        switch (radnomComputerChoise) {
            case 0:
                computerMove = ROCK;
                break;
            case 1:
                computerMove = PAPER;
                break;
            case 2:
                computerMove = SCISSORS;
                break;
        }
        System.out.println("The computer choose: " + computerMove);

        String gameResult = "";

        if (playerMove.equals("Rock") && computerMove.equals("Scissors") ||
            playerMove.equals("Paper") && computerMove.equals("Rock") ||
            playerMove.equals("Scissors") && computerMove.equals("Paper")){
            gameResult = "You win!";
        } else if (playerMove.equals("Rock") && computerMove.equals("Paper") ||
                   playerMove.equals("Paper") && computerMove.equals("Scissors") ||
                   playerMove.equals("Scissors") && computerMove.equals("Rock")){
            gameResult = "You Lose!";
        } else {
            gameResult = "The game was a drow!";
        }
        System.out.println(gameResult);


    }
}
