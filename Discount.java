

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number of Cookies : ");
		int numberOfCookies=sc.nextInt();
		System.out.print("Please Enter Number of Cakes : ");
		int numberOfCakes=sc.nextInt();
		double itemPrice=(numberOfCakes*0.03)+(numberOfCookies*0.05);
		double discount;
		if(itemPrice>10){
			discount=itemPrice*0.05;
		}
		else{
			discount=0;
		}
		double itemPriceAfterDiscount=itemPrice-discount;
		System.out.println("You got discount of : "+discount+ "$");
		System.out.println("Final Price : " +itemPriceAfterDiscount+"$");
	}
}
