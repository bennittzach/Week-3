import java.util.Scanner;
import java.util.Random;
public class AgeGuess {

	private static Scanner scan;

	public static void main(String[] args) {
		Random rand = new Random();
		int age = 101;
		int int_random = rand.nextInt(age);
		
		scan = new Scanner(System.in);
		
		System.out.print("Please Enter Age Guess: ");
		
		int ageGuess = scan.nextInt();
		
		while (ageGuess != int_random) {

		System.out.println("Wrong guess, Try Again!");
		System.out.print("Please enter another guess: ");
		ageGuess = scan.nextInt();
			
		}
		
		if (ageGuess == int_random) {
			System.out.println("You are Correct!");
		}

	}

}