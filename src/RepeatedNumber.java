import java.util.HashMap;
import java.util.Map;

public class RepeatedNumber {

    public void repeatNumber(int[] arr) {
        Map<Integer, Integer> nums = new HashMap<>();

        for (int n : arr) {
            if (nums.containsKey(n)) {
                int count = nums.get(n);
                nums.put(n, count + 1);

            } else {
                nums.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> sd : nums.entrySet()) {
            System.out.println(sd.getKey() + " ededi " + sd.getValue() + "defe tekrarlanib");
        }
    }
}
