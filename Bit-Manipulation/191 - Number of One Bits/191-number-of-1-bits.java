public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0, mask = 1;
		for(int i = 0; i < 32; i++) {
			if((n & mask) != 0) {
				ones++;
			}
			mask <<= 1;
		}
		return ones;
    }
}