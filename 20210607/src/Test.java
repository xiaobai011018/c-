public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3,0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        System.out.println(myLinkedList.get(4));
//        myLinkedList.addAtHead(4);
//        myLinkedList.deleteAtIndex(4);
//        System.out.println(myLinkedList.get(3));
    }
}
class ListNode {
    ListNode next;
    int val;
    ListNode(int x) { val = x; }
}
class MyLinkedList {
    private ListNode head;
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size||index<0){
            return -1;
        }
        if(head==null){
            return -1;
        }
        ListNode cur = head;
        while(index!=0){
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode cur = new ListNode(val);
        cur.next = head;
        head = cur;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
            return;
        }
        ListNode cur = head;
        while(cur.next!=null){
            cur = cur.next;
        }
        ListNode ret =  new ListNode(val);
        cur.next =  ret;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>size-1||index<0){
            return;
        }
        ListNode cur = head;
        if(head==null){
            addAtHead(val);
            return;
        }
        if(index==0){
            addAtHead(val);
        }else{
            while(index-1 != 0){
                index--;
                cur = cur.next;
            }
            ListNode ret =  new ListNode(val);
            ret.next = cur.next;
            cur.next = ret;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>size-1||index<0){
            return;
        }
        if(head==null){
            return;
        }
        ListNode cur = head;
        if(index==0){
            head = head.next;
        }else{
            while(index-1 != 0){
                index--;
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        size--;
    }
}