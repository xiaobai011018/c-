public class TestJava {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public TestJava() {
                }

    public static void main(String[] args) {
        String str = new String("Hello world");
        System.out.println("hello world".equals(str));
    }
}
