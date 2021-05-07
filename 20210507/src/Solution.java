class Solution {

    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur!=null){
            cur.next = head;
            head = cur;
            cur = cur.next;
        }
        return head;
    }
}
class ListNode{
    public ListNode next;
}