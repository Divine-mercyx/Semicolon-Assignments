public class CubeAndSquares {
   public static void main(String[] args) {
      int number1 = 0;
      int square1;
      int cube1;

      System.out.println("number    squares    cubes");

      do {
         square1 = number1 * number1;
         cube1 = number1 * number1 * number1;
         System.out.println();
         System.out.printf("%d          %d          %d%n", number1, square1, cube1);
         number1++;
      } while (number1 <= 10);
   }
}