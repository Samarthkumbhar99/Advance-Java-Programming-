
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // 1. HashMap
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Mango");

        System.out.println("HashMap: " + hm);

        hm.remove(2); // Remove element

        System.out.println("After Remove: " + hm);

        System.out.println("Iterating HashMap:");
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // 2. LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(3, "Mango");
        lhm.put(1, "Apple");
        lhm.put(2, "Banana");

        System.out.println("\nLinkedHashMap: " + lhm);

        lhm.remove(1);

        System.out.println("After Remove: " + lhm);

        // 3. TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "Mango");
        tm.put(1, "Apple");
        tm.put(2, "Banana");

        System.out.println("\nTreeMap: " + tm);

        tm.remove(2);

        System.out.println("After Remove: " + tm);

        System.out.println("Sorted TreeMap:");
        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // 4. Find Duplicate Elements using HashMap
        List<Integer> list = Arrays.asList(10, 20, 30, 10, 20, 40, 10);

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : list) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        System.out.println("\nDuplicate Elements:");

        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " occurs "
                        + e.getValue() + " times");
            }
        }
    }
}
