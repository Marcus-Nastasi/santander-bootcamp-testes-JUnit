import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChoosingOrderTest {

    @Order(3)
    @Test
    void testOne() {
        assertTrue(true);
    }

    @Order(2)
    @Test
    void testTwo() {
        assertFalse(false);
    }

    @Order(1)
    @Test
    void testThree() {
        assertEquals(10, 6+4);
    }
}



