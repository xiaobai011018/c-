import java.util.Arrays;

public class sequenceList<T>{
    private Object[] list;
    private int count;
    private int capacity;
    public sequenceList() {
        this.capacity = 10;
        list = new Object[capacity];
    }
    public void modification(int index,T t) {
        indexJudge(index);
        list[index] = t;
    }
    public T search(int index) {
        indexJudge(index);
        return (T)list[index];
    }

    private void ifFull(){
        if (count == capacity) {
            this.capacity = list.length+list.length>>>1;
            this.list = Arrays.copyOf(list,capacity);

        }
    }
    public void del(int index){
        indexJudge(index);
        int cur = index;
        while(cur!=count){
            list[cur] = list[cur+1];
            cur--;
        }
        count--;
    }
    private void indexJudge(int index) {
        if (index < 0||index > count) {
            throw new RuntimeException("下标不合法");
        }
    }
    public void add(int index,Person person) {
        indexJudge(index);
        ifFull();
        if (index == count) {
            list[index] = person;
            count++;
        }else {
            int cur = count;
            while(cur!=index){
                list[cur] = list[cur-1];
                cur--;
            }
            list[index] = person;
            count++;
        }

    }
}
class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
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
