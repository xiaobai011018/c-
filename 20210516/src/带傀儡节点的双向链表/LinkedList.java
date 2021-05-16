package 带傀儡节点的双向链表;
class Node{
    public int val;
    public Node next;
    public Node prev;
    public Node(int val) {
        this.val = val;
    }
}
public class LinkedList {
    private Node head = new Node(-1);
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head.next;
        node.prev = head;
        head.next = node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = head;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = node;
        node.prev = cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index<0 || index>=size()){
            return;
        }
        Node cur = head.next;
        while(index!=0){
            cur = cur.next;
            index--;
        }
        Node node = new Node(data);
        node.prev = cur.prev;
        cur.prev.next = node;
        node.next = cur;
        cur.prev = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = head.next;
        while(cur!=null){
            if (cur.val==key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur = head;
        while(cur!=null){
            cur = cur.next;
            if (cur.val==key){
                if (cur.next!=null) {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }else {
                    cur.prev.next = null;
                }
                return;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head.next;
        while(cur!=null){
            if (cur.val==key){
                if (cur.next!=null) {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }else {
                    cur.prev.next = null;
                }
                cur = cur.next;
            }else {
                cur = cur.next;
            }
        }
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = head.next;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        Node cur = head.next;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){
        this.head = null;
    }
}
