import java.util.Scanner;

public class Geometry {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("enter first point (e.g two point (23.5 4.5)): ");
      double int1 = input.nextDouble();
      double int2 = input.nextDouble();
      double point1 = int1 + int2;

      System.out.print("enter second point (e.g two point (23.5 4.5)): ");
      double int3 = input.nextDouble();
      double int4 = input.nextDouble();
      double point2 = int3 + int4;

      System.out.print("enter third point (e.g two point (23.5 4.5)): ");
      double int5 = input.nextDouble();
      double int6 = input.nextDouble();
      double point3 = int1 + int2;

      double sum = (point1 + point2 + point3) / 2;
      double result = sum * (sum - point1) * (sum - point2) * (sum - point3);
      double area = Math.sqrt(result);
      System.out.printf("the area of the triangle is: %.2f", area);
      
   }
}