import java.util.Scanner;

public class Stuff {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("enter the first number: ");
      int number1 = input.nextInt();
      System.out.print("enter the second number: ");
      int number2 = input.nextInt();
      System.out.print("enter the third number: ");
      int number3 = input.nextInt();
      int addition = number1 + number2 + number3;
      int substraction = number1 - number2 - number3;
      int multiplication = number1 * number2 * number3;
      System.out.printf("%d%n%d%n%d%n", addition, substraction, multiplication);
   }
}
