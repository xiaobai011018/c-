#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <math.h>
int main()
{
	int n = 0;
	int count = 0;
	int i = 0;
	int sum = 0;
	int j = 0;
	for (i = 0, j = 0; i <=100000; i++, j++)
	{
		if (i < 10)
		{
			count = 1;
		}
		else if ((i >= 10) && (i < 100))
		{
			count = 2;
		}
		else if ((i >= 100) && (i < 1000))
		{
			count = 3;
		}
		else if ((i >= 1000) && (i < 10000))
		{
			count = 4;
		}
		else if ((i >= 10000) && (i < 100000))
		{
			count = 5;
		}
		else
		{
			count = 6;
		}
		for (n = 0; n < count; n++)
		{
			sum = sum + pow((j % 10), count);
			j = j / 10;
		}
		if (sum == i)
		{
			printf("%d ",i);
		}
		j = i;
		sum = 0;
	}
	/*int arr[] = 0;
	scanf("%d",arr);
	int n = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	for (i = 0; i < n; i++)
	{

	}*/
	return 0;
}
//#include <stdio.h>
//int main()
//{
//	int n = 0;
//	int i = 0;
//	int s = 10;
//	int sum = 0;
//	scanf("%d",&n);
//	int j = n % 10;
//	for (i = 0; i < 5; i++)
//	{
//		sum += n;
//		n = n*s+j;
//	}
//	printf("sum=%d",sum);
//}
//int main()
//{
//	int i = 0;
//	int n = 0;
//	char ch[100] = "0";
//	gets(ch);
//	char *p = ch;
//	n = strlen(ch);
//	for (i = n; i >= 1; i--)
//	{
//		printf("%c", *(p + i-1));
//	}
//}
//void PrintInt(int *arr)
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ",*(arr+i));
//	}
//}
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	PrintInt(arr);
//}
//#include <stdio.h>
//int TwoMain(int n)
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 0; i < 32; i++)
//	{
//		j = n >> i;
//		if (j & 1 == 1)
//		{
//			count++;
//		}
//	}
//	return count;
//}
//int main()
//{
//	int count = 0;
//	int n = 0;
//	scanf("%d",&n);
//	count = TwoMain(n);
//	printf("%d",count);
//}
//int main()
//{
//	char a = 0;
//	scanf("%s",&a);
//	printf("%s",a);
//}
