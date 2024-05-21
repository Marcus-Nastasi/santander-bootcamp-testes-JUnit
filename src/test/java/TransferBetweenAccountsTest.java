import com.santander.testes.Domain.Account;
import com.santander.testes.Domain.TransferBetweenAccounts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransferBetweenAccountsTest {

    @Test
    void transferingSuccessfuly() {
        Account ac1 = new Account(1111, 1001, 100.00);
        Account ac2 = new Account(1222, 1001, 200.00);
        TransferBetweenAccounts t = new TransferBetweenAccounts(100, ac1, ac2);
        assertDoesNotThrow(() -> t.transfer(100));
    }
}


