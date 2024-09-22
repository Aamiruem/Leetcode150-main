package L6Intervals;

import java.util.ArrayList;
import java.util.List;
public class SummaryRanges228 {

    public List<String> summaryRanges(int[] nums) {

        List<String> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (nums.length == 0) {
            return ls;
        }

        int left = 0;
        int right = 0;
        while (right + 1 < nums.length) {

            if (nums[right] + 1 != nums[right + 1]) {

                if (right == left) {
                    sb.append(nums[right]);
                } else {
                    sb.append(nums[left]).append("->").append(nums[right]);
                }
                ls.add(sb.toString());
                sb.setLength(0);
                left = right + 1;
            }
            right++;
        }
        if (right == left) {
            sb.append(nums[right]);
        } else {
            sb.append(nums[left]).append("->").append(nums[right]);
        }
        ls.add(sb.toString());
        return ls;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 5, 7};
        SummaryRanges228 obj = new SummaryRanges228();
        System.out.println(obj.summaryRanges(nums));
        // Output: ["0","1","2","4->5","7"]

        nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        System.out.println(obj.summaryRanges(nums));
        // Output: ["0","2->4","6","8->9"]

        nums = new int[]{0};
        System.out.println(obj.summaryRanges(nums));
        // Output: ["0"]
    }
}
