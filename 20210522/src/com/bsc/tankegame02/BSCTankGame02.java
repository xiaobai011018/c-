package com.bsc.tankegame02;

import javax.swing.*;

public class BSCTankGame02 extends JFrame {
    MyPanel myPanel;

    public static void main(String[] args) {
        BSCTankGame02 bscTankGame01 = new BSCTankGame02();
    }
    public BSCTankGame02(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
