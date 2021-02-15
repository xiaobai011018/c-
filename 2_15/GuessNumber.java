import java.util.*;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randNum = random.nextInt(100);
		while(true) {
			System.out.println("请输入数字: ");
			int num = sc.nextInt();
			if(num < randNum) {
				System.out.println("你猜的数字小了");
			}else if(num > randNum) {
				System.out.println("你猜的数字大了");
			}else {
				System.out.println("恭喜你猜对了！");
				break;
			}

		}
	}
}