#define _CRT_SECURE_NO_WARNINGS   1
#include "game.h"
void game()
{
	char mine[ROWS][COLS] = {0};
	char show[ROWS][COLS] = {0};
	InitMine(mine, ROWS, COLS, '0');
	InitMine(show, ROWS, COLS, '*');
	//DisBoard(mine, ROW, COL);
	DisBoard(show, ROW, COL);
	SetCount(mine, ROW, COL);
	DisBoard(mine, ROW, COL);
	Player(mine, show, ROWS, COLS);
}

void menu()
{
	printf("	扫雷游戏          \n");
	printf("*************************\n");
	printf("*******1.play  **********\n"); 
	printf("*******0.exit  **********\n");
}

int main()
{
	srand((unsigned int)time(NULL));
	int input = 0;
	do
	{
		menu();
		printf("请选择是否进入游戏(1/0):");
		scanf("%d",&input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("退出成功");
			break;
		default:
			break;
		}
	} while (input);
	return 0;
}