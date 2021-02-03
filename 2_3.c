#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <string.h>
#include <stdio.h>
int main()
{
	int a[5][5];
	int(*p)[4];
	p = a;
	printf("%p,%d\n", &p[4][2] - &a[4][2], &p[4][2] - &a[4][2]);
	return 0;
}
//int main()
//{
//	int a[3][2] = { 1, 3, 5 };
//	int *p;
//	p = a[0];
//	printf("%d", p[0]);
//	return 0;
//}
//int main()
//{
//	
//		int a[4] = { 1, 2, 3, 4 };
//		int* ptr1 = (int*)(&a + 1);
//		int* ptr2 = (int*)((int)a + 1);
//		printf("%x,%x", ptr1[-1], *ptr2);
//		return 0;
//	
//}
//struct Test
//{  
//	int Num;
//	char* pcName;
//	short sDate;
//	char cha[2];
//	short sBa[4];
//}*p;
////假设p的值为0x100000。如下表表达式的值分别为多少？
//int main()
//{   
//	p = (struct Test*)0x100000;
//	printf("%p\n", p + 0x1);
//	printf("%p\n", (unsigned long)p + 0x1); //100001
//	printf("%p\n", (unsigned int*)p + 0x1);//100004
//	return 0;
//}
//int main()
//{
//	int n = 0;
//	int count = 0;
//	scanf("%d",&n);
//	while (n)
//	{
//		n &= (n-1);
//		count++;
//	}
//	printf("二进制中1的个数=%d\n",count);
//}
//00001001
//00001000
//00001000
//00000111
//00000000
//void Ex_Sort(char* arr, int sz)
//{
//	int j = 0;
//	int k = 0;
//	scanf("%d",&k);
//	char tmp[10] = "";
//	strcpy(tmp, arr);
//	strcat(arr, tmp);
//	for (j = 0; j < sz; j++)
//	{
//		printf("%c", *(arr + k + j));
//	}
//}
//int main()
//{
//	char arr[20] = "abcdef";
//	int sz = strlen(arr);
//	Ex_Sort(arr, sz);
//	return 0;
//}
//int main()
//{
//	char arr1[10] = { 0 };
//	char arr2[10] = "0";
//	gets(arr1);
//	gets(arr2);
//	strcat(arr1, arr2);
//	printf("%s",arr1);
//}
//int Ex_Sort(char*star1, char*star2,int sz1,int sz2)
//{
//	char arr3[20] = "0";
//	strcpy(arr3, star1);
//	strcat(star1, arr3);
//	if (strstr(star1, star2) != NULL)
//	{
//		return 1;
//	}
//	else
//	{
//		return 0;
//	}
//}
//int main()
//{
//	char arr1[20] = "absadas";
//	char arr2[10] = "abc";
//	int sz1 = strlen(arr1);
//	int sz2 = strlen(arr2);
//	int ret = Ex_Sort(arr1, arr2, sz1, sz2);
//	if (1 == ret)
//	{
//		printf("Yes\n");
//	}
//	else
//	{
//		printf("NO\n");
//	}
//	return 0;
//}
//int main()
//{
//	int arr[] = {1,2,23,3};
//	printf("%d",arr);
//}
//int main()
//{
//	char *c[] = { "ENTER", "NEW", "POINT", "FIRST" };
//	char**cp[] = { c + 3, c + 2, c + 1, c };
//	char***cpp = cp;
//	printf("%s\n", **++cpp);
//	printf("%s\n", *--*++cpp + 3);
//	printf("%s\n", *cpp[-2] + 3);
//	printf("%s\n", cpp[-1][-1] + 1);
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int a = 20;
//	int b = 30;
//	int c = 0;
//	int sz = sizeof(c = a + b);
//	printf("%d\n",sz);
//	printf("%d",c);
//}