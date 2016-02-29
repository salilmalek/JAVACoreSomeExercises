

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X;
		double ans;
		System.out.println("Please Enter Interger Value for X: ");
		X = sc.nextInt();
		ans = 3 * Math.pow(X, 2) - (8 * X) + 4;
		System.out.println("Your Answer is : " + ans);
	}
}
