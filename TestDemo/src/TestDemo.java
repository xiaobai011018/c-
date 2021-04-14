public class TestDemo {
    @SuppressWarnings({"all"})
    public static void transform(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println();
        transform(array);
    }
    public static void main9(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i <array.length ; i++) {
            array[i] = i+1;
        }
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main8(String[] args) {
        int[] array = {1,2,3,4};
        //System.out.println(sum(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static double avg(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i]*1.0;
        }
        return sum/array.length;
    }
    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(avg(array));
    }
    public static int reN(int n) {
        if (n==1) {
            return 1;
        }else {
            return n*reN(n-1);
        }
    }
    public static void main6(String[] args) {
        System.out.println(reN(3));
        //System.out.println(reNumSum(3));
    }
    public static int reNumSum(int n) {
        if (n==1) {
            return 1;
        }else {
            return n+reNumSum(n-1);
        }
    }
    public static void printNum(int n) {
        if (n/10==0) {
            System.out.print(n+" ");
            return;
        }else {
            printNum(n/10);
            System.out.print(n%10+" ");
        }
    }
    public static void main5(String[] args) {
            printNum(123);
    }
    public static int numSum(int n) {
        if (n/10==0) {
            return n;
        }else {
            return n%10 + numSum(n/10);
        }
    }
    public static void main4(String[] args) {
        System.out.println(numSum(123));
    }
    public static int fib(int n) {
        if (n==1||n==2) {
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main3(String[] args) {
        System.out.println(fib(7));
    }
    public static void print(char pose1,char pose2) {
        System.out.print(pose1+"->"+pose2+" ");
    }
    public static void hanoiTower(int n,char pose1,char pose2,char pose3) {
        if (n==1) {
            print(pose1,pose2);
        }else {
            hanoiTower(n-1,pose1,pose3,pose2);
            print(pose1,pose2);
            hanoiTower(n-1,pose2,pose1,pose3);
        }
    }
    public static void main2(String[] args) {
        hanoiTower(4,'A','B','C');
    }
    public static int frogJump(int n) {
        if (n==1||n==2) {
            return n;
        }else {
            return frogJump(n-1)+frogJump(n-2);
        }
    }
    public static void main1(String[] args) {
        System.out.println(frogJump(3));

    }
}
