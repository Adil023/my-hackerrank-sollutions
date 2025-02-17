package LeetcodeSollutions;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
         if(head == null || head.next ==null) return head;

         ListNode listNode = head;
         while(listNode.next != null){
             if(listNode.val == listNode.next.val){ //1 1
                  listNode.next = listNode.next.next;
             }else{
                 listNode = listNode.next;
             }

         }
         return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }
    }
}