import java.util.Scanner;

public class TestJava {
    public static void main8(String[] args) {
        int i = 0;
        int j = 0;
        for (i=1;i<=9;i++) {
            for (j=1;j<=i;j++) {
                System.out.print(" "+i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
    public static void main7(String[] args) {
        for (int i=1000;i<=2000;i++) {
            if ((i%4==0)&&(i%100!=0)||(i%400==0)) {
                System.out.println(i);
            }
        }
    }
    public static void main6(String[] args) {
        int i = 0;
        int j = 0;
        for (i=1;i<=100;i++) {
            for (j=2;j<i;j++) {
                if (i%j==0) {
                    break;
                }
            }
            if (i==j) {
                System.out.println(i);
            }
        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        for ( i = 2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                break;
            }
        }
        if (i>Math.sqrt(n)) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("少年");
        } else if ((age>=19)&&(age<=28)) {
            System.out.println("青年");
        } else if ((age>=29)&&(age<=55)) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n!=0) {
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i=0;i<32;i++) {
            if (((n>>i)&1)==1) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        System.out.println("hello");
    }
}
