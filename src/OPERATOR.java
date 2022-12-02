import java.util.Scanner;
public class OPERATOR {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		
	     //Ask user to input a number 

		System.out.println("Enter any Number");

		//Allow the user ability to enter any number
		
	    double UserNumber = in.nextDouble();
	    
	    //Use textual divider for simplicity
	    
	    System.out.println("---------------");
	    System.out.println("THE PROCESS");
	    System.out.println("---------------");
	    
	    //Calculate as the instructions follow and report them
	    
	    double StepOne = (UserNumber-1);
	    System.out.println("Your Number Is Now "+StepOne+" After 1 is subtracted");
	    
	    double StepTwo = (StepOne*3);
	    System.out.println("Your Number Is Now "+StepTwo+" After it is multiplied by 3");
	    
	    double StepThree = (StepTwo+12);
	    System.out.println("Your Number Is Now "+StepThree+" After 12 is Added");
	    
	    double StepFour = (StepThree/3);
	    System.out.println("Your Number Is Now "+StepFour+" After it is divided by 3");
	    
	    double StepFive = (StepFour+5);
	    System.out.println("Your Number Is Now "+StepFive+" After 5 is Added");
	    
	    double StepSix = (StepFive-UserNumber);
	    System.out.println("Your Number Is Now "+StepSix+" After the original number is subtracted");
	    
	    //Use textual divider for simplicity
	    
	    System.out.println("---------------");
	    
	    //Print the Results
	    
	    System.out.println(StepSix);
	    
		}
	}
