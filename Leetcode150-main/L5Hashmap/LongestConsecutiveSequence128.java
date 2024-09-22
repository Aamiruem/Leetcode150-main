package L5Hashmap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int length = 1;

                while (numSet.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };
        LongestConsecutiveSequence128 solution = new LongestConsecutiveSequence128();
        System.out.println(solution.longestConsecutive(nums)); // Output: 4
        // Test case 2
        int[] nums2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(solution.longestConsecutive(nums2)); // Output: 9
        // Test case 3
        int[] nums3 = { -1, 0, 1, 2, 3, 100 };
        System.out.println(solution.longestConsecutive(nums3)); // Output: 4
    }
}
