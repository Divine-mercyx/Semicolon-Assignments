public class Christmas {

   static void countDown() {
      int count = 10;
      
      do {
         System.out.printf("count down to christmas %d%n", count);
         count++;
      }  while (count <= 25);
   }

   public static void main(String[] args) {
      countDown();
   }
}