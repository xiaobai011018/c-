#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <math.h>
#include <string.h>
void Serve(char* arr, int length)
{
	int i = 0;
	int count = 0;
	for (i = 0; i < length; i++)
	{
		if (arr[i] == ' ')
		{
			count++;
		}
	}
	int newlength = length + 2 * count;
	int pose = newlength - 1;
	for (i = length-1; i >= 0; i--)
	{
		if (arr[i] == ' ')
		{
			arr[pose--] = '0';
			arr[pose--] = '2';
			arr[pose--] = '%';
		}
		else
		{
			arr[pose--] = arr[i];
		}
	}
}
int main()
{
	char arr[100] = "Hello World !";
	int i = strlen(arr);
	Serve(arr, i);
	printf("%s",arr);
	return 0;
}
//int main()
//{
//	int i = 0;
//	int f1 = 0;
//	int f2 = 1;
//	int f3 = 0;
//	scanf("%d",&i);
//	while (1)
//	{
//		if (i == f2)
//		{
//			printf("%d",1);
//		}
//		else if (i < f2)
//		{
//			if (abs(f2 - i) < abs(f1 - i))
//			{
//				printf("%d",abs(f2-i));
//				break;
//			}
//			else
//			{
//				printf("%d",abs(f1-i));
//				break;
//			}
//
//		}
//		f3 = f1 + f2;
//		f1 = f2;
//		f2 = f3;
//	}
//}