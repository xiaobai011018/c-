#define _CRT_SECURE_NO_WARNINGS   1
#include "game.h"
void game()
{
	char ret = 0;
	char board[ROW][COL] = { 0 };

	Board(board, ROW, COL);

	PrintBoard(board, ROW, COL);

	while (1)
	{
		PlayerMove(board, ROW, COL);
		ret = IsWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		PrintBoard(board, ROW, COL);

		
		ComputerMove(board, ROW, COL);
		ret = IsWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		PrintBoard(board, ROW, COL);

		
	}
	PrintBoard(board, ROW, COL);
	if (ret == '*')
	{
		printf("���Ӯ\n");
	}
	else if (ret == '#')
	{
		printf("����Ӯ\n");
	}
	else
	{
		printf("ƽ��\n");
	}
}
void menu()
{
	printf("************************\n");
	printf("*******1.play  *********\n");
	printf("*******0.exit  *********\n");
}
int main()
{
	srand((unsigned int)time(NULL));
	int input = 0;
	do
	{		
		menu();
		printf("��ѡ�����Ƿ�����Ϸ(1/0)��");
		scanf("%d", &input);
		switch (input)
		{
			
		case 1:
			game();
				break;
		case 0:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("ѡ�����������ѡ��\n");
			break;
		}
	} while(input);
	return 0;
}