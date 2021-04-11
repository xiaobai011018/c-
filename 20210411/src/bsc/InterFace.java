package bsc;
interface Symple {
    void func();
}
class React implements Symple {
    public void func() {
        System.out.println("正方形");
    }
}
class Cycle implements Symple {
    public void func() {
        System.out.println("⚪");
    }
}
public class InterFace {
    public static void sad(Symple symple) {
        symple.func();
    }
    public static void main(String[] args) {
        Symple symple1 = new React();
        Symple symple2 = new Cycle();
        sad(symple1);
        sad(symple2);
    }
}
