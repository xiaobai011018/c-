package com.bsc.arraylistsource;


import java.util.ArrayList;

@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        String str = "welcome to bit";
        String str2 = "come";
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);

            while (arrayList.remove(new Character(c))==true){}
        }
        for (Character character : arrayList) {
            System.out.print(character);
        }
//
//        java.lang.String str = "welcome to bit";
//        java.lang.String[] comes = str.split("come");
//        ArrayList
//        for (java.lang.String come : comes) {


//        Vector<String> strings = new Vector<>();
//        strings.add("bsc");
//        strings.add("qwe");
//        String a = "abs dqd   qwe";
//        String[] s = a.split(" ");
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
//        ArrayList<A> as = new ArrayList<>();
//        as.add(new A("bsc",12));
//        as.add(new A("bit",12));
//        as.add(new A("阿琛姐姐",18));
//        for (A a : as) {
//            System.out.println(a);
//        }
//        for (int i = 0; i < as.size(); i++) {
//            System.out.println(as.get(i));
//        }
//        Iterator<A> iterator = as.iterator();
//        while (iterator.hasNext()) {
//            A next = iterator.next();
//            System.out.println(next);
//        ArrayList<String> arrayList = new ArrayList<>();



//        }
    }
}
class A{
    String name;
    int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "A{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
