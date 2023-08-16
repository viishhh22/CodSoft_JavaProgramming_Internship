import java.util.Scanner;
import java.util.Random;

public class number_guess {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerRange = 1;
	        int upperRange = 100;
	        int maxAttempts = 10;
	        int totalAttempts = 0;
	        int rounds = 0;

	        String playAgain;

	        do {
	            rounds++;
	            int secretNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
	            int attempts = 0;
	            
	            System.out.println("\nRound " + rounds);
	            
	            while (attempts < maxAttempts) {
	                attempts++;
	                System.out.print("Guess the number between " + lowerRange + " and " + upperRange + ": ");
	                int userGuess = scanner.nextInt();
	                
	                if (userGuess < secretNumber) {
	                    System.out.println("Too low!");
	                } else if (userGuess > secretNumber) {
	                    System.out.println("Too high!");
	                } else {
	                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + attempts + " attempts.");
	                    totalAttempts += attempts;
	                    break;
	                }
	                
	                if (attempts == maxAttempts) {
	                    System.out.println("Out of attempts. The secret number was " + secretNumber + ".");
	                }
	            }
	            
	            System.out.print("Do you want to play again? (yes/no): ");
	            playAgain = scanner.next();
	            
	        } while (playAgain.equalsIgnoreCase("yes"));
	        
	        System.out.println("\nGame over! You played " + rounds + " rounds and your total score is " + totalAttempts + " attempts.");
	        
	        scanner.close();
	    }
	}


