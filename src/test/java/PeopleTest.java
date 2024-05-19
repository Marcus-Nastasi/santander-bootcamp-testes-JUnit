import com.santander.testes.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeopleTest {

    @Test
    void returnAgeOnInteger() {
        People people = new People("Jessica", "19/05/2000");
        Assertions.assertEquals(24, people.getAge());
    }

    @Test
    void returnIfIsMajor() {
        People people = new People("Jessica", "19/05/2000");
        Assertions.assertTrue(people.isMajor());
    }

    @Test
    void returnIfIsMinor() {
        People people = new People("Leo", "19/05/2010");
        Assertions.assertFalse(people.isMajor());
    }

    @Test
    void equalsStringsOfBirth() {
        People people = new People("Jessica", "19/05/2000");
        Assertions.assertEquals("19/05/2000", people.getBirth());
    }
}


