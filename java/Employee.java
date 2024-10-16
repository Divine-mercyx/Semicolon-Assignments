public class Employee {
   String name;
   String lastName;
   double monthlySalary;

   public Employee(String name, String lastName, double monthSalary) {
      this.name = name;
      this.lastName = lastName;
      if (monthlySalary > 0.0) {
         this.monthlySalary = monthlySalary;
      }
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setMonthlySalary(double monthlySalary) {
      this.monthlySalary = monthlySalary;
   }

   public double getMonthlySalary() {
      return monthlySalary;
   }
}