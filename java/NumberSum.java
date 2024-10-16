import java.util.Scanner;

public class NumberSum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("enter three numbers: ");
      int number = input.nextInt();
      int result1 = number / 100;
      int remainders = number % 100;
      int result2 = remainders / 10;
      int result3 = remainders % 10;
      int sumOfResults = result1 + result2 + result3;
      System.out.printf("the sum of the result is %d%n", sumOfResults);
   }
}