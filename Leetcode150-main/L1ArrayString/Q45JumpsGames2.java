package L1ArrayString;

public class Q45JumpsGames2 {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;

        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;        
    }
    public static void main(String[] args) {
        Q45JumpsGames2 obj = new Q45JumpsGames2();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(obj.jump(nums));

        int[] nums2 = { 2, 3, 0, 1, 4 };
        System.out.println(obj.jump(nums2));
    }
}
