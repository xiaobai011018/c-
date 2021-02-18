import java.util.Scanner;

public class TestJava1 {
    public static void main(String[] args) {
        int count = 3;
        while(count!=0) {
            System.out.println("请输入密码:");
            Scanner scanner = new Scanner(System.in);
            String ret = scanner.nextLine();
            if (ret.equals("我是猪")!=true) {
                count--;
                System.out.println("密码错误，你还有"+count+"机会");
            } else {
                System.out.println("密码正确");
                break;
            }
        }
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while (x%y!=0) {
            int ret = x%y;
            y = ret;
            x = y;
        }
        System.out.println(y);
    }
}
