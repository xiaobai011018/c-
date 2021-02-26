public class TestDemo {
    public static Node getIntersectionNode(Node headA,Node headB) {
        Node pl = headA;
        Node ps = headB;
        int lenA = 0;
        int lenB = 0;
        while(pl!=null) {
            lenA++;
            pl = pl.next;
        }
        while(ps!=null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA-lenB;
        if(len<0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        while((ps!=null)&&(pl!=null)&&(ps!=pl)) {
            ps = ps.next;
            pl = pl.next;
        }
        if (pl==ps&&pl!=null) {
            return pl;
        }
        return null;
    }
    public static void main(String[] args) {
        TestJava now = new TestJava();
        now.addFirst(10);
        now.addFirst(10);
        now.addFirst(12);
        now.addFirst(10);
        now.addFirst(13);
        now.addFirst(13);
        TestJava now2 = new TestJava();
        now2.addFirst(10);
        now2.addFirst(11);
        now2.addFirst(14);
        now2.addFirst(15);
        now2.addFirst(19);
        now2.addFirst(16);
        now2.display();
        now2.display2(now.cupList(10));
        //System.out.println(now.SearchMid().data);
        //System.out.println(now.searchLastKey(5).data);
        Node ret = getIntersectionNode(now.head,now2.head);
        //now.display();
//        now.display();
//        System.out.println(now.contains(11));
//        System.out.println(now.size());
//        now.addIndex(4,4);
//        now.display();
//        now.remove(10);
//        now.remove(1);
//        now.removeAllKey(10);
//        Node ret = now.RoateList();
//        now.display2(ret);

    }
}