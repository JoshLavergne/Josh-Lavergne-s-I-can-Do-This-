import java.util.Scanner;
public class SELECTION {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	//Allow the user to know what the application at hand is + Textual Divider
	
	System.out.println("REVENUE TAX CALCULATOR");
	System.out.println("----------------------");
	
	//Find the user revenue
	
	System.out.println("What is your annual Salary?");
	
	 double Salary = in.nextDouble();
	 
	 //Textual Divider
	 
	 System.out.println("----------------------");
	 
	 //Calculate tax based off instructions, finalize and report
	 
	 
	 if (Salary <= 49020) {
	 System.out.println("Your total tax is " + Salary * 0.15 + " dollars"); 
	 }
	 
	 else if (Salary <= 98040 && Salary > 49020) {
	 System.out.println("Your total tax is " + (Salary * 0.205) + " dollars"); 
	 }

	 else if (Salary <= 151978 && Salary > 98040) {
	 System.out.println("Your total tax is " + Salary * 0.26 + " dollars"); 
	 }
	 
	 else if (Salary <= 216511 && Salary > 151978) {
	 System.out.println("Your total tax is " + Salary * 0.29 + " dollars"); 
	 }
	 
	 else if (Salary >= 515550) {
	 System.out.println("Your total tax is " + Salary * 0.33 + " dollars"); 
	 }
	 

	}
}