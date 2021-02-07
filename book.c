#define _CRT_SECURE_NO_WARNINGS   1
#include "Address_Book.h"
void menu()
{
	printf("*************************\n");
	printf("****1.ADD    2.DEL*******\n");
	printf("****3.SECK   4.MODI******\n");
	printf("****0.EXIT   5.SHOW******\n");
	printf("*************************\n");
	printf("*************************\n");

}
int main()
{
	int input = 0;
	struct Peo NUM;
	InitBook(&NUM);
	do
	{
		menu();
		printf("请选择：>");
		scanf("%d", &input);
		switch (input)
		{
		case ADD:
			AddBook(&NUM);
			break;
		case DEL:
			DelBook(&NUM);
			break;
		case SECK:
			SeckBook (&NUM);
			break;
		case MODI:
			ModiBook(&NUM);
			break;
		case SHOW:
			ShowBook(&NUM);
			break;
		default:
			printf("选择错误，请重新选择\n");
			break;
		}
	} while (input);
	return 0;
}