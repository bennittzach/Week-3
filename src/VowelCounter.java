import java.util.Scanner;

public class VowelCounter {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Please enter a sentence: ");
		String user = scan.nextLine();

		int a = 0, e = 0, i = 0, o = 0, u = 0;
		int ccounter = 0;
		
		for (int x = 0; x < user.length(); x++) {
			char vow = user.charAt(x);
			
			switch (vow) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
				if (vow >= 'a' && vow <= 'z') {
					ccounter ++;
				}
		}
		
		System.out.println("A = " +a);
		System.out.println("E = " +e);
		System.out.println("I = " +i);
		System.out.println("O = " +o);
		System.out.println("U = " +u);
		System.out.println("The number of non-vowel characters in the sentence = " + ccounter);

	}

}