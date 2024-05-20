import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ConditionTest {

    @Test
    void validateJustInUserMark() {
        assumeTrue("rolemberg".equals(System.getenv("USER")));
        assertEquals(10, 5+5);
    }
}


