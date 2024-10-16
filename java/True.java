import java.util.Scanner;

public class True {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age to vote: ");
		int age = input.nextInt();
		System.out.println( age >= 18 ? "you are old enough to vote!" : "you're not old enough to vote");
	}
}