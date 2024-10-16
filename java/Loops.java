import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double milesPerGalon;
		int counter = 1;
		//double sumOfMilesPerGalon;

		System.out.print("Enter the number of trips: ");
		int trips = input.nextInt();

		while (counter <= trips) {
			System.out.print("enter the miles given for a trip: ");
			int mile = input.nextInt();
			System.out.print("enter the galon used for a trip: ");
			int galon = input.nextInt();
			milesPerGalon = mile / galon;
			System.out.println("the mile per galon for this trip is: " + milesPerGalon);
			//double sumOfMilesPerGalon = sumOfMilesPerGalon + milesPerGalon;
			counter++;
		}

			//System.out.println("the mile per galon for this trip is: " + milesPerGalon);
			//System.out.println("the sum of the mile per galon is: " + sumOfMilesPerGalon);
		
	}
}