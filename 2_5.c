#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <string.h>
#include <assert.h>
void leftshit(char* str, size_t n)
{
	int i = 0;
	int m = 0;
	char* temp = str;
	char* p1 = str;
	char* p2 = str + n;
	while (p2 + n)
	{
		*p1 = *p2;
		p1++;
		p2++;
	}
	*p1 = *p2;
	m = n - (p2 - temp);
	for (i = 0; i < m; i++)
	{
		int j = 0;
		for (j = 0; j < n; j++)
		{

		}
	}
}
int main()
{
	char arr[] = "abcdefjl";
	leftshit(arr, 3);
	return 0;
}
//void leftshiftone(char* str)
//{
//	char temp = *str;
//	int sz = strlen(str);
//	int i = 0;
//	for (i = 0; i < sz - 1; i++)
//	{
//		*(str + i) = *(str + i + 1);
//	}
//	*(str+sz-1) = temp;
//
//}
//int main()
//{
//	char arr[] = "abcdef";
//	leftshiftone(arr);
//	leftshiftone(arr);
//	return 0;
//}
//int main()
//{
//	char*c[] = { "ENTER", "NEW", "POINT", "FIRST" };
//	char**cp[] = { c + 3, c + 2, c + 1, c };
//	char***cpp = cp;
//	printf("%s\n", **++cpp);
//	printf("%s\n", *--*++cpp + 3);
//	printf("%s\n", *cpp[-2] + 3);
//	printf("%s\n", cpp[-1][-1] + 1);
//	return 0;
//}
//void* my_memmove(void* dest,const void* src, size_t count)
//{
//	assert(dest&&src);
//	void* ret = dest;
//	if (dest > src)
//	{
//		while (count--)
//		{
//			*((char*)dest + count) = *((char*)src + count);
//		}
//	}
//	else
//	{
//		while (count--)
//		{
//			*((char*)dest) = *((char*)src);
//			dest = (char*)dest + 1;
//			src = (char*)src + 1;
//		}
//	}
//	return ret;
//}
//int main()
//{
//	int arr1[20] = { 1, 2, 3, 4, 5, 6, 7 };
//	my_memmove(arr1+3,arr1+2,12);
//	return 0;
//}
//void* my_memcpy(void* dest, void* src, size_t count)
//{
//	char* str = dest;
//	int i = 0;
//	for (i = 0; i < count; i++)
//	{
//		(*(char*)dest) = (*(char*)src);
//		(char*)dest = (char*)dest + 1;
//		(char*)src = (char*)src + 1;
//	}
//	return str;
//}
//int main()
//{
//	int arr1[20] = { 1, 2, 3, 4, 5, 6 };
//	int arr2[10] = { 5, 6, 7, 8 };
//	my_memcpy(arr1, arr2, 4 * sizeof(arr1[0]));
//	int i = 0;
//	for (i = 0; i < sizeof(arr1) / sizeof(arr1[0]);i++)
//	{
//		printf("%d ",arr1[i]);
//	}
//	
//}
//int main()
//{
//	char str[] = "-This,asamplestring.";
//	char*pch;
//	printf("Splittingstring\"%s\"intotokens:\n", str);
//	pch = strtok(str, ",.-");
//	while (pch != NULL)
//	{
//		printf("%s\n", pch);
//		pch = strtok(NULL, ",.-");
//	}
//	return 0;
//}
//int main()
//{
//	char str1[20];
//	char str2[20];
//	strcpy(str1, "Tobe");
//	strcpy(str2, "ornottobe"); 
//	strncat(str1, str2, 6);
//	puts(str1);
//	return 0;
//}
//int main()
//{
//	char arr1[10] = "abca";
//	char arr2[10] = "bced";
//	strncpy(arr1, arr2, 3);
//	printf("%s",arr1);
//	return 0;
//}