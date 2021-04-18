package com.bsc.Exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

@SuppressWarnings({"all"})
public class HomeWork {
    public static void main(String[] args) {

        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("simth",2900);
        m.put("jack",2600);
        Set set = m.keySet();
        for (Object o :set) {
            m.put(o,(Integer)m.get(o)+100);
        }
        System.out.println(m);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        Collection values = m.values();
        System.out.println(values);


    }
}
class Staff {
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

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

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
