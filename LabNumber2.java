package labWork;

import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		double Length;
		double Width;
		double Height;
		double Area;
		double Perimeter;
		double Volume;
		String Confirmation;
		
		do {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println("Please enter in length amount:");
			
			Length = num.nextDouble();
			
			System.out.println("Please enter in Width amount:");
			
			Width = num.nextDouble();
			
			System.out.println("Please enter in Height amount:");
			
			Height = num.nextDouble();
			
			// garbage line to clear scanner
			num.nextLine();
			
			Perimeter = (2 * Width) + (2 * Length);
			Area = (Length * Width);
			Volume = (Length * Width * Height);
			
			System.out.println("The area is: " + Area);
			System.out.println("The perimeter is: " + Perimeter);
			System.out.println("The Volume is: " + Volume);
			
			System.out.println("Do you want to try again? (Type Y to continue or Type any other key to stop)");
			Confirmation = num.nextLine();
			
			
		}
		while (Confirmation.equals("Y"));
		
		num.close();
		

	}

}
 