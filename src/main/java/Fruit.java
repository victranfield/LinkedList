public class Fruit implements Food{
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final Fruit mango = new Fruit("Mango");
        mango.setName("Banana");
        mango.getName();
        System.out.println("mango = " + mango);
        mango.name = "fig";
        System.out.println("mango = " + mango);

    }

    @Override
    public boolean isTasty() {
        return false;
    }

//    public abstract int foodRating() {}
}
