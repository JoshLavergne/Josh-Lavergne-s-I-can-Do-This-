import java.util.Random;

public class REPITITION {

	public static void main(String[] args) {
		

		//Use a random number generator, pick three digits from 0-9.
		
		
		
		Random go = new Random();
		
		//Random generator
		int random01 = go.nextInt(9)+1;
		
		//Random generator
		int random02 = go.nextInt(9)+1;
		//Random generator
		
		int random03 = go.nextInt(9)+1;
		
		System.out.println("The primary randomized set of numbers is "+random01 +" "+random02+" "+random03);
		
		//Use textual divider for simplicity
		  System.out.println("---------------");
		//Random generator
		int random04 = go.nextInt(9)+1;
		
		//Random generator
		int random05 = go.nextInt(9)+1;
		
		//Random generator
		int random06 = go.nextInt(9)+1;
		
		int RepeatCount = 0;
		
		//Repeatedly pick 3-digit numbers until you have the same number as the original 3.

		
		while (random01!=random04 || random02!=random05 || random03!=random06) {
			random04 = go.nextInt(9)+1;
			
			
			random05 = go.nextInt(9)+1;
			
			
			random06 = go.nextInt(9)+1;
			
		
			
			//Count how many repetitions you needed to do and print out the result.

			RepeatCount++;
		}
		
		System.out.println("You need the following repeats to get the desired value; "+ RepeatCount);
	}

}