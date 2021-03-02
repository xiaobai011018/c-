import java.util.Scanner;

public class TestJava {
    public static String func(String str) {
        String[] tmp = str.split(" ");
        String tmps = "";
        for (String s:tmp) {
            tmps += s;
        }
        return tmps;
    }
    public static String reverse(String str,int left,int right) {
            char[] value = str.toCharArray();
            while(left<right) {
                char tmp = value[left];
                value[left] = value[right];
                value[right] = tmp;
                left++;
                right--;
            }
            return new String(value);
    }
    public static String func1(String str,int n) {
        String ret = reverse(str,0,n-1);
        ret = reverse(ret,n,str.length()-1);
        ret = reverse(ret,0,str.length()-1);
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        String ret = func1(str,n);
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ret = func(str);
        System.out.println(ret);
    }
}
