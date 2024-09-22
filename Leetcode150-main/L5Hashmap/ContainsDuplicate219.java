//Algo Used: Hashing
// TC: O N , SC: O N
package L5Hashmap;

import java.util.HashMap;

public class ContainsDuplicate219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Initialize a HashMap to store the last index of each element.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate over each element in the array.
        for (int i = 0; i < nums.length; i++) {
            // If the current element is found in the map and satisfies the condition.
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                return true; // Found the pair.
            }
            // Update the current element's index in the map.
            map.put(nums[i], i);
        }

        // No such pair found, return false.
        return false;
    }
    public static void main(String[] args) {

        int[] nums = { 1, 0, 1, 1 };
        int k = 1;
        ContainsDuplicate219 obj = new ContainsDuplicate219();
        System.out.println(obj.containsNearbyDuplicate(nums, k)); // Output: true
        nums = new int[] { 1, 2, 3, 1 };
        k = 3;
        System.out.println(obj.containsNearbyDuplicate(nums, k)); // Output: true
        nums = new int[] { 1, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        k = 21;
        System.out.println(obj.containsNearbyDuplicate(nums, k)); // Output: true

        nums = new int[] { 1, 2, 3, 1, 2, 3 };
        k = 2;
        System.out.println(obj.containsNearbyDuplicate(nums, k)); // Output: false
    }
}

    
