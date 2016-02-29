
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaFinder {

	public static void main(String[] args) {
		int Input=0;
		do {
			System.out.println("Select shape from the below list \nPress 1 to find area of Circle. \nPress 2 to find area of Square. \nPress 3 to find area of rectangle. \nPress any other key to exit.");
			try{
			Input =new Scanner(System.in).nextInt();
			}
			catch(InputMismatchException e){
				break;
				//System.out.println("You entered non integer value.\n Please try again.");
			}
		} while (area(Input));
		System.out.println("Thank you for using this.");
	}

	public static boolean area(int Input) {
		double result;
		Scanner scan = new Scanner(System.in);
		switch (Input) {
		case 1: // circle
			System.out.print("Please enter value of Radius : ");
			double r = scan.nextDouble();
			result = (Math.PI * (r * r));
			//System.out.println(result);
			System.out.println("Area of circle is : " +(double) Math.round(result *100)/100);
			break;
		case 2: // square
			System.out.print("Please enter value of one side : ");
			double s = scan.nextDouble();
			result = (s * s);
			System.out.println("Area of square is : " +(double) Math.round(result *100)/100);
			break;
		case 3: // rectangle
			System.out.print("Please enter value of length : ");
			double l = scan.nextDouble();
			System.out.print("Please enter value of width : ");
			double w = scan.nextDouble();
			result = (l * w);
			System.out.println("Area of rectangle is : " +(double) Math.round(result *100)/100);
			break;
		default:
			return false;
		}
		System.out.println("\n\n----------------------------------END-------------------------------\n\n");
		return true;
	}

}
