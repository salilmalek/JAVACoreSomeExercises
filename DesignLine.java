

import java.util.Scanner;

public class DesignLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (; number > 0; number--) {
			for (int _IndexNumber = number; _IndexNumber > 0; _IndexNumber--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
