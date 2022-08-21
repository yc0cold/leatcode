public class MergeTwoSortedLists {

    /**
     * Definition for singly-linked list.
     *
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode root = new ListNode();
        ListNode answer = root;

        while(list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;

            if(val1 <= val2){
                root.next = list1;
                list1 = list1.next;

            }else{
                root.next = list2;
                list2 = list2.next;
            }
            root = root.next;
        }

        if(list1 != null){
            root.next = list1;
        }

        if(list2 != null){
            root.next = list2;
        }

        return answer.next;
    }
}
