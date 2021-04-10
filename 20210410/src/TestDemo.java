import java.util.Scanner;

public class TestDemo {
    public static int max3(int n1,int n2,int n3) {
            return max2(n1,n2)>n3?max2(n1,n2):n3;
    }
    public static int max2(int n1,int n2) {
            return n1>n2?n1:n2;
    }
    public static void main(String[] args) {
        System.out.println(max3(4132, 123, 421));
    }
    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
        }
        System.out.println(tmp);
    }
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
            sum += tmp;
        }
        System.out.println(sum);
    }
    public static int fabNum(int n) {
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return fabNum(n-1) + fabNum(n-2);
    }
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = fabNum(n);
        System.out.println(num);
    }
    public static void main9(String[] args) {
        int[] arr = {1,3,1,2,4,3,4,2,5};
        int tmp = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            tmp ^= arr[i];
        }
        System.out.println(tmp);
    }
    public static void main8(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    public static int printNum(int n) {
        if (n/10!=0) {
             printNum(n/10);
        }
        System.out.print(n%10+" ");
        return 0;
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNum(n);
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count!=0) {
            String secret = scanner.nextLine();
            if (secret.equals("abcef")) {
                System.out.println("密码正确");
                break;
            }else {
                count--;
                System.out.println("你还有"+ count + "次机会");
            }
        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((n>>>i)&1));
        }
        System.out.println();
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print(((n>>>i)&1));
        }
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            if(((n>>>i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int tmp = 0;
        while(x%y != 0) {
            tmp = x%y;
            x = y;
            y = tmp;
        }
        System.out.println(y);
    }
    public static void main2(String[] args) {
        int flg = 1;
        double sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum += 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        for (int i = 0; i <= 999; i++) {
            int count = 0;
            double sum = 0;
            int tmp = i;
            while(tmp != 0) {
                count++;
                tmp /=10;
            }
            tmp = i;
            while(tmp != 0) {
                sum = sum + Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
}
