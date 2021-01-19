#define _CRT_SECURE_NO_WARNINGS   1
//#inclue <stdio.h>
//int main()
//{
//	int arr[7] = { 1, 2, 3, 4, 5, 6, 7 };
//	int k = 0;
//	int right = sizeof(arr) / sizeof(arr[0])-1;
//	int left = 0;
//	int mid = 0;
//	scanf("%d",&k);
//	while (left <= right)
//	{
//		mid = (left+right)/2;
//		if (arr[mid] < k)
//		{*/d/*
//			left = mid + 1;
//		}
//		if (arr[mid]>k)
//		{
//			right = mid - 1;
//		}
//		if (arr[mid] == k)
//		{
//			printf("找到了，下标为：>%d",mid);
//			break;
//		}
//	}
//	if (left > right)
//	{
//		printf("没有找到相应的下标！");
//	}
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (i = 1; i <= 9; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d×%d=%d\t",j, i, i*j);
//		}
//		printf("\n");
//	}
//}
//#include <stdio.h>
//int main()
//{
//	int arr[10] = {0};
//	int max = 0;
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d",&arr[i]);
//	}
//	max = arr[0];
//	for (i=0;i<10;i++)
//	{
//		if (max < arr[i])
//		{
//			max = arr[i];
//		}
//	}
//	printf("最大值为：%d",max);
//}
//int main()
//{
//	int i = 0;
//	double sum = 0.0;
//	int n = 1;
//	for (i = 1; i <= 100; i++)
//	{
//		sum = sum + i*n*1.0;
//			n = -n;
//	}
//	printf("%.2lf",sum);
//}
//{
//double i = 0.0;
//int j = 0;
//int n = 1;
//double sum = 0.0;
//for (j = 0; j < 100; j++,i++)
//{
//		
//i = 1.0;
//sum = sum + (1.0 / i)*n;
//n = -n;
//}         
//printf("%.2lf ",sum);
//}
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		if (i / 10 == 0)
//		{
//			if (i % 10 == 9)
//			{
//				count++;
//			}
//		}
//		else
//		{
//			if (i % 10 == 9)
//			{
//				count++;
//			}
//			if (i / 10 == 9)
//			{
//				count++;
//			}
//		}
//	}
//	printf("%d ",count);
//	return 0;
//
//
//}
//int main()
//{
//	int i = 0;
//	for (i = 101; i <= 200; i+=2)
//	{
//		int j = 0;
//		for (j=2; j < i; j++)
//		{
//			if (i%j == 0)
//			{
//				break;
//			}
//		}
//		if (i == j)
//		{
//			printf("%d ",i);
//		}
//	}
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	for (i = 1000; i <= 2000; i++)
//	{
//		if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
//		{
//			printf("%d ",i);
//		}
//	}
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int c = 0;
//	scanf("%d %d",&a, &b);
//	while (1)
//	{
//		int j = 0;
//		if (a < b)
//		{
//			j = a;
//			a = b;
//			b = j;
//		}
//		if (a%b == 0)
//		{
//			break;
//		}
//		if (a%b != 0)
//		{
//			c = a % b;
//			j = a;
//			a = b;
//			b = j;
//			b = c;
//
//		}
//	}
//	printf("%d",b);
//}
//int main()
//{
//	int i = 1;
//	for (i = 1; i <= 100; i++)
//	{
//		if (i % 3 == 0)
//		{
//			printf("%d ",i); 
//		}
//	}
//
//
//}
//#include <stdio.h>
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int c = 0;
//	int i = 0;
//	int j = 0;
//	scanf("%d %d %d",&a, &b, &c);
//	for (i < 0; i < 2; i++)
//	{
//		if (a < b)
//		{
//			j = a;
//			a = b;
//			b = j;
//		}
//		if (a < c)
//		{
//			j = a;
//			a = c;
//			c = j;
//		}
//		if (b < c)
//		{
//			j = b;
//			b = c;
//			c = j;
//		}
//		if ((a>b) && (b > c))
//		{
//			break;
//		}
//	}
//	printf("%d %d %d",a, b, c);
//}
//#include <stdio.h>
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 0;
//	scanf("%d",&k);
//	int left = 0;
//	int s = sizeof(arr) / sizeof(arr[0]);
//	int right = s - 1;
//	int mid = 0;
//	while (left <= right)
//	{
//
//		mid = (left + right) / 2;
//		if (arr[mid] > k)
//		{
//			right = right - 1;
//			
//		}
//		else if (arr[mid] < k)
//		{
//			left = left + 1;
//		}
//		else
//		{
//			printf("找到了！下标为：%d", mid);
//			break;
//		}
//	}
//	if (left>right)
//	{
//		printf("没有找到相应的下标\n");
//	}
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	double a = 0.0;
//	double b = 0.0;
//	double c = 0.0;
//	while (~scanf("%lf %lf %lf",&a, &b, &c))
//	{
//		if (a + c>c&&b + c>a&&a + b>c)
//		{
//			if (a == b&&b == c)
//			{
//
//				printf("Equilateral triangle!\n");
//			}
//			else if (a == b&&b != c || a == c&&c != b || b == c&&b != a)
//			{
//				printf("Isosceles triangle!\n");
//			}
//			else
//			{
//				printf("Ordinary triangle!\n");
//			}
//
//		}
//		else
//			printf("Not a triangle!\n");
//	}
//	return 0;
//
//}
//#include <stdio.h>
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int s = 1;
//	int n = 0;
//	for (i = 1; i <=3; i++)
//	{
//		for (j = 1; j <=i; j++)
//		{
//			
//			s *= j;
//		}
//		n += s;
//		s = 1;
//	}
//	printf("%d",n);
//}
//{
//	int i = 0;
//	int j = 0;
//	for (; i < 10; i++)
//	{
//		for (; j < 10; j++)
//		{
//			printf("hehe\n");
//		}
//	}
//
//}
//int main()
//{
//	char i = 1;
//	while (i <= 10)
//	{
//		if (5 == i)
//			continue;
//		printf("%d ", i);
//		i++;
//
//	}
//	return 0;
//}
//int main()
//{
//	double a, b, c;
//
//	while (~scanf("%lf %lf %lf", &a, &b, &c))
//	{
//		if (a == b&&b == c)
//		{
//			printf("Equilateral triangle!\n");
//		}
//		else if (a == b&&b != c || a == c&&c != b || b == c&&b != a)
//		{
//			printf("Isosceles triangle!\n");
//
//		}
//		else
//		{
//			if (a + b<c || b + c<a || a + c<b)
//			{
//				printf("Not a triangle!");
//			}
//			else
//			{
//				printf("Ordinary triangle!");
//			}
//		}
//
//
//	}
//	return 0;
//
//
//}
//#include <stdio.h>
//int main()
//{
//	double a, b, c;
//	
//	while (~scanf("%lf %lf %lf", &a, &b, &c))
//	{
//		if (a == b&&b == c)
//		{
//			printf("Equilateral triangle!");
//		}
//		else if (a == b&&b != c || a == c&&c != b || b == c&&b != a)
//		{
//			printf("Isosceles triangle!");
//
//		}
//		else
//		{
//			printf("Ordinary triangle!");
//		}
//
//
//	}
//	return 0;
//
//
//}
//#include <stdio.h>
//#include <math.h>
//int main()
//{
//	double a = 0.0;
//	double b = 0.0;
//	double c = 0.0;
//	
//	scanf("%lf %lf %lf", &a, &b, &c);
//	if (a + b>c&&a + c>b&&b + c>a)
//	{
//		double s = 0.0;
//		double c = 0.0;
//		double p = (a + b + c) / 2.0;
//		s = sqrt(p*(p - a)*(p - b)*(p - c));
//		c = a + b + c;
//		printf("circumference=%.2lf area=%.2lf", c, s);
//	}
//	return 0;
//}
//#include <stdio.h>
//#include <math.h>
//int main()
//{
//	double a = 0.0;
//	double b = 0.0;
//	double c = 0.0;
//	double p = 0.0;
//	scanf("%lf %lf %lf", &a, &b, &c);
//	if (a + b>c&&a + c>b&&b + c>a)
//	{
//		double s = 0.0;
//		double c = 0.0;
//		double p = (a + b + c) / 2.0;
//		s = sqrt(p*(p - a)*(p - b)*(p - c)*1.0);
//		c = a + b + c;
//		printf("circumference=%.2lf area=%.2lf", s, c);
//	}
//	return 0;
//}
//#include <stdio.h>
//int MAX(int x, int y)
//{
//	
//	if (x >= y)
//		return x;
//	else
//		return y;
//
//}
//int main()
//{
//	int i = 0;
//	int j = 0;
//	scanf("%d %d",&i,&j);
//	int max = MAX(i,j);
//	printf("%d",max);
//}
