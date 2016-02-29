

import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		int sub1, sub2, sub3, sub4, sub5, sub6;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Marks for Sub1: ");
		sub1=sc.nextInt();
		System.out.println("Please Enter Marks for Sub2: ");
		sub2=sc.nextInt();
		System.out.println("Please Enter Marks for Sub3: ");
		sub3=sc.nextInt();
		System.out.println("Please Enter Marks for Sub4: ");
		sub4=sc.nextInt();
		System.out.println("Please Enter Marks for Sub5: ");
		sub5=sc.nextInt();
		System.out.println("Please Enter Marks for Sub6: ");
		sub6=sc.nextInt();
		int Total=sub1+sub2+sub3+sub4+sub5+sub6;
		int avg=Total/6;
		System.out.println("Average : "+avg);
	}
}
