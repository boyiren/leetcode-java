package AddTwoNumbers;

/**
 * add two sum
 *
 * @author boyiren
 * @date 2019-09-04
 */
public class Solution0 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode pointer = node;
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum /= 10;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            pointer.next = new ListNode(sum%10);
            pointer = pointer.next;
        }
        if (sum/10 != 0) {
            pointer.next = new ListNode(1);
        }
        return node.next;
    }
}
