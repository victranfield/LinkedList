import java.security.PrivilegedAction;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CodingPractice {

    public static void main(String[] args) {
        LinkedList <String> object = new LinkedList();

        // Adding elements to the linked list
        object.add("A");
        object.add("B");
        object.add("C");
        object.add("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        object.get(3);
        System.out.println("Linked list : " + object);
        object.forEach(System.out::println);

        Supplier<String> hSupplier = () -> "h";
        String h = hSupplier.get();

        List <String> myResult = object.stream().map(x -> x + "H").collect(Collectors.toList());

        System.out.println(myResult);
    }


}
