public class Address {
    private final int addressNumber;
    private final String addressStreet;
    private final String addressStreet2;
    private final String addressPostcode;
    private final String addressCountry;

    private Address(int addressNumber, String addressStreet, String addressStreet2, String addressPostcode, String addressCountry) {
        this.addressNumber = addressNumber;
        this.addressStreet = addressStreet;
        this.addressStreet2 = addressStreet2;
        this.addressPostcode = addressPostcode;
        this.addressCountry = addressCountry;
    }

    public static Address address(int addressNumber, String addressStreet, String addressStreet2, String addressPostcode, String addressCountry) {
        return new Address(addressNumber, addressStreet, addressStreet2, addressPostcode, addressCountry);
    }

    public static Address myAddress() {
        return new Address(19, "Brown", "Road", "OA1 685", "America");
    }

    public static void main(String[] args) {
        Address a = Address.address(19, "Brown", "Road", "OA1 685", "America");
        Address two = Address.myAddress();
    }

    public Region countryRegion() {
        Region r = null;
        if (this.addressCountry == "Canada") {
            r = Region.NA;
        }
        else if (this.addressCountry == "France") {
            r = Region.EUR;
        }
        else if (this.addressCountry == "California") {
            r = Region.USA;
        }
        else {
            r = Region.UNKNOWN;
        }
        return r;
    }
}

