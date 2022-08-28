public class MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode temp1 = new ListNode();
        temp1 = head;

        int count = 0;
        int target = 0;

        // count the length of LinkedList
        while(temp1 != null){
            temp1 = temp1.next;
            count += 1;
        }

        target = count/2+1;

        for(int i=1; i<target+1; i++){
            if(target-i==0){
                return head;
            }
            head = head.next;
        }

        return null;
    }
}


