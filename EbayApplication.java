

public class EbayApplication {
	public static void main(String[] args) {
		String[] FirstName = { "Salil", "Samir", "Sam", "Rukhsar", "Annkita" };
		String[] LastName = { "Malek", "Malik", "Sharma", "Pathan", "Chaudhari" };
		String[] Gender = { "Male", "Male", "Male", "Female", "Female" };
		int[] Age = { 25, 28, 19, 24, 24 };
		String[] PresentAddress = { "Fremont", "Dubai", "New York", "Fremont",
				"Surat" };
		String[] SSN = { null, "S3434fs", "G43sd43", "S4356er", null };
		String[] Telephone = { "+16692929408", "+187349579", "+349875997",
				"+9438759438", "+89235792324" };
		double[] ExpSalary = { 9000, 10000, 11000, 8000, 15000 };
		Ebay[] ebay = new Ebay[5];
		for (int i = 0; i < 5; i++) {
			ebay[i] = new Ebay(FirstName[i], LastName[i], Age[i], Gender[i],
					PresentAddress[i], SSN[i], Telephone[i], ExpSalary[i]);
			if ((ebay[i].getExpSalary() * 12) < 120000) {
				ebay[i].print();
				System.out
						.println("\n---------------------------------------------\n");
			}
		}
	}
}

class Ebay {
	public static final String CompanyName = "Ebay";
	String FirstName, LastName, Gender;
	int Age;
	private String PresentAddress, SSN, Telephone;
	double ExpSalary;

	public Ebay(String firstName, String lastName, int age, String gender,
			String presentAddress, String sSN, String telephone,
			double expSalary) {

		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
		this.Gender = gender;
		this.PresentAddress = presentAddress;
		this.SSN = sSN;
		this.Telephone = telephone;
		this.ExpSalary = expSalary;
	}

	public String getPresentAddress() {
		return PresentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		PresentAddress = presentAddress;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public double getExpSalary() {
		return ExpSalary;
	}

	public void print() {
		System.out.println(FirstName + " " + LastName + "\nAge : " + Age
				+ "\tGender : " + Gender + "\nAddress : " + PresentAddress
				+ "\nTelephone :  " + Telephone + "\nSSN : " + SSN
				+ "\nExpected Salary Per Month : " + ExpSalary);
	}

}
