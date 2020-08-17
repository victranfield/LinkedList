public abstract class Animal {
    public abstract String speak();

}

class Dog extends Animal {

    @Override
    public String speak() {
        return  "Woof";
    }

    public void chew(){

    }
}

class Cat extends Animal {

    @Override
    public String speak() {
        return  "Meow";
    }

    public void sleep() {

    }
}

class Main {
    public static void main(String[] args) {
        final Dog dog = new Dog();
        dog.chew();
        final Animal wildDog = new Dog();
        wildDog.speak();

    }
}