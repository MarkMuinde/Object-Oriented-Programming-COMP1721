import java.util.*;

public class BankAccount{
private String accountNumber;
private int balance;

public BankAccount (){
    this.accountNumber = accountNumber;
    this.balance = balance;
}

public BankAccount(String num){
    accountNumber = num;
}

public BankAccount(String num, int bal){
    accountNumber = num;
    balance = bal;
}

public String getAccountNumber(){
    return accountNumber;
}

public int getBalance(){
    return balance;
}

public boolean deposit (int amount){
    if(amount>0){
        balance=balance + amount;
        return true;
    }
return false;
}

public boolean withdraw (int amount){
    if(amount > 0 & balance >= amount){
        balance=balance-amount;
        return true;
    }
return false;
}
}


