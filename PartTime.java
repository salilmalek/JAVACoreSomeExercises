

import java.util.Scanner;

public abstract class PartTime {
public abstract void s();
	public static void main(String[] args) {
		double payrate,hour_worked;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Pay Rate : ");
		payrate=sc.nextDouble();
		System.out.println("Please Enter Working Hours for month : ");
		hour_worked=sc.nextDouble();
		
		System.out.println("PayRate : "+ payrate + "\tWorking Hours per month: "+hour_worked);
		System.out.println("Monthly salary for the person : " + payrate*hour_worked);
	}

}
