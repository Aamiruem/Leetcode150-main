package L1ArrayString;

import java.util.Arrays;
public class Q169MajorityElements {
    public static int majorityElement(int nums[]) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 4, 4, 4, 5};
        System.out.println(majorityElement(nums)); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2, 1, 1};
        System.out.println(majorityElement(nums2)); // Output: 2
    }
}
