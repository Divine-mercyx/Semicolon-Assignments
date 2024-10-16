import java.util.Scanner;

public class Velocity {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("enter the v0 velocity in meter/seconds: ");
      double velocityZero = input.nextDouble();
      System.out.print("enter the v1 velocity in meter/seconds: ");
      double velocityOne = input.nextDouble();
      System.out.print("enter the time in seconds: ");
      double time = input.nextDouble();


      double averageAcceleration = (velocityOne - velocityZero) / time;

      System.out.printf("the average acceleration %.2f", averageAcceleration);
      
   }
}