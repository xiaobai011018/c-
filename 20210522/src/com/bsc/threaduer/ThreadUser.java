package com.bsc.threaduer;

public class ThreadUser {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        Thread thread = new Thread(cat);
        thread.setName("柏诗成");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName()+i);
        }
        System.out.println("开始打断休眠");
        thread.interrupt();
//        new Thread(cat).start();
//        new Thread(cat).start();
//        new Thread(cat).start();
    }
}
class Cat implements Runnable{
    private int nums = 100;
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"票数剩余 "+(--nums));
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                System.out.println("休眠被打断");
            }
        }
    }
}
