package bsc;
abstract class Person {
    abstract public void func();
    public void func2() {
        System.out.println();
    }
}
class Person1 extends Person {
    public void func() {
        System.out.println();
    }
}
public class TestDemo {
    public static void main(String[] args) {
            boolean x = true;
            if(!x) {
                System.out.println("我是猪");
            }
    }
}
