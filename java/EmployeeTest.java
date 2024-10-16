public class EmployeeTest {
   public static void main(String[] args) {
      Employee employee1 = new Employee("balogun", "tunde", 20007);
      Employee employee2 = new Employee("Alice", "George", 3000.8);

      employee1.setMonthlySalary(30000);
      System.out.printf("Employee name: %s%nEmployee lastname: %s%nEmployee's salary: %.2f%n", employee1.getName(), employee1.getLastName(), employee1.getMonthlySalary());
   }
}