import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        // String arr = "";
        while (sc.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例

            String str = sc.nextLine();
            String arr = "";
            for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);
                int j = 0;
                for( j = 0;j<arr.length();j++){
                    if(ch==arr.charAt(j)){
                        break;
                    }
                }
                if(j==arr.length()){
                    arr = arr + ch;
                }
            }
            System.out.println(arr);
        }

//        for (String arg : args) {
//
//        }
    }
}