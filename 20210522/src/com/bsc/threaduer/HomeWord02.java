package com.bsc.threaduer;

public class HomeWord02 {
    public static void main(String[] args) {
        Money money = new Money();
        new Thread(money).start();
        new Thread(money).start();

    }
}
class Money implements Runnable{
    private  int money = 10000;
    @Override
    public void run() {

            while(true){
                synchronized (this) {
                    if (money <= 0) {
                        System.out.println("余额用尽");
                        break;
                    }
                    money -= 1000;
                    System.out.println("当前余额还剩余" + money);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
