package com.bsc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(123,new Employee("小张",20000,123));
        hashMap.put(456,new Employee("小王",123123,456));
        hashMap.put(789,new Employee("小二",2000,789));
        Set set = hashMap.entrySet();
        Set set1 = hashMap.keySet();
        for (Object o :set1) {
            Employee val = (Employee)hashMap.get(o);
            if (val.getSalary()>18000) {
                System.out.println(val);
            }
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            Employee value = (Employee)next.getValue();
            if (value.getSalary()>18000) {
                System.out.println(value);
            }

        }



    }
}
class Employee {
    private String name;
    private double salary;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }

    public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }
}