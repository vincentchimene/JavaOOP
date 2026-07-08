package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    Bank myBank;
    @BeforeEach
    public void setup(){
        myBank = new Bank("VinBank");
    }

    @Test
    public void testThatAfterCreationOfMyBank_AccountListIsZero(){
        assertEquals(0, myBank.getSizeOfAccounts());
    }

    @Test
    public void testThatIAddOneCustomerAccount_SizeOfAccountsIncreaceByOne(){
        myBank.registerCustomer("Bobby", "Opurum", "123098");
        assertEquals(1, myBank.getSizeOfAccounts());
    }

    @Test
    public void testThatIRegisterTwoCustomerAccounts_SizeOfAccountsIncreaseByTwo(){
        myBank.registerCustomer("Bobby", "Opurum", "123098");
        myBank.registerCustomer("Barbie", "Opurum", "123890");
        assertEquals(2, myBank.getSizeOfAccounts());
    }

    @Test
    public void testThatIFindARegisteredAccountAndFoundIt(){
       Account customer1 = myBank.registerCustomer("Bobby", "Opurum", "123098");

       Account customer2 = myBank.registerCustomer("Barbie", "Opurum", "123890");
       assertEquals(customer1, myBank.findAccount(customer1.getAccountNumber()));
    }

    @Test
    public void testThatIDeposit5000ToAccount1_Account1BalanceBecomes5000(){
        Account customer1 = myBank.registerCustomer("Bobby", "Opurum", "123098");
        myBank.deposit(customer1.getAccountNumber(), 5000);
        assertEquals(5000, myBank.checkBalance(customer1.getAccountNumber(), "123098"));
    }

    @Test
    public void testThatIDeposit5000ToAccount1And2000ToAccount1_Account1BalanceBecomes7000(){
        Account customer1 = myBank.registerCustomer("Bobby", "Opurum", "123098");
        myBank.deposit(customer1.getAccountNumber(), 5000);
        myBank.deposit(customer1.getAccountNumber(), 2000);
        assertEquals(7000, myBank.checkBalance(customer1.getAccountNumber(), "123098"));
    }

    @Test
    public void testThatIWithdraw5000FromAccount1AfterDepositing12000_BalanceBecomes7000(){
        Account customer1 = myBank.registerCustomer("Bobby", "Opurum", "123098");
        myBank.deposit(customer1.getAccountNumber(), 12000);
        myBank.withdraw(customer1.getAccountNumber(), 5000, "123098");


    }

}
