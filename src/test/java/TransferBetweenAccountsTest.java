import com.santander.testes.Domain.Account;
import com.santander.testes.Domain.TransferBetweenAccounts;
import com.santander.testes.Exceptions.AccountException;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TransferBetweenAccountsTest {

    @Order(1)
    @Test
    void transferringSuccessfully() {
        Account ac1 = new Account(1111, 1001, 100.00);
        Account ac2 = new Account(1222, 1001, 200.00);
        TransferBetweenAccounts t = new TransferBetweenAccounts(ac1, ac2);
        assertDoesNotThrow(() -> t.transfer(100));
    }

    @Order(2)
    @Test
    void transferringNotSuccessfully() {
        Account ac1 = new Account(1111, 1001, 100.00);
        Account ac2 = new Account(1222, 1001, 200.00);
        TransferBetweenAccounts t = new TransferBetweenAccounts(ac1, ac2);
        assertThrows(AccountException.class, () -> t.transfer(0));
    }

    @Order(3)
    @Test
    void transferAccountDoesNotHaveSufficientAmount() {
        Account ac1 = new Account(1111, 1001, 100.00);
        Account ac2 = new Account(1222, 1001, 200.00);
        TransferBetweenAccounts t = new TransferBetweenAccounts(ac1, ac2);
        assertThrows(AccountException.class, () -> t.transfer(200));
    }
}


