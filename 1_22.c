#define _CRT_SECURE_NO_WARNINGS   1
//#include <stdio.h>
//int main()
//{
//	int year = 0;
//	int month = 0;
//	int arr[12] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//	while (~scanf("%d %d", &year, &month))
//	{
//		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
//		{
//			if (month == 2)
//			{
//				printf("%d", 29);
//			}
//			else{
//				printf("%d", arr[month - 1]);
//			}
//		}
//		else
//		{
//			printf("%d", arr[month - 1]);
//		}
//	}
//}
//#include <stdio.h>
//int main()
//{
//	int arr[7] = { 0 };
//	int i = 0;
//	int score = 0;
//	double sum = 0;
//	for (i = 0; i<7; i++)
//	{
//		scanf("%d", &arr[i]);
//	}
//	int max = arr[0];
//	int small = arr[0];
//	for (i = 1; i<7; i++)
//	{
//		if (max<arr[i])
//		{
//			max = arr[i];
//		}
//	}
//	for (i = 0; i<7; i++)
//	{
//		if (small>arr[i])
//		{
//			small = arr[i];
//		}
//	}
//	for (i = 0; i<7; i++)
//	{
//		score += arr[i];
//	}
//	sum = (score - small - max) / 5.0;
//	printf("%.2lf", sum);
//}
//#include <stdio.h>
//void print()
//{
//	int i = 0;
//	for (i = 1; i <= 9; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d×%d=%2d ",i, j, i*j);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	print();
//}
//void ExInt(int *x, int *y)
//{
//	int j = 0;
//	j = *x;
//	*x = *y;
//	*y = j;
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	scanf("%d %d",&a, &b);
//	ExInt(&a, &b);
//	printf("%d %d",a, b);
//}
//int IfLeap(int year)
//{
//	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
//	{
//		return 1;
//	}
//	else
//		return 0;
//}
//int main()
//{
//	int year = 0;
//	scanf("%d",&year);
//	int ret = IfLeap(year);
//	if (ret == 1)
//	{
//		printf("是闰年\n");
//	}
//	else
//	{
//		printf("不是闰年\n");
//	}
//	return 0;
//}
//#include <stdio.h>
//#include <math.h>]
//void printprime()
//{
//	int i = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		int j = 0;
//		for (j = 2; j <= sqrt(i); j++)
//		{
//			if (i%j == 0)
//			{
//				break;
//			}
//		}
//		if (j > sqrt(i))
//		{
//			printf("%d ", i);
//		}
//	}
//}
//int ifprime(int x)
//{
//	int i = 0;
//	for (i = 2; i <= sqrt(x); i++)
//	{
//		if (x%i == 0)
//		{
//			return 0;
//			break;
//		}
//	}
//	if (i > sqrt(x))
//	{
//		return 1;
//	}
//}
//int main()
//{
//	int n = 0;
//	scanf("%d",&n);
//	int ret = ifprime(n);
//	if (ret == 1)
//	{
//		printf("是素数\n");
//	}
//	else
//	{
//		printf("不是素数\n");
//	}
//	printprime();
//	return 0;
//}