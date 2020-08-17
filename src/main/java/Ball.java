import java.util.*;

class Ball {

    static int total(Object collection) {

        if (collection instanceof List) {
            return totalList((List<Integer>) collection);
        }

        // Do the right thing depending on whether 'collection' is a List or a Map

        if (collection instanceof Map) {
            return totalMap((Map<Object, Integer>) collection);
        }

        return 0;
    }

    static int totalMap(Map<Object, Integer> map) {
        int total = 0;
        for (Integer item : map.values()) {
            total += item;
        }
        return total;
    }

    static int totalList(List<Integer> list) {
        int total = 0;
        for (Integer item : list) {
            total += item;
        }
        return total;
    }

    public static void main(String[] args) {


        Map<Object, Integer> aMap = Map.of(
                "five", 5,
                "two", 2
        );

        List<Integer> aList = List.of(5, 8, 7);

        System.out.println("Total of the map is " + total(aMap));
        System.out.println("Total of the list is " + total((Object) aList));
    }
}

