#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <string.h>
void reverse(char* left, char* right)
{
	while (left < right)
	{
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
}
int main()
{
	char arr[100] = {0};
	gets(arr);
	int k = strlen(arr);
	reverse(arr, arr + k - 1);
	char* start = arr;
	char* end = arr;
	while (*start != '\0')
	{
		while (*end != ' '&&*end != '\0')
		{
			end++;
		}
		reverse(start, end - 1);
		if (*end == '\0')
		{
			start = end;
		}
		else
		{
			start = end + 1;
			end = start;
		}
	}
	printf("%s",arr);
}
//int main()
//{
//	int n1 = 0;
//	int n2 = 0;
//	int i = 0;
//	scanf("%d %d", &n1, &n2);
//	for (i = 1; i <= (n1>n2?n1:n2); i++)
//	{
//		if ((n1*i)%n1 == 0 && (n1*i)%n2 == 0)
//		{
//			printf("%d", n1*i);
//			break;
//		}
//
//	}
//	return 0;
//}