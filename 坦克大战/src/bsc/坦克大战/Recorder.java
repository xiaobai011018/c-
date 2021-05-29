package bsc.坦克大战;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class Recorder {
    private  static int allEmeryTank= 0;
    private static BufferedWriter bufferedWriter;
    private static String path = "src\\recorder.txt";
    private static Vector<EnemyTank> enemyTanks;

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static void keepRecord(){
        try {
             bufferedWriter = new BufferedWriter(new FileWriter(path));
             bufferedWriter.write(allEmeryTank+"\n");
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive){
                    bufferedWriter.write(enemyTank.getX()+"  "+enemyTank.getY()+"  "+enemyTank.getDirect()+"\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static int getAllEmeryTank() {
        return allEmeryTank;
    }
    public static void addAllEmeryTank(){
        allEmeryTank++;
    }
}
