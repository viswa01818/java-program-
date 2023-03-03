package JAVAEASYEG;
import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i : array) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }

        System.out.println("Element\tFrequency");
        for (int i : frequency.keySet()) {
            System.out.println(i + "\t\t" + frequency.get(i));
        }
    }
}