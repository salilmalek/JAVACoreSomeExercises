

public class TowerOfHanoi {
	public static String[] disk= {"A","A","A","A"};
	
	public static void solve(int n, String start, String auxiliary, String end) {
		if (n == 1) {
			disk[n-1]=end;
			display();
			System.out.println("Move Disk "+(n-1)+" from "+start + " -> " + end + "\n");
		} else {
			solve(n - 1, start, end, auxiliary);
			disk[n-1]=end;
			display();
			System.out.println("Move Disk "+(n-1)+" from "+start + " -> " + end + "\n");
			solve(n - 1, auxiliary, start, end);
		}
	}
	public static void print(String poleIndex){
		for(int i=disk.length-1;i>=0;i--){
			if(disk[i]==poleIndex)
			{
				System.out.print(" "+i+" " );
			}
		}
	}
	
	public static void display(){
		System.out.print("Pole A  : ");
		print("A");
		System.out.println();
		System.out.print("Pole B  : ");
		print("B");
		System.out.println();
		System.out.print("Pole C  : ");
		print("C");
		System.out.println();
	}

	public static void main(String[] args) {
		display();
		System.out.println("Initialy disks looks like");
		
		solve(4, "A", "B", "C");
	}

}
