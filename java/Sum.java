import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter ten integers to get the sum");
      System.out.print("enter the first integer: ");
      int one = input.nextInt();
      System.out.print("enter the second integer: ");
      int two = input.nextInt();
      System.out.print("enter the third integer: ");
      int three = input.nextInt();
      System.out.print("enter the fourth integer: ");
      int four = input.nextInt();
      System.out.print("enter the fifth integer: ");
      int five = input.nextInt();
      System.out.print("enter the sixth integer: ");
      int six = input.nextInt();
      System.out.print("enter the seventh integer: ");
      int seven = input.nextInt();
      System.out.print("enter the eighth integer: ");
      int eight = input.nextInt();
      System.out.print("enter the ninth integer: ");
      int nine = input.nextInt();
      System.out.print("enter the tenth integer: ");
      int ten = input.nextInt();

      int sum = one + two + three + four + five + six + seven + eight + nine + ten;
      System.out.println(one + " + " + two + " + " + three + " + " + four + " + " + five + " + " + six + " + " + seven + " + " + eight + " + " + nine + " + " + ten + " : " + sum);
   }
}