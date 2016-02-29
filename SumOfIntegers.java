

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		try{
		while(sum<10 && sum>-10){
			System.out.println("\nEnter an Integer : ");
			sum+=sc.nextInt();
			System.out.println("Sum : " + sum);
		}
		} catch (InputMismatchException e) {
			System.out.println(e + ": Please try again with integer number.");
		} catch (Exception e){
			System.out.println(e + ": Opps. Something went wrong.");
		} finally{
			sc.close();
		}
	}


}
