
public class TestBook {
	import java.util.Scanner;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int year = scan.NextInt();
			if((year%4==0)&&(year%100!=0)||(year%400==0)) {
				System.out.println("是闰年 ");
			}else {
				System.out.println("不是闰年 ");
			}
		}
	}
}
/*	public static void main1(String[] args) {
		System.out.println("Hello World");
	}
}*/
/*	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int year = scan.NextInt();
			if((year%4==0)&&(year%100!=0)||(year%400==0)) {
				System.out.println("是闰年 ");
			}else {
				System.out.prinln("不是闰年 ");
			}

/*		}*/

/*	}
}*/