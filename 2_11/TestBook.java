import static java.lang.Math.*;
public class TestBook {
	public static void main(String[] args) {

		System.out.println("The square root of" + sqrt(PI));
	}
	public static void main3(String[] args) {
		int a = 4;
		double b = Math.sqrt(a);
		System.out.println(b);
	}
	public static void main2(String[] args) {
		int a = 4;
		int b = -1 >>> 1;
		/*b >>>= 1;*/
		/*a >>= 1;*/
		System.out.println(b);
	}
	public static void main1(String[] args) {
		int x = 10;
		int y = 20;
		int a = x > y ? x : y;
		System.out.println(a);
	}
}