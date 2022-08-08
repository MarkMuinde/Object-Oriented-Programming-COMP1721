import java.util.*;
import java.lang.*;

public class BankAccount{
private String accountNumber;
private int balance;
private int amount;

public BankAccount (){
    this.accountNumber = accountNumber;
    this.balance = balance;
}

public BankAccount(String num){
    balance = 0 ;
    if (num == null){
        throw new IllegalArgumentException("You must have entered a bank account");
    }
    else{
        accountNumber = num;
    }
}

public BankAccount(String num, int bal){
    if (num == null || bal < 0){
        throw new IllegalArgumentException("A field account is empty");
    }
    else{
        accountNumber = num;
        balance = bal;
    }
}

public String getAccountNumber(){
    return accountNumber;
}

public int getBalance(){
    return balance;
}

public int getAmount(){
    return amount;
}

public void deposit (int amount){
    if(amount>0){
        balance=balance + amount;
    }
    else{
        throw new IllegalArgumentException("Invalid amount");
    }
}

public void withdraw (int amount){
    if(amount > 0 && balance >= amount){
        balance=balance-amount;
    }
    else{
        throw new IllegalArgumentException("Invalid amount");
    }
}

public String toString(){
String bankAccountAsString = accountNumber;
String balanceAsString = String.valueOf(balance);
String allFieldsAsStrings = String.format ("Bank Account Number: " + bankAccountAsString+ ", Current Balance: " + balanceAsString);
return allFieldsAsStrings;
}
}
