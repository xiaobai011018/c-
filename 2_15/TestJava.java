	import java.util.Scanner;
	public class TestJava {
		public static void main(String[] args) {
			int count = 0;
			int sum = 0;
			int ret = 0;
			for (int i = 1;i<=999999;i++) {
				 ret = i;
				 count = 0;
				while (ret!=0) {
					count++;
					ret = ret / 10;
				}
				ret = i;
				sum = 0;
				while(ret != 0) {
					sum = sum + (int)Math.pow(ret%10,count);
					ret = ret / 10;
				}
				if(i == sum) {
					System.out.println(sum+" is my result");
				}
			}
		}
		public static void main6(String[] args) {
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			System.out.println(i);
		}
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int num = scan.nextInt();
			System.out.println(num);
		}

	}
	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
	}
	public static void main3(String[] args) {
		for (byte i = 0;;i++) {
			System.out.print(i+" ");
		}
	}
	public static void main2(String[] args) {
		int num = 1;
		int ret = 1;
		int sum = 0;
		while(num <= 5) {
			ret *= num;
			sum += ret;
			num++;

		}
		System.out.println(sum);
	}
	public static void main1(String[] args) {
		int num = 5;
		int i = 1;
		int j = 1;
		int ret = 1;
		int sum = 0;
		while(i<=5)
		{
			while(j<=i)
			{
				ret *= j;
				j++;
			}
			i++;
			sum += ret;
			ret = 1;
			j = 1;
		}
		System.out.println(sum);
	}
}