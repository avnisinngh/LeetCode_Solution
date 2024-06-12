import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int n : nums) {
            if (n == 0) zero++;
            else if (n == 1) one++;
            else if (n == 2) two++;
        }
        int i = 0;
        while (zero-- > 0) nums[i++] = 0;
        while (one-- > 0) nums[i++] = 1;
        while (two-- > 0) nums[i++] = 2;
    }
}
