class NumMax {
    private int num;
    public NumMax (int num) {
        this.num = num;
    }
    public NumMax () {
        this(3);
        System.out.println(this.num);
    }
    public void setNum(int num) {
        this.num = num;
    }

}
class Person {
    int i = 0;
    private int age;
    private String name;

    public Person() {
        this(13,"asd");
        System.out.println("我是猪");
    }

    public Person (int age, String name) {
        System.out.println("age::name");
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    Person func() {
        i++;
        return this;
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
    public void  print() {
        System.out.println(this.i);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person per = new Person(19,"zhangsan");
        Person per1 = new Person();
        Person per2 = null;
        //per2.toString();
        //var per2 = new Person(20,"bsc");
        //per.func().func().func().print();
        per.setAge(19);
        System.out.println(per.getAge());
        per.setName("张三");
        System.out.println(per);
        System.out.println("abcd".equals("bdf"));
        new NumMax();
    }
}
