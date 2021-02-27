class Node {
    public int data;
    public Node prev;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class myLinkList {
    Node head;
    Node tail;
    public void display() {
        Node tmp = this.head;
        while (tmp!=null) {
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }
    private void checkIndex(int index) {
        if (index<0||index>size()) {
            throw new RuntimeException("index不合法")
        }
    }
    private Node searchIndex(int index) {
        Node cur = this.head;
        while(index>0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        checkIndex(index);
        Node ret = searchIndex(index);
        if (index==0) {
            addFirst(data);
            return;
        }
        if (index==size()) {
            addLast(data);
            return;
        }
        node.next = ret;
        node.prev = ret.next;
        ret.prev.next = node;
        ret.prev = node;

    }
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur!=null) {
            if (cur.data==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void addLast(int data) {
        Node node = new Node(data);
        if (tail==null) {
            this.tail = node;
            this.head = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = this.tail.next;
        }
    }
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head==null) {
            head.data = data;
        }else {
            node.next = this.head;
            head.prev = node;
            this.head = node;
        }
    }
    public void remove(int key) {
        Node cur = this.head;
        while(cur!=null) {
            if (cur.data==key) {
                if (cur==this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next!=null) {
                        cur.next.prev = cur.prev;
                    }else{
                        this.tail = cur.prev;
                    }
                }
            } else{
                cur = cur.next;
            }
        }
    }
    public void clear() {
        while(this.head!=null) {
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }
}
