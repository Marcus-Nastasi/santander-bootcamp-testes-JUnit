import com.santander.testes.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeopleTest {

    @Test
    void isAgeMajor() {
        People people = new People("Jon", 22);
        Assertions.assertTrue(people.isMajor());
    }
}


