package L2TwoPointers;

public class Q167TwoSum2 {
    public int[] twoSum(int numbers[], int target) {
        int ans[] = new int[2];
        int n = numbers.length; 
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int numbers[] = { 2, 7, 11, 15 };

        int target = 9;

        Q167TwoSum2 obj = new Q167TwoSum2();

        int ans[] = obj.twoSum(numbers, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
