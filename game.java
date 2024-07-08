import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attemptsLimit = 10;
        int totalScore = 0;
        System.out.println("Guess the Number Game!");
        System.out.println("You have 10 rounds to play.");

        for (int round = 1; round <= 10; round++) {
            int numberguess = random.nextInt(100 - 1 + 1) + 1;
            int attempts = 0;
            boolean flag = false;
            System.out.println("\nRound " + round + ":");
            System.out.println("Guess the number between 1 and 100" );

            while (attempts < attemptsLimit) {
                System.out.print("Enter the number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberguess) {
                    System.out.println("Congratulations! You've guessed the number.");
                    flag = true;
                    totalScore += (attemptsLimit - attempts + 1); 
                    break;
                } else if (userGuess < numberguess) {
                    System.out.println("The number is higher than " + userGuess);
                } else {
                    System.out.println("The number is lower than " + userGuess);
                }
            }

            if (!flag) {
                System.out.println("Sorry! You've used all attempts. The number was " + numberguess);
            }

            System.out.println("You scored " + (flag ? (attemptsLimit - attempts + 1) : 0) + " points in this round.");
        }
        System.out.println("\nYour total score is: " + totalScore);
    }
}
