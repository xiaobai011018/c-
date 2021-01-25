#include <stdio.h>
#define ROW 3
#define COL 3
void Board(char board[ROW][COL], int row, int col);
void PrintBoard(char board[ROW][COL], int row, int col);
void PlayerMove(char board[ROW][COL],int row, int col);
void ComputerMove(char board[ROW][COL],int row, int col);
char IsWin(char board[ROW][COL],int row, int col);
char IsFull(char board[ROW][COL], int row, int col);