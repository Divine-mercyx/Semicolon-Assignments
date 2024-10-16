import java.util.Scanner;

public class SumProduct {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("enter first integer: ");
      int number1 = input.nextInt();
      System.out.print("enter second integer: ");
      int number2 = input.nextInt();
      System.out.print("enter third integer: ");
      int number3 = input.nextInt();
      int largest;
      int smallest;

      int sum = number1 + number2 + number3;
      int product = number1 * number2 * number3;
      double average = (number1 + number2 + number3) / 3;
      if (number1 > number2 && number1 > number3) {
         largest = number1;
      }
      else if (number2 > number1 && number2 > number3) {
         largest = number2;
      }

      else {
         largest = number3;
      }


      if (number1 < number2 && number1 < number3) {
         smallest = number1;
      }
      else if (number2 < number1 && number2 < number3) {
         smallest = number2;
      }

      else {
         smallest = number3;
      }

      System.out.printf("sum: %d%naverage: %.2f%nproduct: %d%nlargest: %d%nsmallest: %d%n", sum, average, product, largest, smallest);
   }
}