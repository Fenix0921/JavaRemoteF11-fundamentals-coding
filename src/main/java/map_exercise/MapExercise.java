package map_exercise;

import model.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExercise {

    public static void main(String[] args) {
        //unordered - but fast
        Map<String, Integer> namesOverAges = new HashMap<>();
        namesOverAges.put("Mariusz", 40);

        //ordered
        Map<String, Integer> namesOverAges2 = new LinkedHashMap<>();

        //sorted based on keys - natural order, can be changed by comparator
        Map<String, Integer> namesOverAges3 = new TreeMap<>();
        Map<Person, Integer> personOverAge = new TreeMap<>(((o1, o2) -> o1.getSurname().compareTo((o2.getSurname()))));
        var person = new Person ("N", "P", 40);
        personOverAge.put(person, 40);

        Map<String, Integer> namesOverAges4 =Map.of(
                "Mariusz", 1,
                "John", 18
        );

        //maps created with "of" are imutable
        // namesOverAges4.put("erik", 15);

        // map iteration - old way
        for (String key : namesOverAges4.keySet()) {
            System.out.println("Key is: %s, value is: %d".formatted(key, namesOverAges4.get(key)));
        }

        namesOverAges4.forEach((key, value) ->System.out.println("Key is: %d".formatted(key,value)));
        namesOverAges4.forEach(key, value) );
    }
}
