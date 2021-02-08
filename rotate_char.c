#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <string.h>
void Left_char(char*str,int k,int h)
{
	int n = strlen(str);
	if (h == 1)
	{
		n = n / k;
		char* p1 = str;
		char* p2 = &str[k];

		for (int i = 0; i < n - 1; i++)
		{
			int j = 0;
			for (j = 0; j < k; j++)
			{
				char temp = *p1;
				*p1 = *p2;
				*p2 = temp;
				p1++;
				p2++;
			}
		}
		if (n%k != 0)
		{
			Left_char(p1, n%k, h + 1);
		}
	}
	else
	{
		{
			char* p1 = str[n - k - 1];
			char* p2 = str[n - k];
			n = n / k;
			for (int i = 0; i < n - 1; i++)
			{
				int j = 0;
				for (j = 0; j < k; j++)
				{
					char temp = *p1;
					*p1 = *p2;
					*p2 = temp;
					p1--;
					p2++;
				}
			}
			if (n%k != 0)
			{
				Left_char(p1, n%k, h + 1);
			}
		}

	}
	
}
int main()
{
	char arr[10] = "abcdefg";
	Left_char(arr, 2,1);
	return 0;
}
////Ö¸ÕëÇó½â
//void Left_Char(char str[10], int k)
//{
//	int i = 0;
//	int s = k;
//	int len = strlen(str);
//	int n = 0;
//	n = len / k;
//	char temp = 0;
//	char* p1 = &str[0];
//	char* p2 = &str[k];
//	for (i = 0; i<n-1; i++)
//	{
//		int j = 0;
//		for (j = 0; j < s; j++)
//		{
//			temp = *p1;
//			*p1 = *p2;
//			*p2 = temp;
//			p1++;
//			p2++;
//		}
//	}
//	n = &str[len] - p2;
//	while (n--)
//	{
//		char* i = p2;
//		while (i > p1)
//		{
//			temp = *i;
//			*i = *(i - 1);
//			*(i - 1) = temp;
//			i--;
//		}
//		p1++;
//		p2++;
//	}
//}
//int main()
//{
//	char arr[10] = "abcdefle";
//	Left_Char(arr, 2);
//	return 0;
//}