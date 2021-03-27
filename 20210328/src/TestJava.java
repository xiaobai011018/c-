import java.util.*;

public class TestJava {
//    public static int[][] transpose(int[][] matrix) {
//        int i = 0;
//        for(i=0;i<matrix.length;i++) {
//            int j = 0;
//            for(j=0;j<matrix[i].length;j++) {
//                int tmp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = tmp;
//            }
//        }
//        return matrix;
//    }

    public static void main(String[] args) {

    }
    public static boolean isUp(int[] arr) {
        for (int i = 0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static int searchMax(int[] arr) {
        int ret = 0;
        ret = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>ret) {
                ret = arr[i];
            }
        }
        return ret;
    }
    public static int[] copyArray(int[] array) {
        int[] arr = new int[array.length];
        int i = 0;
        for(i=0;i<array.length;i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    public static void main3(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = copyArray(arr);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr1));
    }
    public static int maxNum(int x,int y) {
        return x>y?x:y;
    }
    public static int maxNum(int x,int y,int z) {
        int ret = x>y ? x:y;
        return ret>z ? ret : z;
    }

    public static void main2(String[] args) {

    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(maxNum(n1, n2, n3));
    }
}