import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        final Map<String, BigDecimal> myMap = new HashMap<>();
        myMap.put("Apple", BigDecimal.ONE);
        myMap.put("Bananas", BigDecimal.valueOf(0.000000156));
        final BigDecimal applesValues = myMap.get("Bananas");
        System.out.println("applesValues = " + applesValues.toEngineeringString());
        Map<String, BigDecimal> secondMap = Map.of("Apple", BigDecimal.ONE, "Bananas", BigDecimal.valueOf(0.095));
        secondMap.put("Pears", BigDecimal.ONE);
        final String fruit = "Oranges";
//        fruit = "Mango";
    }
}
