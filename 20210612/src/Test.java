import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int[][] ope = {{1,1},{1,-1},{2,0},{2,-1}};
        CatDogAsylum catDogAsylum = new CatDogAsylum();
        System.out.println(catDogAsylum.asylum(ope));
//        ArrayList arrayList = new ArrayList();
//        Iterator iterator = arrayList.iterator();
//        iterator.remove();
//        RecentCounter recentCounter = new RecentCounter();
//        recentCounter.ping(642);
//        recentCounter.ping(1849);
//        recentCounter.ping(4921);
    }
}
class RecentCounter {
    LinkedList<Integer> ls;
    public RecentCounter() {
            ls = new LinkedList<>();
    }

    public int ping(int t) {
        ls.add(t);
        int num = ls.size();
        while(ls.peek()<t-3000){ ls.poll(); }

        return ls.size();
    }
}
class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
            // write code here
            ArrayList<Integer> alHome = new ArrayList<>();
            ArrayList<Integer> alAdopt = new ArrayList<>();
            for(int i = 0;i<ope.length;i++){
                if(ope[i][0]==1){
                    alHome.add(ope[i][1]);
                }else if(ope[i][0]==2){
                    if(ope[i][1]==0){
                        alAdopt.add(alHome.remove(0));
                    }else if(ope[i][1]==1){
                        Iterator<Integer> iterator = alHome.iterator();
                        while (iterator.hasNext()) {
                            Integer num = iterator.next();
                            if (num>0){
                                iterator.remove();
                                alAdopt.add(num);
                            }
                        }
                    }else if(ope[i][1]==-1){
                        Iterator<Integer> iterator = alHome.iterator();
                        while (iterator.hasNext()) {
                            Integer num = iterator.next();
                            if (num<0){
                                iterator.remove();
                                alAdopt.add(num);
                            }
                        }
                    }
                }
            }
            return alAdopt;


    }
}
