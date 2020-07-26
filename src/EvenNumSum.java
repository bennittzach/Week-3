import java.util.Scanner;

public class EvenNumSum {
	private static Scanner scan;
	public static void main(String[] args) {
		
		int user;
		int x;
		int sum = 0;
		
		scan = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		user = scan.nextInt();
		
		while (user < 2) {
			System.out.print("Please enter another number: ");
			user = scan.nextInt();
		}
		for (x = 1; x <= user; x++) {
			if (x % 2 == 0) {
				sum = sum + x;
			}
		}

		System.out.println("The sum of all even numbers up to " + user + " = " + sum);
		
	}

}