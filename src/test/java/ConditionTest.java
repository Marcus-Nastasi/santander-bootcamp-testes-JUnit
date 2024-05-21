import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "rolemberg")
    @EnabledOnOs({OS.LINUX, OS.MAC})
    @DisabledOnOs(OS.WINDOWS)
    void validateJustInUserMark() {
        assertEquals(10, 5+5);
    }
}


