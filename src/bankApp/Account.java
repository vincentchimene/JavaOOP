package bankApp;

public class Account {
    private int balance;
    private final String pin;
    private String name;
    private String number;


    public Account(String firstName, String lastName, String accountNumber, String pin){
        this.name = firstName + " " + lastName;
        this.number = accountNumber;
        this.pin = pin;
    }

    private void checkPin(String inputtedPin) {
        if (!this.pin.equals(inputtedPin)) {
            throw new IllegalArgumentException("Invalid Pin");
        }
    }

    public int checkBalance(String inputtedPin){
            checkPin(inputtedPin);
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


    public void withdraw(int amount, String inputtedPin) {
        checkPin(inputtedPin);
        checkWithdrawalAmount(amount);
        this.balance -= amount;
        }

    public String getAccountNumber(){
        return number;
    }



    }