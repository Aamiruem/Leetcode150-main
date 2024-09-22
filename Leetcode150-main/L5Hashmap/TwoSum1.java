package L5Hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[] { i, numMap.get(complement) };
            }
        }

        return new int[] {}; // No solution found
    }
    public static void main(String[] args) {

        int[] nums = { 3, 2, 4 };
        int target = 6;

        TwoSum1 obj = new TwoSum1();
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices of two numbers that sum up to " + target + ": " + result[0] + " and " + result[1]);
        // Output: Indices of two numbers that sum up to 6: 1 and 2
        // The indices are 0-based, so the first number is at index 1 (0-based) and the second number is at index 2 (0-based)
    }
}
