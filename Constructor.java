public class Constructor {
	int eid;
	String ename;
	double esalary;

	Constructor(int id, String name, double salary) {
		eid = id;
		ename = name;
		esalary = salary;
	}

	public static void main(String[] args) {
		Constructor c = new Constructor(234, "Naveen", 34534.34);
		m();
		System.out.println("ID :" + c.eid);
		System.out.println("Name :" + c.ename);
		System.out.println("Salary :" + c.esalary);
	}

	public static void m() {
	}

}
