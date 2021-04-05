import java.util.Scanner;

public class TestDemo {
    public static void printAge(int age) {
        if (age<=18) {
            System.out.println("少年");
        } else if((age>=19)&&(age<=28)){
            System.out.println("青年");
        } else if((age>=29)&&(age<=55)) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
    public static boolean judgePrimeNum(int num) {
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(i%num==0) {
                return false;
            }
        }
        return true;
    }
    public static void primeNum() {
        for (int i = 1; i <= 100; i++) {
            int j = 0;
            for ( j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0) {
                    break;
                }
            }
            if (j>Math.sqrt(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void leapYear() {
        for (int i = 1000; i <= 2000; i++) {
            if(((i%4==0)&&(i%100!=0))||(i%400==0)) {
                System.out.print(i+" ");
            }
        }
    }
    public static int countNineNum() {
        int i = 0;
        int count = 0;
        for(i=1;i<=100;i++) {
            if(i/10==9) {
                count++;
            }
            if (i%10==9) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countNineNum();
        int num = scanner.nextInt();
        //System.out.println(count);
        //leapYear();
        //primeNum();
        //System.out.println(judgePrimeNum(num));
        System.out.println(judgePrimeNum(num));
    }
}
