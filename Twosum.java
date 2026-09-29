import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        // Key: The number, Value: Its index in the array
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists, we found our pair!
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Otherwise, save the current number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }
}
