public class TestJava {
    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (val<'0'||val>'9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "12345a6";
        boolean flg = func(str);
    }
}
