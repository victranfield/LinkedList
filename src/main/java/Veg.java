public class Veg implements Food{
    private String name;

    public Veg(String name) {
        this.name = name;
    }



    @Override
    public boolean isTasty() {
        return true;
    }
}
