/**
 * two sum
 *
 * @author boyiren
 * @date 2019-09-03
 */
class TwoSum {
    static class Solution1 {
        int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            if (nums.length < 2) {
                return result;
            }
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
            return result;
        }
    }
}
