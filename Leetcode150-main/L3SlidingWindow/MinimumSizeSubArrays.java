package L3SlidingWindow;

public class MinimumSizeSubArrays {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

        MinimumSizeSubArrays obj = new MinimumSizeSubArrays();

        int target = 7;

        int nums[] = { 2, 3, 1, 2, 4, 3 };

        System.out.println(obj.minSubArrayLen(target, nums));

    }
}
