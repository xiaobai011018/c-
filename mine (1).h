#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ROW 9
#define COL 9
#define ROWS ROW+2
#define COLS COL+2
#define COUNT 10
void InitMine(char mine[ROWS][COLS],int rows,int cols, char set);
void InitMine(char show[ROWS][COLS], int rows, int cols, char set);
void DisBoard(char board[ROWS][COLS], int row, int col);
void SetCount(char mine[ROWS][COLS], int row, int col);
void Player(char mine[ROWS][COLS], char show[ROWS][COLS], int rows, int cols);