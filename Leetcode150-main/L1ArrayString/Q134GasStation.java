package L1ArrayString;

public class Q134GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += gas[i];
            sum2 += cost[i];
        }
        if (sum1 < sum2) {
            return -1;
        }
        int remaining_fuel = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            remaining_fuel += gas[i] - cost[i];
            if (remaining_fuel < 0) {
                ans = i + 1;
                remaining_fuel = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Q134GasStation obj = new Q134GasStation();
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        System.out.println(obj.canCompleteCircuit(gas, cost));
    }
}
