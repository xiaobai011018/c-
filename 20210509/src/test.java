public class test {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur = head;
        ListNode curNext = head.next;
        ListNode prev = null;
        while(curNext!=null){
            cur.next = prev;
            prev = cur;
            cur = curNext;
            curNext = curNext.next;

        }
        cur.next = prev;
        return cur;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        count = count - k;
        while(head!=null&&count != 0){
            head = head.next;
            count--;
        }
        return head;
    }
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while(pHead!=null){
            if (pHead.next!=null&&pHead.val==pHead.next.val){
                while (pHead.next!=null&&pHead.val==pHead.next.val){
                    pHead = pHead.next;
                }
            } else {
                cur.next = pHead;
                cur = cur.next;
            }
            pHead = pHead.next;
        }
        cur.next = null;
        return newHead.next;
    }
}
class ListNode{
    public ListNode(int val) {
        this.val = val;
    }

    public int val;
    public ListNode next;
}
