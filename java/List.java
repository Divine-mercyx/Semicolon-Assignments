import java.util.Scanner;

public class List {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enetr the number bruh: ");
      int number1 = input.nextInt();
      int result1 = number1 / 100;
      int result2 = (number1 / 10)%10;
      int result3 = number1 % 10;
      int myResult = result1 + result2 + result3;
      System.out.printf("the result is %d", myResult); 
   }
}