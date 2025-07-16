class Solution {
    public int maximumLength(int[] nums) {
        int alt1 = getLength(nums, 0);
        int alt2 = getLength(nums, 1);
        int odd = 0, even = 0;
        for (int num : nums) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        return Math.max(Math.max(alt1, alt2), Math.max(odd, even));
    }

    private int getLength(int[] nums, int parity) {
        int len = 0;
        for (int num : nums) {
            if (num % 2 == parity) {
                len++;
                parity ^= 1;
            }
        }
        return len;
    }
}
