//Algo Used: Bucket Sort (Counting frequencies)
// SC: O N, TC: O 1
package L1ArrayString;

public class Q274HIndex {

    public int hIndex(int[] citations) {
        int n = citations.length;
        int bucket[] = new int[n + 1]; // storing the elements which are beyond the size of n in the n+1 extra space, bcz that can't be our h-idex
        for (int i = 0; i < n; i++) {
            int val = citations[i];
            if (val < n) { // if beyond size og arr then move it to last ind
                bucket[val]++;
            } else {
                bucket[n]++; // else count the freq
            }
        }
        int count = 0;
        for (int i = n; i >= 0; i--) { // from right side taking the first valid h-index which will be max as taking from right
            count += bucket[i];
            if (i <= count) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Q274HIndex obj = new Q274HIndex();
        int[] citations = { 0, 1, 3, 5, 6 };
        System.out.println(obj.hIndex(citations));

        int[] citations2 = { 0 };
        System.out.println(obj.hIndex(citations2));
    }
}
