
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter First String");
	String s1=sc.nextLine();
	System.out.print("Please Enter Second String");
	String s2=sc.nextLine();
	if(s1.length()==s2.length()){
		//String ss1="sam";//StringSort(s1);
		//String ss2=StringSort(s2);
		//System.out.println(ss1 + " : " + ss2);
		//if(ss1.equals(ss2)){
		if(StringSort(s1).equals(StringSort(s2))){
			System.out.println("This two strings are Anagram");
		}
		else{
			System.out.println("This two strings are not Anagram");
		}
	}
	}
	public static String StringSort(String s){
		char c1[]= s.toCharArray();
		Arrays.sort(c1);
		s=new String(c1);
		return s;
	}
}
