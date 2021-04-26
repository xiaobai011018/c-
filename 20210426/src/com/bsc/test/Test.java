package com.bsc.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Comparator;
@SuppressWarnings({"all"})
public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三",23.4,new MyDate(2020,12,11)));
        employees.add(new Employee("李四",25.4,new MyDate(2021,13,12)));
        employees.add(new Employee("王二",24.4,new MyDate(2022,14,13)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee&&o2 instanceof Employee)){
                    System.out.println("类型不匹配");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i!=0) {
                    return i;
                }
                int i1 = o1.getBirthday().compareTo(o2.getBirthday());
                return i1;

            }
        });

    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int i = this.year - o.year;
        if (i!=0) {
            return i;
        }
        i = this.month-o.month;
        if (i!=0) {
            return i;
        }
        i = this.day-o.day;
        return i;
    }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
