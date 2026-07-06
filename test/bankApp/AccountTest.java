package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account myAccount;

    @BeforeEach
    public void setUp(){
        String correctPassword = "123098";
        myAccount = new Account(correctPassword);
    }

    @Test
    public void testThatAtStartAccountBalanceIsZero(){
        assertEquals(0, myAccount.checkBalance("123098"));
    }

    @Test
    public void depositAmountIs2500_balanceIs2000Test(){
        myAccount.deposit(2500);
        assertEquals(2500, myAccount.checkBalance("123098"));
    }

    @Test
    public void depositTwiceWith1000And500_balanceIs1500Test(){
        myAccount.deposit(1000);
        myAccount.deposit(500);
        assertEquals(1500, myAccount.checkBalance("123098"));
    }

    @Test
    public void depositMinus1000_balanceRemains0Test(){
        assertThrows(IllegalArgumentException.class, ()-> myAccount.deposit(-1000));
        assertEquals(0, myAccount.checkBalance("123098"));
    }

    @Test
    public void depositAmountIs5000_withdrawalAmountIs2000_balanceBecomes3000Test(){
        myAccount.deposit(5000);
        myAccount.withdraw(2000,"123098");
        assertEquals(3000, myAccount.checkBalance("123098"));
    }

    @Test
    public void balanceIs0_withdrawalAmounts2000_throwsErrorMessageAndBalanceRemains0Test(){
        assertThrows(IllegalArgumentException.class, ()-> myAccount.withdraw(2000,"123098"));
        assertEquals(0, myAccount.checkBalance("123098"));
    }

    @Test
    public void balanceIs0_withdrawalAmountIsMinus800_throwsErrorMessageAndBalanceRemains0Test(){
        assertThrows(IllegalArgumentException.class, ()-> myAccount.withdraw(-800,"123098"));
        assertEquals(0, myAccount.checkBalance("123098"));

    }

    @Test
    public void deposit10000_withdraw3500_balanceIs6500Test(){
        myAccount.deposit(10000);
        myAccount.withdraw(3500, "123098");
        assertEquals(6500, myAccount.checkBalance("123098"));
    }

    @Test
    public void deposit3000_whenAccountInputsTheWrongPinToWithdraw2000_throwAnErrorMessageTestAndBalanceRemains3000(){
        myAccount.deposit(3000);

        assertThrows(IllegalArgumentException.class, ()-> myAccount.withdraw(2000, "1456789"));
        assertEquals(3000, myAccount.checkBalance("123098"));
    }

}
