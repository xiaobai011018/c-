import java.util.Arrays;

//import java.util.Scanner;
//
//public class TestJava1 {
//    public static int sum1(int n) {
//        if (n<=9) {
//            return n%10;
//        } else {
//            return n%10+sum1(n/10);
//        }
//    }
//    public static int sum(int n) {
//        if (n==1) {
//            return 1;
//        } else {
//            return n+sum(n-1);
//        }
//
//    }
//    public static void main1(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//       int ret = sum1(n);
//        System.out.println(ret);
//    }
//}
public class TestJava1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.binarySearch(arr, 4));
    }
    public static int binarrySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length-1;
        while (left<=right) {
            if (arr[(left+right)/2]<x) {
                left = (left+right)/2+1;
            } else if (arr[(left+right)/2]>x) {
                right = (left+right)/2-1;
            } else {
                return (left+right)/2;
            }

        }
       return -1;
    }
    public static void main10(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ret = binarrySearch(arr,5);
        System.out.println("下标为"+ret);
    }
    public static void searchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main9(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        searchMax(arr);
    }
    public static void main8(String[] args) {
        int[] array = {1,23,4,5,6,7};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }
    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyArray(int[] arr2) {
        int[] arr1 = new int[arr2.length];
        for (int i = 0; i <arr2.length ; i++) {
            arr1[i] = arr2[i];
        }
        return arr1;
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] arr = copyArray(array);
        System.out.println(Arrays.toString(arr));
    }
    public static void main4(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        String a = "abcd";
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr = {1,2,3,45};
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[4];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int val:arr) {
            System.out.print(val+" ");
        }
    }
    public static int Jumb(int n) {
        if (n==1) {
            return 1;
        } else if(n==2) {
            return 2;
        } else {
            return Jumb(n-1)+Jumb(n-2);
        }
    }
    public static void main2(String[] args) {
        System.out.println(Jumb(4));
    }
    public static void hanNoi(int n,char A, char B, char C) {
        if (n==1) {
            System.out.print(" "+A+"->"+C);
        } else {
            hanNoi(n-1,'A','C','B');
            System.out.print(" "+A+"->"+C);
            hanNoi(n-1,'B','A','C');
        }
    }
    public static void main1(String[] args) {
        hanNoi(3,'A','B','C');
        System.out.println();
        hanNoi(2,'A','B','C');
    }
}
