import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestTernaryOperator {

    @Test
    public void checkCountry() {
        List<String> acceptedCountries = new ArrayList<> ();
        acceptedCountries.add("Japan");
        TernaryOperator ternaryOperator = new TernaryOperator(acceptedCountries);
        assertEquals(ternaryOperator.checkCountry("Spain"), 2);
    }


}