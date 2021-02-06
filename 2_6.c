#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
void Left_Char(char str[10], int k)
{
	int len = strlen(str);
	int n = 0;
	char temp = 0;
	char* p1 = &str[0];
	char* p2 = &str[k];
	while (*(p2 + k-1))
	{
		 temp = *p1;
		*p1 = *p2;
		*p2 = temp;
		p1++;
		p2++;
	}
	n = &str[len] - p2;
	while (n--)
	{
		char* i = p2;
		while (i > p1)
		{
			temp = *i;
			*i = *(i - 1);
			*(i - 1) = temp;
			i--;
		}
		p1++;
		p2++;
	}
}
int main()
{
	char arr[10] = "abcdefle";
	Left_Char(arr, 3);
	return 0;
}
//void sort(int str[10])
//{
//	int left = 0;
//	int right = 9;
//	while (left < right)
//	{
//		if (str[left] % 2 == 1)
//		{
//			left++;
//		}
//		if (str[right] % 2 == 0)
//		{
//			right--;
//		}
//		if (str[left] % 2 == 0 && str[right] % 2 == 1)
//		{
//			int temp = str[left];
//			str[left] = str[right];
//			str[right] = temp;
//		}
//		
//	}
//}
//
//void print(int str1[10])
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ",str1[i]);
//	}
//}
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	sort(arr);
//	print(arr);
//}
//int seck_num(int arr[4][4],int k,int row,int col)
//{
//	int x = 0;
//	int y = col - 1;
//	while (x <= 3 && y >= 0)
//	{
//		if (k < arr[x][y])
//		{
//			y--;
//		}
//		if (k>arr[x][y])
//		{
//			x++;
//		}
//		if (k == arr[x][y])
//		{
//			return 1;
//		}
//	}
//	return 0;
//}
//int main()
//{
//	int k = 6;
//	int i = 0;
//	int j = 0;
//	int arr[4][4] = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 9, 11, 13, 17, }, { 19, 21, 23, 27} };
//	if (seck_num(arr, 100, 4, 4))
//	{
//		printf("找到了\n");
//	}
//	else
//	{
//		printf("找不到\n");
//	}
//}