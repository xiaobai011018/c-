class Calc {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add() {
        return this.num1+this.num2;
    }
    public int sub() {
        return this.num1-this.num2;
    }
    public int mul() {
        return this.num1*this.num2;
    }
    public double div() {
        return this.num1/this.num2*1.0;
    }
//    public int add(int num1,int num2) {
//        return num1+num2;
//    }
//    public int sub(int num1,int num2) {
//        return num1-num2;
//    }
//    public int mul(int num1,int num2) {
//        return num1*num2;
//    }
//    public double div(int num1,int num2) {
//        return num1/num2*1.0;
//    }
}
class MyValue {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class TestJava {
    public static void swap(MyValue myValue1,MyValue myValue2) {
        int temp = myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(temp);
    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.setVal(10);
        myValue2.setVal(20);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        swap(myValue1,myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }
    public static void main1(String[] args) {
        Calc calc = new Calc();
        calc.setNum1(20);
        calc.setNum2(30);
//        calc.num1 = 10;
        System.out.println(calc.add());
//        System.out.println("加法");
//        System.out.println(calc.add(calc.getNum1(),calc.getNum2()));
//        System.out.println("减法");
//        System.out.println(calc.sub(calc.getNum1(),calc.getNum2()));
//        System.out.println("乘法");
//        System.out.println(calc.mul(calc.getNum1(),calc.getNum2()));
//        System.out.println("除法");
//        System.out.println(calc.div(calc.getNum1(),calc.getNum2()));

    }
}
