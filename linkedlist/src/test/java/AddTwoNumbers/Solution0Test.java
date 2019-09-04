package AddTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author boyiren
 * @date 2019-09-04
 */
public class Solution0Test {

    @Test
    public void test0() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution0 solution0 = new Solution0();
        ListNode node = solution0.addTwoNumbers(l1, l2);
        Assert.assertEquals(node.val, 7);
        Assert.assertEquals(node.next.val, 0);
        Assert.assertEquals(node.next.next.val, 8);
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(9);

        Solution0 solution0 = new Solution0();
        ListNode node = solution0.addTwoNumbers(l1, l2);
        Assert.assertEquals(node.val, 9);
        Assert.assertEquals(node.next.val, 9);
        Assert.assertEquals(node.next.next.val, 9);
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        Solution0 solution0 = new Solution0();
        ListNode node = solution0.addTwoNumbers(l1, l2);
        Assert.assertEquals(node.val, 8);
        Assert.assertEquals(node.next.val, 9);
        Assert.assertEquals(node.next.next.val, 0);
        Assert.assertEquals(node.next.next.next.val, 1);
    }
}