import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age = 12;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Person {
    private int age;
    private String name;

    public Person() {
        System.out.println("Hello World");
    }
    {
        System.out.println("实列代码块");
    }
    static {
        System.out.println("静态代码块");
    }


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestJava {
    public static void main8(String[] args) {
        int[] array = {1,3,4,5,6,3,4};
        int[] array1 = Arrays.copyOfRange(array,2,5);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array));
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
    }
    public static void main7(String[] args) {
        Person person = new Person();
    }
    public static void main6(String[] args) {
        Person person = new Person( 20,"asdas");
        System.out.println(person);
    }
    public static void main5(String[] args) {
        int[] ret = {1,2,3,4,5};
        System.out.println(Arrays.toString(ret));
    }
    public static void main4(String[] args) {
        Student student = new Student();
        //System.out.println(student.getAge());
        student.setName("bsc");
        //System.out.println(student.getName());
        System.out.println(student);
    }
    public static void main3(String[] args) {
        int[][] array = {{1,2,3,4},{1,26,43,3}};
        for (int[] tmp:array) {
            for (int x:tmp) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public static void main2(String[] args) {
        int[][] array= {{1,2,3,4},{6,7,8,9}};
        System.out.println(Arrays.deepToString(array));
    }
    public static boolean isUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,6,4,3};
        System.out.println(isUp(array));
    }
}
