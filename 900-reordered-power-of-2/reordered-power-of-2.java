import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        String sortedN = sortDigits(n);
        for (int i = 0; i < 31; i++) {
            int powerOfTwo = 1 << i;
            if (sortedN.equals(sortDigits(powerOfTwo))) {
                return true;
            }
        }
        return false;
    }
    private String sortDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}
