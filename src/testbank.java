import java.text.NumberFormat;
 
public class testbank
{
   private static final double RATE = 0.065;  // interest rate of 6.5%
 
   private long acctNumber;
   private double balance;
   private String name;
 
  
   public testbank (String owner, long accountNum, double initial)
   {
      this.name = owner;
      this.acctNumber = accountNum;
      this.balance = initial;
   } 
 
   public double deposit (double amount)
   {
      this.balance = this.balance + amount;
 
      return this.balance;
   } 
 
 
   public double withdraw (double amount, double fee)
   {
      this.balance = this.balance - amount - fee;
 
      return this.balance;
   } 
 
  
   public double addInterest ()
   {
      this.balance += (this.balance * RATE);
 
      return this.balance;
   }
 
   
   public double getBalance ()
   {
      return this.balance;
   }
 
   
   public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
 
      return (this.acctNumber + "\t" + this.name + "\t" + fmt.format(this.balance));
   } 
 
}

