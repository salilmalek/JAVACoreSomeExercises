

import java.util.Scanner;

public class TraditionalWeighingMachine {

	public static void main(String[] args) {
		int leftWeight=0,rightWeight=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Traditional Weighing Machine");
		do{
		System.out.println("Enter left side weight : ");
		leftWeight+=sc.nextInt();
		System.out.println("Enter right side weight : ");
		rightWeight+=sc.nextInt();
		if(leftWeight==rightWeight){
			System.out.println("Both are same");
			break;
		}
		else{
			System.out.println("Both are not same");
		}
	//	}while(leftWeight==rightWeight);
		}while(true);
		
	}
}
