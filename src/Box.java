
public class Box {
	public static void printBox(int x, int y) {
		int a, b;
		for (a = 1; a <= x; a++) {
			for (b = 1; b <= y; b++) {
				if (a == 1 || a == x || b == 1 || b == y) {
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			} System.out.println();
		}
	}
	public static void main(String args[]) {
		int row = 5, column = 5;
		printBox(row, column);
	}
}
