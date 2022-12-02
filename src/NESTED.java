import java.util.Scanner;
public class NESTED {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		
	//Allow user to input 2 numbers
	
		System.out.print("Input a Number");
		
		int NumberUno = in.nextInt();
		
		System.out.print("Input another Number");
		
		int NumberDos = in.nextInt();
		
		
		//Create the Multiplication Table
		
		System.out.print("Multiplication table\n");
		
		
		//Inner Table
		
		for (int x = 1; x <=NumberDos; x++) {
			
			for (int y = 1; y <=NumberDos; y++) {
				
		
		// Basic Multiplication Table 
		//for (int a=1; a<=10;a++) {
		//for (int b=1;b<=10;b++) {
		//System.out.print(a*b+"\t");
		
		    	//Print results
		    	
		     System.out.print(x*y+"\t");
		   
		            }
		    
		    
		    
		            System.out.println();
		        }
		    }
		}