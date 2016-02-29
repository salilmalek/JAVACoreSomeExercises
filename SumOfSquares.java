
import java.util.Scanner;
public class SumOfSquares {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Number");
		int number=sc.nextInt();
		double sum=0;
		while(number>0){
			sum=sum+ Math.pow(number, 2);
			number--;
		}
		System.out.println("Sum of Square :" +sum);
	}
	
	//Or use n(n+1)(2n+1)/6

}