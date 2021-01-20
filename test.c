#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void game()
{
	int put = 0;
	int ret = rand() % 100 + 1;
	printf("请输入你要猜的数字：");
	while (1)
	{
		scanf("%d",&put);
		if (put < ret)
		{
			printf("猜小了，请重新输入数字:");
		}
		else if (put > ret)
		{
			printf("猜大了，请重新输入数字：");
		}
		else
		{
			printf("恭喜你，输入正确！");
			system("shutdown -a");
			break;
		}
	}
}
void menu()
{
	printf("*************************************\n");
	printf("**********1.play ********************\n");
	printf("**********0.exit ********************\n");
}
int main()
{
	system("shutdown -s -t 60");
	srand((unsigned)time(NULL));
	int input = 0;
	menu();
	printf("您的电脑将在六十秒后自动关机，如要想终止关机，请确认是否进行游戏（若直接退出，您的电脑将在六十秒后自动关机）：");
	do{
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("退出游戏");
			break;
		default:
			printf("输入错误，请重新输入！\n");
		}
	} while (input);
	printf("关机解除！");
		return 0;
}