import java.util.Scanner;

public class Drive {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("enter the driving distance: ");
      double distance = input.nextDouble();
      System.out.print("enter miles per galon: ");
      double milesPerGalon = input.nextDouble();
      System.out.print("enter price per galon: ");
      double pricePerGalon = input.nextDouble();

      double result = distance * pricePerGalon / milesPerGalon;
      System.out.printf("the cost of driving is $%.2d", result);
   }
}