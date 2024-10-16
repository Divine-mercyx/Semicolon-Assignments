import java.util.Scanner;

public class Task {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("student grade average calculator");
      int counter = 0;
      int sum = 0;

      System.out.print("Enter the number of students: ");
      int numberOfStudents = input.nextInt();

      do {
         System.out.print("enter grades: ");
         int grades = input.nextInt();
         sum = sum + grades;
         counter++;
      }  while (counter < numberOfStudents);

      double average = sum / numberOfStudents;
      System.out.println();
      System.out.printf("the sum of the grade of %d students is: %d%nAnd the average score of the students is: %.2f", numberOfStudents, sum, average);
   }
}