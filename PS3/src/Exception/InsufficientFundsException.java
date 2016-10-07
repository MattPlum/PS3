package Exception;

import java.io.*;

public class InsufficientFundsException extends Exception
{
   private double amount;
   
   public InsufficientFundsException(double amount) //catches error to be thrown to caller
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}
