import java.util.Scanner;

public class UsersName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
                System.out.print("Enter your name: ");
		String username = input.nextLine();
		System.out.println("Hi " + username + ", nice to meet you");
		System.out.printf("Hi %s, nice to meet you\n", username);
		System.out.print("Hi " + username + ", nice to meet you");


	}
}