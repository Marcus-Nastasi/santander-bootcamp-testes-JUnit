import com.santander.testes.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeopleTest {

    @Test
    void isAgeMajor() {
        People people = new People("Jon", 22);
        Assertions.assertTrue(people.isMajor());
    }

    @Test
    void isMinor() {
        People people1 = new People("Mary", 16);
        Assertions.assertFalse(people1.isMajor());
    }
}


