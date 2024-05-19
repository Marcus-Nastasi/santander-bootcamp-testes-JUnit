import com.santander.testes.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeopleTest {

    @Test
    void returnAgeOnInteger() {
        try {
            People people = new People("Jessica", "19/05/2000");
            Assertions.assertEquals(24, people.getAge());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


