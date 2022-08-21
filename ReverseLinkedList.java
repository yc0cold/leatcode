public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     * LeetCode #206
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseList(ListNode head) {
        ListNode current = new ListNode();
        ListNode prev = null;

        while(head != null){
            current = head;
            head = head.next;
            current.next = prev;
            prev = current;
        }

        return prev;
    }

}
