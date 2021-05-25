package com.bsc.threaduer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class threadhomeword {
    public static void main(String[] args) {
        B b = new B();
        C c = new C(b);
        b.start();
        c.start();
    }
}
class B extends Thread{
    private boolean flg = true;

    public void setFlg(boolean flg) {
        this.flg = flg;
    }

    @Override
    public void run() {
        while(flg){
            double random = (Math.random()*100+1);
            System.out.println(random);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        }
    }
}
class C extends Thread{

    private B b;
    private Scanner scanner = new Scanner(System.in);
    public C(B b){
        this.b = b;
    }
    @Override
    public void run() {
        while (true){
            System.out.println("请输入指令退出");
            char s = scanner.next().toUpperCase().charAt(0);
            if (s == 'Q'){
                b.setFlg(false);
                break;
            }
        }
    }




}
