

public class DesignLine2 {

	public static void main(String[] args) {
		int n=0;
		for(int i=8;i>0;i--)
		{
			for(int j=i;j>=0;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=n;j++){
				System.out.print("*");
			}
			n+=2;
			System.out.println();
		}
		for(int j=0;j<3;j++){
			System.out.println("\t***");
		}
	}
}
