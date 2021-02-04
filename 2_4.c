#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <assert.h>
size_t my_strlen(const char* str)
{
	assert(str != NULL);
	if (0 == *str)
	{
		return 0;
	}
	return 1 + my_strlen(str++);
}
int main()
{
	size_t ret = 0;
	char arr[10] = "abcd";
	ret = my_strlen(arr);
	printf("%d",ret);
}
//char* my_strcpy(char* dest, const char* sours)
//{
//	char* str = dest;
//	while (*dest)
//	{
//		dest++;
//	}
//	while (*dest++=*sours++)
//	{
//		;
//	}
//	return str;
//}
//int main()
//{
//	char* ret = 0;
//	char arr1[20] = "abcdb";
//	char arr2[10] = "abc";
//
//	printf("%s",my_strcpy(arr1, arr2));
//
//}
//int main()
//{
//	int a = 0;
//	int b = 1;
//	printf("%d",(a==b));
//}
//int my_strcmp(const char* str1, const char* str2)
//{
//	assert(str1&&str2);
//	while (1)
//	{
//		while (*str1++ == *str2++)
//		{
//			;
//		}
//
//	      if (*str1 > *str2)
//		{
//			return *str1 - *str2;
//		}
//		  else if (*str1 < *str2)
//		{
//			return *str1 - *str2;
//		}
//		else
//		{
//			return 0;
//		}
//	}
//}
//int main()
//{
//	int ret = 0;
//	char arr1[10] = "abe";
//	char arr2[10] = "ade";
//	ret = my_strcmp(arr1, arr2);
//	if (ret > 0)
//	{
//		printf("arr1>arr2");
//	}
//	else if (ret < 0)
//	{
//		printf("arr1<arr2");
//	}
//	else
//	{
//		printf("arr1=arr2");
//	}
//	return 0;
//}
//char* my_strcat(char*str1, const char*str2)
//{
//	char*temp = str1;
//	assert(str1&&str2);
//	while (*str1++)
//	{
//		if (!*str1)
//		{
//			while (*str1++=*str2++)
//			{
//				;
//			}
//		}
//	}
//	return temp;
//}
//int main()
//{
//	char arr1[20] = "abcd ";
//	char arr2[10] = "abc";
//	printf("%s", my_strcat(arr1, arr2));
//}
//char* my_strstr(const char *temp1,const char *temp2)
//{
//	const char *str = temp1;
//	while (*str)
//	{
//		const char *str1 = str;
//		const char *str2 = temp2;
//		while ((*str2) && (*str1) && (*str1 == *str2))
//		{
//			str1++;
//			str2++;
//		}
//		if (0 == *str2)
//		{
//			return (char*)str;
//		}
//		str++;
//	}
//	return NULL;
//}
//int main()
//{
//	char * ret = NULL;
//	char arr1[20] = "acdebqwe";
//	char arr2[10] = "bqw";
//	ret = my_strstr(arr1, arr2);
//	if (!ret)
//	{
//		printf("找不到\n");
//	}
//	else
//	{
//		printf("%s",ret);
//	}
//}
//int main()
//{
//	int a = 0;
//	if (a)
//	{
//		a = 2;
//	}
//	printf("%d",a);
//	return 0;
//}

//double findMaxAverage(int* nums, int numsSize, int k){
//	int i = 0;
//	double sum = 0;
//	int j = 0;
//	int temp = 0;
//	for (i = 0; i<numsSize - 1; i++)
//	{
//		for (j = 0; j<numsSize - 1 - i; j++)
//		{
//			if ((*nums)<(*(nums+1)))
//			{
//				 temp = *nums;
//				*nums = *(nums+1);
//				*(nums) = temp;
//			}
//			nums++;
//		}
//	}
//	for (i = 0; i<k; i++)
//	{
//		sum += *nums;
//		nums++;
//	}
//	return sum / k*1.0;
//
//}
//int main()
//{
//	int arr[6] = { 1, 12, -5, -6, 50, 3 };
//	int i = 0;
//	int k = 0;
//	/*for (i = 0; i<6; i++)
//	{
//		scanf("%d", &arr[i]);
//	}*/
//	scanf("%d", &k);
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	double ret = findMaxAverage(arr, sz, k);
//	printf("%.2lf", ret);
//}
//int Jump(int n)
//{
//	int count = 0;
//	if (1 == n)
//	{
//		return 1;
//	}
//	else if (2 == n)
//	{
//		return 2;
//	}
//	else 
//	{
//		return Jump(n - 2)+Jump(n - 1);
//	}
//}
//int main()
//{
//	int count = 0;
//	int n = 0;
//	printf("请输入楼梯数：");
//	scanf("%d", &n);
//	count = Jump(n);
//	printf("%d",count);
//}
//void Move(char c1, char c2)
//{
//	printf("%c->%c\n", c1, c2);
//}
//void HanLuo(int n, char x, char y, char z)
//{
//	if (1 == n)
//	{
//		Move(x, z);
//	}
//	else
//	{
//		HanLuo(n - 1, x, z, y);
//		Move(x, z);
//		HanLuo(n - 1, y, x, z);
//	}
//}
//
//
//int main()
//{
//	int n = 0;
//	printf("请输入你要移动的盘子的数量：");
//	scanf("%d", &n);
//	HanLuo(n, 'a', 'b', 'c');
//}
//int row = 0;
//int col = 0;
//int main()
//{
//	scanf("%d", &row);
//	scanf("%d", &col);
//	return 0;
//}
//void Move(char c1, char c2)
//{
//	printf("%c->%c\n", c1, c2);
//}
//void HanLuo(int n, char x, char y, char z)
//{
//	if (1 == n)
//	{
//		Move(x, z);
//	}
//	else
//	{
//		HanLuo(n - 1, x, z, y);
//		Move(x, z);
//		HanLuo(n - 1, y, x, z);
//	}
//}
//
//
//int main()
//{
//	int n = 0;
//	printf("请输入你要移动的盘子的数量：");
//	scanf("%d",&n);
//	HanLuo(n, 'a', 'b', 'c');
//}
//int main()
//{
//	int a[4] = { 1, 2, 3, 4 };
//	int*ptr1 = (int*)(&a + 1);
//	int*ptr2 = (int*)((int)a + 1);
//	printf("%x,%x", ptr1[-1], *ptr2);
//	return 0;
//}
//int main()
//{
//	int a[5][5];
//	int(*p)[4];
//	p = a;
//	printf("%p,%d\n", &p[4][2] - &a[4][2], &p[4][2] - &a[4][2]);
//	return 0;
//}
//int main()
//{
//	char* a[] = { "work", "at", "alibaba" }; 
//	char**pa = a;
//	pa++;
//	printf("%s\n", *pa);
//	return 0;
//}
//int main()
//{
//	int aa[2][5] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int *ptr1 = (int *)(&aa + 1);
//	int *ptr2 = (int *)(*(aa + 1));
//	printf("%d,%d", *(ptr1 - 1), *(ptr2 - 1));
//	return 0;
//}