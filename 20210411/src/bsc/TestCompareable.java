package bsc;

import java.util.Arrays;

 class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", score=" + score +
                 '}';
     }

     @Override
    public int compareTo(Student o) {
        if (this.age>o.age) {
            return 1;
        } else if (this.age==o.age) {
            return 0;
        } else {
            return -1;
        }
    }



 }
public class TestCompareable {
    public static void main(String[] args) {
        Student student1 = new Student("bit",18,99);
        Student student2 = new Student("bsc",13,123);
        Student student3 = new Student("ads",14,21);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
