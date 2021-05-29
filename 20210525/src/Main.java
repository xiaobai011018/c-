import java.util.Scanner;

public class Main {

    public static String reversSentence(String str,int n) {
        if(str==null){
            return null;
        }
        char[] array = str.toCharArray();
        int i = 0;
        int j = n-1;
        char temp;
        while(i<j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        i = n;
        j = array.length-1;
        while(i<j){
            temp = array[i];
            array[i] = array[j] ;
            array[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = array.length-1;
        while(i<j){
            temp = array[i];
            array[i] = array[j] ;
            array[j] = temp;
            i++;
            j--;
        }
        return new String(array);
    }
    public static void main(String[] args) {

        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
        } catch (Exception e) {
                e.printStackTrace();
        }

        int n = scan.nextInt();
        String str = scan.nextLine();
        String ret = reversSentence(str,n);
        System.out.println(ret);
        System.out.close();
    }
}