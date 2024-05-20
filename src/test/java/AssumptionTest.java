import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AssumptionTest {

    @Test
    void validateJustInUserMark() {
        assumeTrue("rolemberg".equals(System.getenv("USER")));
        assertEquals(10, 5+5);
    }
}


