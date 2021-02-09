#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#define ROW 4
#define COL 4
int Seck(int* str, int k)
{
	int left = 0;
	int right = COL-1;
	while (left <= right)
	{
		int n = (left + right) / 2;
		if (str[n] < k)
		{
			left++;
		}
		else if (str[n] > k)
		{
			right--;
		}
		else
		{
			return n;
		}
	}
	if (str[0] == '\0')
	{
		return -1;
	}
	else
	{
		Seck(str+1, k);
	}
}
int main()
{
	int ret = 0;
	int arr[ROW][COL] = { 1, 2, 8, 9, 2, 4, 9, 12, 4, 7, 10, 13, 6, 8, 11, 15 };
	ret = Seck(arr, 11);
	if (-1 == ret)
	{
		printf("找不到\n");
	}
	else
	{
		printf("找到了\n");
	}
	return 0;
}