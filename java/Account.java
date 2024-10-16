public class Account {
   String username;
   double balance;
   int accountNumber;
   String password;

   public Account(String username, double balance) {
      this.username = username;
      if (balance > 0.0) {
         this.balance = balance;
      }
   }
   


   public void deposit(double depositMoney) {
      if (depositMoney > 0.0) {
         balance = balance + depositMoney;
      }
   }

   public void withdraw(double withdrawAmount) {
      if (withdrawAmount > 0.0 && balance > withdrawAmount) {
         balance = balance - withdrawAmount;
      }
   }

   public void transfer(Account recipient, double amount) {
      withdraw(amount);
      recipient.deposit(amount);
         
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getUsername() {
      return username;
   }

   public void setBalance(double myBalance) {
      if (myBalance > 0.0) {
         this.balance = myBalance;
      }
   }

   public double getBalance() {
      return balance;
   }
}