// package L1Easy;
// public class Q88MergeSortedArrays{

//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] merged = new int[m + n];
//         int i = 0, j = 0, k = 0;    
        
//         // Merge the two sorted arrays into merged[]
//         while (i < m && j < n) {
//             if (nums1[i] <= nums2[j]) {
//                 merged[k++] = nums1[i++];
//             } else {
//                 merged[k++] = nums2[j++];
//             }
//         }
        
//         // Copy any remaining elements from nums1[] or nums2[]
//         while (i < m) {
//             merged[k++] = nums1[i++];
//         }
        
//         while (j < n) {
//             merged[k++] = nums2[j++];
//         }
        
//         // Copy the merged[] array back into nums1[]
//         for (i = 0; i < m + n; i++) {
//             nums1[i] = merged[i];
//         }
//     } 
//     public static void main(String[] args) {

//         int[] nums1 = {1,2,3,0,0,0};
//         int m = 3;
//         int[] nums2 = {2,5,6};
//         int n = 3;
        
//         Q88MergeSortedArray obj = new Q88MergeSortedArray();
//         obj.merge(nums1, m, nums2, n);
        
//         // Print the merged array
//         System.out.println("Merged array:");
//         for (int num : nums1) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }  
// }







package L1ArrayString;
import java.util.Arrays;
public class Q88MergeSortedArrays{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0, i = m; j< n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        // Sort the merged array after each insertion
        Arrays.sort(nums1);
        // Print the merged array
        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        
        Q88MergeSortedArrays obj = new Q88MergeSortedArrays();
        obj.merge(nums1, m, nums2, n);
        
    }
}
