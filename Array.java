public class Array {
	public static void main(String[] args) {
		int[] a= {3,2,65,23,7}; // 0,1,2,3,4
		System.out.println("Before double.");
		System.out.print("{");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("}\n");
	
		System.out.println("After double.");
		System.out.print("{");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]*2+ " ");
		}
		System.out.println("}");
		
	}
}
