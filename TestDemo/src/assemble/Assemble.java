package assemble;

import org.omg.CORBA.INITIALIZE;
import org.omg.CosNaming.BindingIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Assemble {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new dog("壮壮",123));
        list.add(new dog("小猫",33));
        list.add(new dog("小狗",53));
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }
//        Collection collection = new ArrayList();
//        collection.add("qwe");
//        collection.add(123);
//        collection.add("我是猪");
//        System.out.println(collection);

    }
}
class dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}