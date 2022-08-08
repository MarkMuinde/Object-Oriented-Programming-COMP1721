import java.util.*;
import java.lang.*;
import java.math.*;

public class Ex12 {
    public static void main (String[] args)
    {
    
    SavingsAccount testSavingsAccount1 = new SavingsAccount("savingsacctest1", 500000);
    testSavingsAccount1.setInterestRate(0.15);
    testSavingsAccount1.applyInterest();
    testSavingsAccount1.withdraw(90000);
    System.out.println ("Account number : " + testSavingsAccount1.getAccountNumber() + "     Current balance :  " + testSavingsAccount1.balanceToString());

    SavingsAccount testSavingsAccount2 = new SavingsAccount("savingsacctest2", 78300);
    testSavingsAccount2.setInterestRate(0.15);
    testSavingsAccount2.applyInterest();
    testSavingsAccount2.withdraw(90000);
    //invalid withdrawal as balance would have been £45
    System.out.println ("Account number : " + testSavingsAccount2.getAccountNumber() + "     Current balance :  " + testSavingsAccount2.balanceToString());

    SavingsAccount testSavingsAccount3 = new SavingsAccount("savingsacctest3", 500000);
    testSavingsAccount2.setInterestRate(0.01);
    testSavingsAccount3.applyInterest();
    testSavingsAccount3.withdraw(90000);
    //invalid withdrawal as interest rate is below 0.05 %
    System.out.println ("Account number : " + testSavingsAccount3.getAccountNumber() + "     Current balance :  " + testSavingsAccount3.balanceToString());

    }
    }