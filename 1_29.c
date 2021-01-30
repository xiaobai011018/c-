#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <assert.h>
size_t my_strlen(const char *str)
{
	assert(str != NULL);
	char *start = str;
	while (*++str)
	{
		
	}
	return str - start;
}
int main()
{
	char arr[20] = { 0 };
	scanf("%s",arr);
	int len = my_strlen(arr);
	printf("%d",len);
}
//#include <stdio.h>
//#include <assert.h>
//size_t my_strlen(const char *str)
//{
//	int count = 0;
//	assert(str != NULL);
//	char *start = *str;
//	while (*str++)
//	{
//		count++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[20] = { 0 };
//	scanf("%s",arr);
//	int len = my_strlen(arr);
//	printf("%d",len);
//}
//#include <stdio.h>
//int main()
//{
//	int i = 0;
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	for (i = 0; i <= 12; i++)
//	{
//		arr[i] = 0;
//		printf("hello bit\n");
//	}
//	return 0;
//}
//int main()
//{
//	int money = 0;
//	scanf("%d",&money);
//	int n = 0;
//	int count = 0;
//	int empty = 0;
//	n = money;
//	count = money;
//	empty = count;
//	n = empty / 2;
//	count = count + n;
//	empty = empty % 2 + n;
//	while (empty > 1)
//	{
//		n = empty / 2;
//		count = count + n;
//		empty = empty % 2 + n;
//	}
//	printf("%d",count);
//}
//#include <stdio.h>
//int main()
//{
//	int s = 0;
//	int i = 0;
//	for (i = 1; i <= 7; i++)
//	{
//		int j = 0;
//		for (j = 0; j < 7 - i; j++)
//		{
//			printf("  ");
//		}
//		for (j = 1; j <= 2*i - 1; j++)
//		{
//			printf("* ");
//		}
//		printf("\n");
//	}
//	i--;
//	for (i = 0; i < 6; i++)
//	{
//		int j = 0;
//		for (j = 0; j <= i; j++)
//		{
//			printf("  ");
//		}
//		for (j = 0; j<11-2*s;j++ )
//		{
//			printf("* ");
//		}
//		s++;
//		printf("\n");
//	}
//	return 0;
//}
//int main()
//{
//	char arr[10] = { 0 };
//	scanf("%s",arr);
//	return 0;
//}