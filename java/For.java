import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
                System.out.print("enter the length of square: ");
      		int length = input.nextInt();
      		System.out.print("enter the breadth of square: ");
		int breadth = input.nextInt();
		int breadthOne = breadth * 2;
		
		for (int count = 0; count < length; count++) {
			for (int counter = 0; counter < breadthOne; counter++) {
				System.out.print("o");
			}
			System.out.println();
		}
	}
}