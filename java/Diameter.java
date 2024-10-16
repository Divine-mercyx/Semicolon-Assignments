import java.util.Scanner;

public class Diameter {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the radius of a circle: ");
      int radiusOfCircle = input.nextInt();
      System.out.println();
      double diameter1 = 2 * radiusOfCircle;
      double circumference1 = 2 * 3.14159 * radiusOfCircle;
      double area1 = 3.14159 * radiusOfCircle * radiusOfCircle;
      System.out.printf("diameter: %.2f%ncircumference: %.2f%narea: %.2f", diameter1, circumference1, area1);
   }
}