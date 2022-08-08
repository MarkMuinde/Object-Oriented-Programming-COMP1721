import java.util.*;

public class Ex8 {
public static void main (String[] args)
{

BankAccount testBankAccount1 = new BankAccount("bankacctest1", 500000);
if (testBankAccount1.withdraw(90000) == true)
System.out.println ("Withdrawal successful. New balance : " + testBankAccount1.getBalance() );
else
System.out.println ("Invalid withdrawal. Current balance = " + testBankAccount1.getBalance());


BankAccount testBankAccount2 = new BankAccount("bankacctest2", 500000);
if (testBankAccount2.withdraw(4000000) == true)
System.out.println ("Withdrawal successful. New balance : " + testBankAccount2.getBalance() );
else
System.out.println ("Invalid withdrawal. Current balance = " + testBankAccount2.getBalance());

}
}
