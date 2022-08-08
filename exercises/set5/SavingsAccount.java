import java.util.*;
import java.lang.*;
import java.math.*;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(){
        this.interestRate = interestRate ;
        interestRate = 0.05;
    }

    public SavingsAccount( String num , int bal){
        super (num, bal) ;
    }

    public SavingsAccount ( String num, int bal, double rate){
        super (num, bal) ;
    }

    public void setInterestRate(double rate){
        interestRate = rate ;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void applyInterest(){
        if (interestRate <= 0.0){
            throw new IllegalArgumentException ("Invalid interest rate");
        }
        else{
        double incrementedBalance = interestRate * balance ;
        int incrementedBalanceAsInteger = (int) Math.round(incrementedBalance);
        balance = balance + incrementedBalanceAsInteger ;
        }
    }

    public String balanceToString(){
        String balanceAsString = String.valueOf(balance);
        return balanceAsString;
    }

    @Override
    public void withdraw (int amount){
        if(amount > 0 && balance-amount>100){
            balance=balance-amount;
        }
        else{
            System.out.printf("Invalid amount for withdrawal for the ");
        }
    }
}


