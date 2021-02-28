package come.bit.demo1;
// Animal.java
public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}
// Cat.java
class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}
// Bird.java
class Bird {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }

    public void fly() {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }
}
public class TestDemo {
}
