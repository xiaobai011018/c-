package 带傀儡节点的双向链表;

public class test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(4);
        linkedList.addLast(4);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
       // linkedList.display();
        //linkedList.addIndex(4,9);
        //linkedList.display();
        //System.out.println(linkedList.contains(4));
        linkedList.removeAllKey(4);
        linkedList.display();
    }
}
