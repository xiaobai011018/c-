#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
int main()
{
	int a = 2;
	int b = 3;
	printf("a=%d b=%d\n", a, b);
	a = a^b;
	b = a^b;
	a = a^b; 
	printf("a=%d b=%d\n", a, b);
	return 0;
}
//int main()
//{
//	int a = 2;
//	int b = 3;
//	printf("a=%d b=%d\n", a, b);
//	a = a + b;
//	b = a - b;
//	a = a - b;
//	printf("a=%d b=%d\n", a, b);
//	return 0;
//}
//int main()
//{
//	int a = 2;
//	int b = 3;
//	int c = 0;//ÁÙÊ±±äÁ¿
//	printf("a=%d b=%d\n", a, b);
//	c = a;
//	a = b;
//	b = c;
//	printf("a=%d b=%d",a, b);
//	return 0;
//}
//int main()
//{
//	int a = 20;
//	a >>= 3;
//	printf("%d",a);
//}
//#include <stdio.h>
//#include <string.h>
//void my_reverse(char *str)
//{
//	int len = strlen(str);
//	char tmp = *str;
//	*str = *(str + len - 1);
//	*(str + len - 1) = '\0';
//	if (strlen(str + 1) >= 2)
//	{
//		my_reverse(str + 1);
//	}
//		*(str + len - 1) = tmp;
//}
//int main()
//{
//	char arr[] = "abcdef";
//	printf("%s\n", arr);
//	my_reverse(arr);
//	printf("%s",arr);
//	return 0;
//}
//#include <stdio.h>
//void reverse_string(char *str)
//{
//	int len = strlen(str);
//	char tmp = *str;
//	*str = *(str+len-1);
//	*(str + len - 1) = '\0';
//	if (strlen(str + 1) >= 2)
//		reverse_string(str + 1);
//	*(str + len - 1) = tmp;
//}
//int main()
//{
//	char arr[] = "abcdef";
//	printf("%s\n",arr);
//	reverse_string(arr);
//	printf("%s\n", arr);
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int j = 0;
//	int k = 0;
//	int i = 0;
//	int arr[10] = { 0 };
//	int arr2[10] = { 0 };
//	int arr1[10] = { 0 };
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d",&arr[i]);
//	}
//	for (i = 0; i < 10; i++)
//	{
//		if (arr[i] % 2 == 0)
//		{
//			arr2[j] = arr[i];
//			j++;
//		}
//		else
//		{
//			arr1[k] = arr[i];
//				k++;
//		}
//	}
//	for (i = 0; i < 10; i++)
//	{
//		if (i < 5)
//		{
//			arr[i] = arr1[i];
//		}
//		else
//		{
//			arr[i] = arr2[i - 5];
//		}
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ",arr[i]);
//	}
//	return 0;
//}
//void my_strcpy(char *arr3,char *arr4)
//{
//	while (*arr3!='\0'&&arr4!='\0')
//	{
//		*arr3 = *arr4;
//		arr3++;
//		arr4++;
//	}
//}
//int main()
//{
//	int i = 0;
//	char arr1[20] = "abcdef";
//	int sz = strlen(arr1);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%c",arr1[i]);
//	}
//	printf("\n");
//	char arr2[20] = "hijklm";
//	my_strcpy(arr1, arr2);
//	for (i = 0; i < sz; i++)
//	{
//		printf("%c", arr1[i]);
//	}
//}