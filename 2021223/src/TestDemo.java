public class TestDemo {
    public static void main(String[] args) {
        TestJava now = new TestJava();
        now.addFirst(10);
        now.addFirst(10);
        now.addFirst(12);
        now.addFirst(10);
        now.addFirst(13);
        now.addFirst(13);
        now.display();
        //now.display();
//        now.display();
//        System.out.println(now.contains(11));
//        System.out.println(now.size());
//        now.addIndex(4,4);
//        now.display();
//        now.remove(10);
//        now.remove(1);
        now.removeAllKey(10);
        now.display();
     
    }
}
