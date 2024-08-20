package Leetcode;
import java.util.HashSet;
import java.util.Set;
class contains_Duplicate { 

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (!s.add(num)) {
                return true;
            }
        }
        return false;
    }
    
}
