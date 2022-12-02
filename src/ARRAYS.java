import java.util.Scanner;

public class ARRAYS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Ask the user for a size. Create an array of doubles.
		 //Use textual divider for simplicity
		  System.out.println("---------------");
		  
		System.out.println("Input an Array Size");
		int size = in.nextInt();

		  System.out.println("---------------");
		
		double[] temp = new double[size];

		System.out.println("Input Any Numbers");
		int n = temp.length;
		int b = 0;
		
		

		// Loop through and read in values for the elements of the array

		for (int i = 0; i < n; i++) {
			double a = in.nextDouble();
			temp[b] = a;
			b++;
		}
		
		 //Use textual divider for simplicity
		  System.out.println("---------------");
		  
		  
		  //Max Number find
		double MaxNumero = 0;

		for (int i = 1; i < temp.length; i++)
            if (temp[i] > MaxNumero)
            	MaxNumero = temp[i]; 

		//Minimum Number Find
		
		double MinNumero = 0;

	
		
		for (int i = 0; i < n - 1; i++) {

			if (temp[i] <= temp[i + 1]) {
				MinNumero = temp[i];
			} else {
				MinNumero = temp[i + 1];
			}
		}

		//Find and calculate Average
		
		
		
		double sum = 0.0;

        for (double num: temp) {
           sum += num;
        }

        double AverageNumero = sum / temp.length;
		
		

		// Print out the max, the min, the average from the array.

		System.out.println("Maximum Value is ---> " + MaxNumero);
		System.out.println("Minimum Value is ---> " + MinNumero);
		System.out.println("Average Value is ---> " + AverageNumero);

		in.close();

	}

}
