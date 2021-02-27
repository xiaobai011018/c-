//class Node {
//    public int data;
//    public Node next;
//    public Node (int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//public class TestJava {
//
//    public Node head;
//    public Node SearchMid() {
//        Node fast = this.head;
//        Node slow = this.head;
//        while((fast!=null)&&(fast.next!=null)) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//    public Node RoateList() {
//        if (this.head == null) {
//            return null;
//        }
//        Node prev = null;
//        Node cur = this.head;
//        Node newHead = null;
//        while (cur != null) {
//            Node curNext = cur.next;
//            if (curNext == null) {
//                newHead = cur;
//            }
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return newHead;
//    }
//
//    //头插法
//    public void addFirst(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            this.head = node;
//            return;
//        }
//        node.next = head;
//        this.head = node;
//
//    }
//
//    //尾插法
//    public void addLast(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            this.head = node;
//            return;
//        }
//        Node cur = this.head;
//        while (cur.next != null) {
//            cur = cur.next;
//        }
//        cur.next = node;
//    }
//
//    //任意位置插入,第一个数据节点为0号下标
//    public void addIndex(int index, int data) {
//        Node node = new Node(data);
//        if (index == 0) {
//            this.addFirst(data);
//            return;
//        }
//        if (index == this.size()) {
//            this.addLast(data);
//            return;
//        }
//        Node cur = Searchindetx(index, data);
//        node.next = cur.next;
//        cur.next = node;
//    }
//
//    public Node Searchindetx(int index, int data) {
//        if (index < 0 || index > size()) {
//            throw new RuntimeException("index不合法");
//        }
//        Node cur = this.head;
//        for (int i = 0; i < index - 1; i++) {
//            cur = cur.next;
//        }
//        return cur;
//    }
//
//    //查找是否包含关键字key是否在单链表当中
//    public boolean contains(int key) {
//        Node cur = this.head;
//        while (cur != null) {
//            if (cur.data == key) {
//                return true;
//            }
//            cur = cur.next;
//        }
//        return false;
//    }
//
//    private Node Searchkey(int key) {
//        Node prev = this.head;
//        while (prev.next != null) {
//            if (prev.next.data == key) {
//                return prev;
//            } else {
//                prev = prev.next;
//            }
//        }
//        return null;
//    }
//
//    //删除第一次出现关键字为key的节点
//    public void remove(int key) {
//        if (this.head.data == key) {
//            this.head = this.head.next;
//            return;
//        }
//        if (this.head == null) {
//            return;
//        }
//        Node prev = Searchkey(key);
//        if (prev == null) {
//            System.out.println("没有你要删除的数据");
//            return;
//        } else {
//            Node del = prev.next;
//            prev.next = del.next;
//        }
//    }
//
//    //删除所有值为key的节点
//    public void removeAllKey(int key) {
//        Node cur = this.head.next;
//        Node prev = this.head;
//        while (cur != null) {
//            if (cur.data == key) {
//                prev.next = cur.next;
//                cur = cur.next;
//            } else {
//                prev = prev.next;
//                cur = cur.next;
//            }
//        }
//        if (this.head.data == key) {
//            this.head = this.head.next;
//        }
//    }
//
//    //得到单链表的长度
//    public int size() {
//        Node cur = this.head;
//        int count = 0;
//        while (cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
//    }
//
//    public void display() {
//        Node cur = this.head;
//        while (cur != null) {
//            System.out.print(cur.data + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//
//    public void display2(Node newhead) {
//        Node cur = newhead;
//        while (cur != null) {
//            System.out.print(cur.data + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//    public Node searchLastKey(int num) {
//        Node fast = this.head;
//        Node slow = this.head;
//        while(num-1!=0) {
//            if (fast.next!=null){
//                fast = fast.next;
//                num--;
//            }else{
//                System.out.println("没有相应的节点");
//                return null;
//            }
//        }
//        while(fast.next!=null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//    public Node cupList(int key) {
//        Node bs = null;
//        Node be = null;
//        Node as = null;
//        Node ae = null;
//        Node cur = this.head;
//        while(cur!=null) {
//            if (cur.data<key) {
//                if (bs == null) {
//                    bs = cur;
//                    be = cur;
//                } else {
//                    be.next = cur;
//                    be = be.next;
//                }
//            }else {
//                if (as == null) {
//                    as = cur;
//                    ae = cur;
//                } else {
//                    ae.next = cur;
//                    ae = ae.next;
//                }
//            }
//            cur = cur.next;
//        }
//        if (bs==null) {
//            return as;
//        }
//        be.next = as;
//        if (as!=null) {
//            ae.next = null;
//        }
//        return bs;
//    }
//    public Node deleList() {
//        Node newHead = new Node(-1);
//        Node cur = this.head;
//        Node tmp = newHead;
//        while(cur!=null) {
//            if ((cur.next!=null)&&(cur.next.data==cur.data)) {
//                while ((cur.next!=null)&&(cur.next.data==cur.data)) {
//                    cur = cur.next
//                }
//                cur = cur.next;
//            }else {
//                tmp.next = cur;
//                tmp = tmp.next;
//                cur = cur.next;
//            }
//
//        }
//        tmp.next = null;
//        return newHead.next;
//    }
//    public boolean chkPalindrome() {
//        if (this.head == null) {
//            return false;
//        }
//        Node fast = this.head;
//        Node slow = this.head;
//        while(fast!=null&&fast.next!=null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        Node cur = slow.next;
//        while(cur!=null) {
//            Node curNext = cur.next;
//            cur.next = slow;
//            slow = cur;
//            cur = curNext;
//        }
//        while(slow!=this.head) {
//            if (slow.data!=this.head.data) {
//                return false;
//            }
//            slow = slow.next;
//            this.head = this.head.next;
//        }
//        return true;
//    }
//    public boolean hasCycle() {
//        Node fast = this.head;
//        Node slow = this.head;
//        while(fast!=null&&fast.next!=null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast==slow) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}