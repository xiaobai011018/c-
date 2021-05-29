package bsc.坦克大战;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BSCTankGame02 extends JFrame {
    MyPanel myPanel;

    public static void main(String[] args) {
        BSCTankGame02 bscTankGame01 = new BSCTankGame02();
    }
    public BSCTankGame02(){
        myPanel = new MyPanel();
        new Thread(myPanel).start();
        this.add(myPanel);
        this.setSize(1300,850);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
