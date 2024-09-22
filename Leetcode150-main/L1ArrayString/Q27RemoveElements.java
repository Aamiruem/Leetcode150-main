// package L1Easy;
// public class Q27RemoveElements {
//     public static void removeElement(int[] nums, int val){
//         int i = 0;
//         for(int j = 0; j < nums.length; j++){
//             if(nums[j]!= val){
//                 nums[i] = nums[j];
//                 i++;
//             }
//         }
//         for(int k = i; k < nums.length; k++){
//             nums[k] = 0;
//         }
//     }
// }



package L1ArrayString;

public class Q27RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        // int[] nums = {3, 2, 2, 3};
        // int val = 3;
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(nums, val);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
