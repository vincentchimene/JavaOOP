package bankApp;

public class Account {
    private int balance;
    private  final String password;

    public Account(String password){
        this.password = password;}

    private void checkPassword(String inputtedPassword) {
        if (!this.password.equals(inputtedPassword)) {
            throw new IllegalArgumentException("Invalid Password");
        }
    }

    public int checkBalance(String inputtedPassword){
            checkPassword(inputtedPassword);
            return this.balance;
    }

    public void checkWithdrawalAmount(int amount){
        if(amount < 50){
            throw new IllegalArgumentException("Amount must be 50 or above");
        }
        else if(amount > this.balance){
            throw new IllegalArgumentException("Insuffcient balance");
        }
    }

    public void deposit(int amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
            this.balance += amount;
        }


    public void withdraw(int amount, String inputtedPassword) {
        checkPassword(inputtedPassword);
        checkWithdrawalAmount(amount);
        this.balance -= amount;
        }



    }