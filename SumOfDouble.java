

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDouble {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		try{
		while(sum<10 && sum>-10){
			System.out.println("\nEnter an Double : ");
			sum+=sc.nextDouble();
			System.out.println("Sum : " + sum);
		}
		} catch (InputMismatchException e) {
			System.out.println(e + ": Please try again with Number only.");
		} catch (Exception e){
			System.out.println(e + ": Opps. Something went wrong.");
		} finally{
			sc.close();
		}
	}

}
