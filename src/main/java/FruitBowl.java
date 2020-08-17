public class FruitBowl {
    private final Food food;

    public FruitBowl(Food food) {
        this.food = food;
    }

    public void blah() {
        food.isTasty();
    }

    public static void main(String[] args) {
        final FruitBowl fruitBowl = new FruitBowl(new Fruit("apple"));
        fruitBowl.blah();

        final FruitBowl vegBowl = new FruitBowl(new Veg("beans"));
        vegBowl.blah();

    }
}
