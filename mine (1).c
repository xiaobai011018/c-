#define _CRT_SECURE_NO_WARNINGS   1
#include "game.h"
void InitMine(char mine[ROWS][COLS], int rows, int cols,char set)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < rows; i++)
	{
		for (j = 0; j < cols; j++)
		{
			mine[i][j] = set;
		}
	}
}
void DisBoard(char board[ROWS][COLS], int row, int col)
{
	int i = 0;
	int j = 0;
	printf("-----ɨ����Ϸ--------");
	printf("\n");
	for (i = 0; i <=col; i++)
	{
		printf("%d ",i);
	}
	printf("\n");
	for (i = 1; i <= row; i++)
	{
		printf("%d ", i);
		for (j = 1; j <= col; j++)
		{
			
			printf("%c ", board[i][j]);
		}
		
		printf("\n");
	}

	printf("-----ɨ����Ϸ--------\n");
}
void SetCount(char mine[ROWS][COLS], int row, int col)
{
	int count = COUNT;
	while (count)
	{
		int x = rand() % 9 + 1;
		int y = rand() % 9 + 1;
		if (mine[x][y] == '0')
		{
			mine[x][y] = '1';
			count--;
		}
	}
}
void Player(char mine[ROWS][COLS], char show[ROWS][COLS], int rows, int cols)
{
	int s = 0;
	while (s < 9 * 9 - COUNT)
	{
		int x = 0;
		int y = 0;
		printf("��������Ҫ�µ����꣺");
		scanf("%d%d", &x, &y);
		if (x >= 1 && x <= ROW&&y >= 1 && y <= COL)
		{
			if (mine[x][y] == '1')
			{
				printf("��Ϸʧ��\n");
				break;
			}
			else
			{
				int count =
					mine[x][y - 1] +
					mine[x - 1][y - 1] +
					mine[x - 1][y] +
					mine[x][y + 1] +
					mine[x + 1][y + 1] +
					mine[x - 1][y + 1] +
					mine[x + 1][y] +
					mine[x + 1][y - 1];
				int n = count - 8 * '0';
				show[x][y] = n + '0';
				DisBoard(show, ROW, COL);
				s++;
			}
		}
		else
		{
			printf("����Ƿ�������������\n");
		}
	}
		if (s == 9 * 9 - COUNT)
		{
			printf("��ϲ�㣬ɨ�׳ɹ�������\n");
			DisBoard(mine, ROW, COL);
		}
		
		
}
