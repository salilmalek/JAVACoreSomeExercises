

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareValues {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Start Number and End Number: ");
			toPrintSquareValues(sc.nextInt(), sc.nextInt());
		} catch (InputMismatchException e) {
			System.out.println(e + ": Please try again with integer number.");
		} catch (Exception e){
			System.out.println(e + ": Opps. Something went wrong.");
		}
	}

	public static void toPrintSquareValues(int start, int end) {
		System.out.println("Value\tSquare");
		if (start <= end) {
			for (; start <= end; start++) {
				System.out.println(start + "\t" + (int) Math.pow(start, 2));
			}
		} else {
			for (; start >= end; start--) {
				System.out.println(start + "\t" + (int) Math.pow(start, 2));
			}
		}
	}
}
