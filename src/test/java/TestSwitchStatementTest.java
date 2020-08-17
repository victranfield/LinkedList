import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSwitchStatementTest {
    @org.junit.jupiter.api.Test
    void shouldShowProductRegion() {
        Product product = new Product();

        assertEquals("Switzerland", product.getRegion());
    }

}