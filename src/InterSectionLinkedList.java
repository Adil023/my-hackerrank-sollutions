public class Solution {

    public static int getLength(ListNode node){
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        while(lenA > lenB){
            lenA--;
            headA = headA.next;
        }

        while(lenB > lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}