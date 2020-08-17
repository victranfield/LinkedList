public class ImmutableFruit {
    private final String name;

    public ImmutableFruit(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final ImmutableFruit mango = new ImmutableFruit("Mango");
//        mango.setName("Banana");
        mango.getName();
        System.out.println("mango = " + mango);

    }
}
