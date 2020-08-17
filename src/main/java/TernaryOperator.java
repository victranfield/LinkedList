import java.util.List;

public class TernaryOperator {
    private final List<String> acceptedCountries;

    public TernaryOperator(List<String> acceptedCountries) {
        this.acceptedCountries = acceptedCountries;
    }


    public int checkCountry(String country) {
        acceptedCountries.add("Japan");
        return acceptedCountries.get(0).equals(country) ? removeCountry() : acceptedCountries.size();

    }

    private int removeCountry() {
        acceptedCountries.remove(0);
        return acceptedCountries.size();
    }

}
