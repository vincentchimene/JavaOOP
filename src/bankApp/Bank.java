package bankApp;


import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;
    int count = 101;

    public Bank(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }
    public Account registerCustomer(String firstName, String lastName, String pin){
        String accountNumber = "" + count;
        Account customer = new Account(firstName, lastName, accountNumber, pin);
        this.accounts.add(customer);
        count++;
        return customer;
    }
    public int getSizeOfAccounts(){
        return accounts.size();

    }

    public Account findAccount(String accountNumber) {
        for(Account account : accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }throw new IllegalArgumentException("Account not found");
    }

    public void deposit(String accountNumber, int amount){
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public int checkBalance(String accountNumber, String pin){
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public void withdraw(String accountNumber, int amount, String pin){
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);

    }
}
