package L1ArrayString;

// import java.util.*;
public class Q55CanJumpGames {
    public boolean canJump(int nums[]) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
    public static void main(String[] args) {
        Q55CanJumpGames obj = new Q55CanJumpGames();
        int nums[] = { 3, 2, 1, 0, 4 };
        System.out.println(obj.canJump(nums));
        // Output: true

        int nums2[] = { 0 };
        System.out.println(obj.canJump(nums2)); // Output: false

        int nums3[] = { 2, 0, 0 };
        System.out.println(obj.canJump(nums3)); // Output: true
    }
}
