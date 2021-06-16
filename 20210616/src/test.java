import java.util.*;

public class test {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("张三",12);
        hashMap.put("李四",13);
        hashMap.put("柏诗成",18);
        Set<String> keySet = hashMap.keySet();
        System.out.println("增强for");
        for (String s : keySet) {
            System.out.println(s+"  "+ hashMap.get(s));
        }
        System.out.println("迭代器");
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s+"  "+ hashMap.get(s));
        }
        Collection<Integer> values = hashMap.values();
        Iterator<Integer> iterator1 = values.iterator();
        System.out.println("=============");
        while (iterator1.hasNext()) {
            Integer val = iterator1.next();
            System.out.println(val);
        }
        System.out.println("=============");
        for (Integer value : values) {
            System.out.println(value);
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            System.out.println(entry.getValue()+"  "+entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getValue()+"  "+entry.getKey());
        }
    }
}
