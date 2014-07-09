package leetcode;

public class PartitionList {
	
	public static void main(String[] args) {
		ListNode input1 = new ListNode(2);
		ListNode input2 = new ListNode(1);
		input1.next = input2;
		ListNode output = partition(input1, 2);
		System.out.println(output.val);
	}
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	}
	
	public static ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode sTail = new ListNode(0);
        ListNode small = sTail;
        ListNode lTail = new ListNode(0);
        ListNode large = lTail;
        while (head != null) {
            if (head.val < x) {
                sTail.next = head;
                sTail = sTail.next;
            } else {
                lTail.next = head;
                lTail = lTail.next;
            }
            head = head.next;
        }
        sTail.next = large.next;
        return small.next;
    }
}
