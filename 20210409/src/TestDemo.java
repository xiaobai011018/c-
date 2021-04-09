import java.util.*;
public class TestDemo {
    public static void guessNum() {
        Random rand = new Random();
        int i = rand.nextInt(100)+1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            n = scanner.nextInt();
            if (n<i) {
                System.out.println("猜小了");
            } else if(n>i) {
                System.out.println("猜大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }
    public static void main(String[] args) {
            guessNum();
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for(i=0;i<n;i++) {
                for(j=0;j<n;j++) {
                    if(i==j) {
                        System.out.print("*");
                    }else if(i==n-1-j) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
