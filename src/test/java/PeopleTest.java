import com.santander.testes.People;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PeopleTest {

    @Test
    void returnAgeOnInteger() {
        People people = new People("Jessica", "19/05/2000");
        assertEquals(24, people.getAge());
    }

    @Test
    void returnIfIsMajor() {
        People people = new People("Jessica", "19/05/2000");
        assertTrue(people.isMajor());
    }

    @Test
    void returnIfIsMinor() {
        People people = new People("Leo", "19/05/2010");
        assertFalse(people.isMajor());
    }

    @Test
    void equalsStringsOfBirth() {
        People people = new People("Jessica", "19/05/2000");
        assertEquals("19/05/2000", people.getBirth());
    }

    @Test
    void toStringTest() {
        People people = new People("Mark", "26/10/2001");
        assertEquals("People{name='Mark', birth=2001-10-26, age=22}", people.toString());
    }
}


