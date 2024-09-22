// package L1ArrayString;
// public class Q80RemoveDuplicateSortedArray2 {
//     public int removeDuplicates(int[] nums) {
//         int j = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (j == 1 || nums[i] != nums[j - 2]) {
//                 nums[j++] = nums[i];
//             }
//         }
//         return j;
//     }
//     public static void main(String[] args) {
//         Q80RemoveDuplicateSortedArray2 solution = new Q80RemoveDuplicateSortedArray2();
//         int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//         int len = solution.removeDuplicates(nums);
//         for (int i = 0; i < len; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


package L1ArrayString;

public class Q80RemoveDuplicateSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int j = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }

    public static void main(String[] args) {
        Q80RemoveDuplicateSortedArray2 solution = new Q80RemoveDuplicateSortedArray2();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int len = solution.removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
