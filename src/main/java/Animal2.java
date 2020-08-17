import org.w3c.dom.ls.LSOutput;

public class Animal2 {

    public Number getName() {
        return 5;
    }
}

public class Gorilla extends Animal2 {
    public Integer getName() {
        return 2;
    }
}

public class Zookeeper {
    public static void main(String[] args) {
        Animal2 animal2 = new Gorilla();
        System.out.println(animal2.getName());
    }

String start = "Animal3";
    String trimmed = start.trim();
    String lowercase = trimmed.toLowerCase();

 String a = "abc";
 String b = a.toUpperCase();
 b = b.replace("B", "2").replace("C", "3");
 System.out.println("a=" + a);
 System.out.println("b=" + b);


}


