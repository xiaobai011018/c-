package com.bsc.threaduer;

public class Thread02 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread thread = new Thread(a);
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            Thread.sleep(1000);
            if (i==5){
                thread.start();
                thread.join();
            }
        }
    }
}
class A implements Runnable{
    private int count;
    @Override
    public void run() {

        while(true){
            System.out.println("hello"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==10){
                break;
            }
        }
    }
}