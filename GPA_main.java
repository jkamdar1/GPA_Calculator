/*This is a simple GPA calculator.;
 * 
 */
import java.util.Scanner;

public class GPA_main {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		String fullname;
		String idnum;
		int num;
		String subjects;
		char grades;
		String grade="";
		
		System.out.print("Enter your full name: ");
		fullname=scan.nextLine();
		System.out.print("Enter your ID Number: ");
		idnum=scan.nextLine();
		System.out.println("Your information is: "+ fullname + " " + idnum);
		
		System.out.print("Enter the number of classes you're taking: ");
		num=scan.nextInt();
		System.out.println("Enter your classes followed by the grade: ");
		for (int a=0; a<=num;a++) {
			subjects=scan.nextLine();
			grade=scan.nextLine();
			grades=grade.charAt(0);
		}
		
		
	}
}
