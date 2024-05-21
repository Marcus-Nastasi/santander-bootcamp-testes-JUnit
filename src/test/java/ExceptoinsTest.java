import com.santander.testes.Exceptions.PeopleException;
import com.santander.testes.People;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptoinsTest {

    @Test
    void throwingPeopleErrors() {
        assertThrows(PeopleException.class, () -> {
           new People("Jhon", "01/01/200");
        });
    }
}


