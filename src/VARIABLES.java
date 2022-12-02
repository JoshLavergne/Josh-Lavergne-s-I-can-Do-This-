import java.util.Scanner;
public class VARIABLES {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Use textual divider for simplicity
		  System.out.println("---------------");
		  
		//Read in 1 integer, 1 double, and one String
		  
		System.out.println("Input an Integer:");
			int Uno = in.nextInt();
			
			//Use textual divider for simplicity
			  System.out.println("---------------");
			  
			
		System.out.println("Input A Double:");	
			double Dos  = in.nextDouble();
			
			//Use textual divider for simplicity
			  System.out.println("---------------");
			
		System.out.println("Input A String:");
		String Tres= in.next();
			
			//Use textual divider for simplicity
			  System.out.println("---------------");
			  
			
			in.close();
		}
	}
