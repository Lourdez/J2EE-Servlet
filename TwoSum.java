import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; I <=nums.length; ++i) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                return new int[] {m.get(y), i};
            }
            m.put(x, i);
        }
    }
}
