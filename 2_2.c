#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <stdlib.h>
void _swap(char*p1, char*p2,int width)
{
	int i = 0;
	for (i = 0; i < width; i++)
	{
		char tmp = *p1;
		*p1 = *p2;
		*p2 = tmp;
		p1++;
		p2++;
	}
}
int cmp_int(const void *e1,const void *e2)
{
	return *((int*)e1) - *((int *)e2);
}
void bubble_sort(void *base, size_t sz, size_t width, int(*cmp)(const void *e1, const void *e2))
{
	size_t i = 0;
	size_t j = 0;
	for (i = 0; i < sz - 1; i++)
	{
		for (j = 0; j < sz - 1 - i; j++)
		{
			if (cmp((char*)base + j*width, (char*)base + (j + 1)*width)>0)
			{
				_swap((char*)base + j*width, (char*)base + (j + 1)*width,width);
			}
		}
	}
}
void print(int arr[],int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ",arr[i]);
	}
}
void test1()
{
	int arr[] = { 1, 3, 2, 7, 5, 6, 0, 8 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	bubble_sort(arr, sz, sizeof(arr[0]), cmp_int);
	print(arr,sz);
}
int main()
{
	test1();
	
}
//#include <stdio.h> 
//int p1(int x, int y)
//{
//	return x + y;
//}
//
//int p2(int x, int y)
//{
//	return x - y;
//}
//
//int p3(int x, int y)
//{
//	return x*y;
//}
//
//int p4(int x, int y)
//{
//	return x / y;
//}
//
//void menu()
//{
//	printf("**********************\n");
//	printf("***1.p1  2.p2*********\n");
//	printf("***3.p1  2.p4*********\n");
//	printf("*****0.exit***********\n");
//	printf("**********************\n");
//}
////int main()
////{
////	int input = 1;
////	int ret = 0;
////	int x = 0;
////	int y = 0;
////	int(*p[5])(int, int) = { 0, p1, p2, p3, p4 };
////	while (input)
////	{
////		menu();
////		printf("请输入：");
////		scanf("%d",&input);
////		if ((input >= 1) && (input <= 4))
////		{
////			printf("请选择:");
////			scanf("%d%d", &x, &y);
////			ret = p[input](x, y);
////			printf("%d\n", ret);
////		}
////		else if (0 == input)
////		{
////			printf("退出游戏\n");
////			break;
////		}
////		else
////		{
////			printf("选择错误，请重新选择\n");
////		}
////	}
////	return 0;
////}
//void calc(int (*p)(int,int))
//{
//	int ret = 0;
//	int x = 0;
//	int y = 0;
//	printf("请输入：");
//	scanf("%d%d", &x, &y);
//	ret = p(x, y);
//	printf("%d\n",ret);
//}
//int main()
//{
//	int input = 0;
//	do
//	{
//		menu();
//		printf("请选择：");
//		scanf("%d",&input);
//		switch (input)
//		{
//		case 1:
//			calc(p1);
//			break;
//		case 2:
//			calc(p2);
//			break;
//		case 3:
//			calc(p3);
//			break;
//		case 4:
//			calc(p4);
//			break;
//		case 0:
//			printf("退出游戏\n");
//			break;
//		default:
//			printf("选择错误，请重新选择\n");
//			break;
//		}
//	} while (input);
//		return 0;
