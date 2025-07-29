class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] bitLastSeen = new int[30]; 
        for (int i = 0; i < 30; i++) {
            bitLastSeen[i] = -1;
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int b = 0; b < 30; b++) {
                if ((nums[i] & (1 << b)) != 0) {
                    bitLastSeen[b] = i;
                }
            }
            int maxIdx = i;
            for (int b = 0; b < 30; b++) {
                if (bitLastSeen[b] != -1) {
                    maxIdx = Math.max(maxIdx, bitLastSeen[b]);
                }
            }
            res[i] = maxIdx - i + 1;
        }
        return res;
    }
}
