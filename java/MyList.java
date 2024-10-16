import java.util.Scanner;
import java.util.ArrayList;

public class MyList {
   public static void main(String[] args) {
      ArrayList<String> tasks = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      String one = "apple";
      String two = "ball";
      String three = "cap";
      int count = 0;


      while (count < 3) {
         System.out.print("enter a task: ");
         String task = input.nextLine();
         tasks.add(task);
         count++;
      }

      for (String i : tasks) {
         System.out.println();
         System.out.printf("i'm learning %s", i);
      }
   }
}