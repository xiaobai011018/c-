package InterfaceList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        System.out.println("list= "+list);
        list.add(1,"小青");
        System.out.println("list= "+list);
        List list2 = new ArrayList();
        list2.add("小雪");
        list2.add("小王");
        list.addAll(1,list2);
        System.out.println("list= "+list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf("小雪"));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()) {
//            Object obj = iterator.next();
//            System.out.println(obj);
//        }

    }
}
