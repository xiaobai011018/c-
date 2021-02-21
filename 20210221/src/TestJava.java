import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestJava {
    public static void main(String[] args) {
        JavaList test = new JavaList();
        for (int i = 0; i <test.elem.length ; i++) {
            test.add(i,i);
        }
//        test.Display();
//        test.add(3,112);
//        test.Display();
//        System.out.println(test.search(5));
//        System.out.println(test.contains(5));
        //System.out.println(test.contains(210));
        //test.getPos(39);
        //test.delete(30);
//        test.delete(0);
//        test.Display();
        test.delete(9);
        test.Display();
        test.clear();
        test.Display();
    }
    public static void main1(String[] args) {
        Date date = new Date();
        GregorianCalendar now = new GregorianCalendar();
        int today = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);
        System.out.println(today);
        System.out.println(month);
//        System.out.println(date.getDate());
        //System.out.println(demo.toString());
    }
}
