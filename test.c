#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void game()
{
	int put = 0;
	int ret = rand() % 100 + 1;
	printf("��������Ҫ�µ����֣�");
	while (1)
	{
		scanf("%d",&put);
		if (put < ret)
		{
			printf("��С�ˣ���������������:");
		}
		else if (put > ret)
		{
			printf("�´��ˣ��������������֣�");
		}
		else
		{
			printf("��ϲ�㣬������ȷ��");
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
	printf("���ĵ��Խ�����ʮ����Զ��ػ�����Ҫ����ֹ�ػ�����ȷ���Ƿ������Ϸ����ֱ���˳������ĵ��Խ�����ʮ����Զ��ػ�����");
	do{
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("�˳���Ϸ");
			break;
		default:
			printf("����������������룡\n");
		}
	} while (input);
	printf("�ػ������");
		return 0;
}