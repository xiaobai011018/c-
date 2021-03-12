#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
void SearchDog(int arr[],int* str)
{
	int n = 0;
	int i = 0;
	int j = 0;
	for (i = 0; i < 6;i++)
	{
		j = i + 1;
		for (j = 0; j < 6;j++)
		{
			if (j == i&&i != 5)
			{
				j++;
			}
			if (*(arr + i) == *(arr + j))
			{
				break;
			}
			
		}
		if (j==6)
		{
			*(str + n) = *(arr + i);
			n++;
		}
	}
	
}
int main()
{
	int str[2] = {0,0};
	int arr[6] = { 1, 4, 1, 4, 5, 3 };
	SearchDog(arr,str);
	for (int i = 0; i < 2; i++)
	{
		printf("%d ",str[i]);
	}
	return 0;
}
//char* my_strncpy(char* dest, char* src, size_t count)
//{
//	char* str = dest;
//	int i = 0;
//	for (i = 0; i < count; i++)
//	{
//		*str = *src;
//		str++;
//		src++;
//	}
//	return dest;
//}
//int main()
//{
//	char dest[20] = "hello";
//	char src[20] = "world";
//	char* str = my_strncpy(dest, src, 4);
//	printf("%s",str); 
//}
//char* my_strncat(char* dest, const char* src,size_t count)
//{
//	int i = 0;
//	char* str = dest;
//	assert(dest);
//	assert(src);
//	while (*str != '\0')
//	{
//		str++;
//	}
//	for (i = 0; i < count; i++)
//	{
//		*str = *src;
//		str++;
//		src++;
//	}
//	return dest;
//}
//int main()
//{
//	char dest[20] = "Hello";
//	char src[20] = "world";
//	char* str = my_strncat(dest, src,6);
//	printf("%s",str);
//}
//int main()
//{
//	char *str = "123";
//	int num = atoi(str);
//	printf("%d",num);
//}