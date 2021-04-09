import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(s);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = 0;
        ch = scanner.next().charAt(1);
        System.out.println(ch);
    }
}
