import org.junit.Assert;
import org.junit.Test;

/**
 * two sum test
 *
 * @author boyiren
 * @date 2019-09-03
 */
public class TwoSumTest {
    @Test
    public void test0() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answer = {0, 1};
        TwoSum.Solution1 solution1 = new TwoSum.Solution1();
        int[] result = solution1.twoSum(nums, target);
        Assert.assertArrayEquals(result, answer);
    }

    @Test
    public void test1() {
        int[] nums = {5, 5, 5, 5};
        int target = 10;
        int[] answer = {0, 1};
        TwoSum.Solution1 solution1 = new TwoSum.Solution1();
        int[] result = solution1.twoSum(nums, target);
        Assert.assertArrayEquals(result, answer);
    }

    @Test
    public void test2() {
        int[] nums = {0, 0, 0, 0};
        int target = 10;
        int[] answer = new int[2];
        TwoSum.Solution1 solution1 = new TwoSum.Solution1();
        int[] result = solution1.twoSum(nums, target);
        Assert.assertArrayEquals(result, answer);
    }

    @Test
    public void test3() {
        int[] nums = {4, 7, 6, 6};
        int target = 10;
        int[] answer = {0, 2};
        TwoSum.Solution1 solution1 = new TwoSum.Solution1();
        int[] result = solution1.twoSum(nums, target);
        Assert.assertArrayEquals(result, answer);
    }
}
