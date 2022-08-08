import java.util.*;

public class Ex9 {
public static void main (String[] args)
{

BankAccount testBankAccount1 = new BankAccount("bankacctest1", 500000);
testBankAccount1.withdraw(90000);
System.out.println (testBankAccount1.toString());

BankAccount testBankAccount2 = new BankAccount("bankacctest2", 500000);
testBankAccount2.withdraw(4000000);
System.out.println (testBankAccount2.toString());

BankAccount testBankAccount3 = new BankAccount();
testBankAccount3.withdraw(4000000);
System.out.println (testBankAccount3.toString());

}
}
