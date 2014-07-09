package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class AddNumbers {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode l = new ListNode(0);
        ListNode result = l;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = 0;
            int y = 0;
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            if (x + y + carry < 10) {
                l.next = new ListNode(0);
                l = l.next;
                l.val = x + y + carry;
                carry = 0;
            } else {
                l.next = new ListNode(0);
                l = l.next;
                l.val = x + y + carry - 10;
                carry = 1;
            }
        }
        return result.next;
    }
}
