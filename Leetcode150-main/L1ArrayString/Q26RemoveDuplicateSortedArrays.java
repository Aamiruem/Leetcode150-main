package L1ArrayString;

// import java.util.*;
public class Q26RemoveDuplicateSortedArrays {
    public static int removeDuplicate(int nums[]){
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!= nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        return j;

    }
    public static String toString(int[] nums1, int i, int len1) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int k = i; k < i + len1; k++){
            sb.append(nums1[k]);
            if(k < i + len1 - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        int nums1[] = {0,0,1,1,1,2,2,3,3,4};
        int nums2[] = {1,1,1,2,2,3,3,3,4,4,4,5};
        
        int len1 = removeDuplicate(nums1);
        int len2 = removeDuplicate(nums2);
        
        System.out.println("Length of the first array after removing duplicates: " + len1);
        System.out.println("Length of the second array after removing duplicates: " + len2);
        
        System.out.println("First array after removing duplicates: " + toString(nums1, 0, len1));
        System.out.println("Second array after removing duplicates: " + toString(nums2, 0, len2));
    }
}
