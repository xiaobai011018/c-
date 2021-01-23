#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
int main()
{
	int n = 0;
	int i = 0;
	int x = 1;
	int y = 1;
	int tep = 1;
	scanf("%d",&n);
	for (i = 0; i < n-2; i++)
	{
		if (n <= 2)
		{
			printf("1");
		}
		else
		{
			x = y;
			y = tep;
			tep = x + y;

		}
	}
	printf("%d",tep);
}
//#include <stdio.h>
//int Fib(int n)
//{
//	if (n <= 2)
//	{
//		return 1;
//	}
//	else
//	{
//		return Fib(n - 1) + Fib(n - 2);
//	}
//}
//int main()
//{
//	int n = 0;
//	scanf("%d",&n);
//	int ret = Fib(n);
//	printf("%d",ret);
//}
//#include <stdio.h>
//int my_main(int n, int k)
//{
//	if (k != 0)
//	{
//		return n*my_main(n, k - 1);
//	}
//	else
//		return 1;
//}
//int main()
//{
//	int n = 0;
//	int k = 0;
//	int ret = 0;
//	scanf("%d %d",&n, &k); 
//	ret = my_main(n, k);
//	printf("%d",ret);
//}
//#include <stdio.h>
//int DigitSum(int n)
//{
//	if (n / 10 != 0)
//	{
//		return (n%10+DigitSum(n/10));
//	}
//	else
//	{
//		return n;
//	}
//}
//int main()
//{
//	int n = 0;
//	int ret = 0;
//	scanf("%d",&n);
//	ret = DigitSum(n);
//	printf("%d",ret);
//	return 0;
//}
//#include <stdio.h>
//void reverse_string(char * string)
//{
//	if ('\0' != *string)
//	{
//		reverse_string(string+1);
//	}
//	else
//	{
//		return string-1;
//	}
//	printf("%c",*string);
//}
//
//int main()
//{
//	
//	char arr[20] = "0";
//	scanf("%s",arr);
//	reverse_string(arr);
//}
//int main()
//{
//	char arr[2] = "ab";
//	printf("%d",sizeof(arr));
//	printf("%d", strlen(arr));
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int i = 0;
//	char ch[20] = "0";
//	scanf("%s",ch);
//	int count = 0;
//	for (i = 0; i < 20; i++)
//	{
//		if ('\0' != ch[i])
//		{
//			count++;
//		}
//		else
//		{
//			break;
//		}
//	}
//	printf("%d",count);
//	return 0;
//}
//#include <stdio.h>
//int S_strlen(char *ch)
//{
//	if ('\0' != *ch)
//	{
//		return (1 + S_strlen(ch + 1));
//	}
//	else
//	{
//		return 0;
//	}
//}
//int main()
//{
//	char ch[20] = "0";
//	scanf("%s",&ch);
//	int ret = 0;
//	ret = S_strlen(ch);
//	printf("%d",ret);
//	return 0;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d",&n);
//	int i = 0;
//	int x = 1;
//	for (i = 1; i <= n; i++)
//	{
//		x *= i;
//	}
//	printf("%d",x);
//}
//int Recur(int x)
//{
//	int i = 1;
//	if (1 != x)
//	{
//		return (x*Recur(x - 1));
//
//	}
//
//	if (1 == x)
//		return x;
//}
//
//int main()
//{
//	int n = 0;
//	scanf("%d",&n);
//	int ret = Recur(n);
//	printf("%d",ret);
//}
//void print(int x)
//{
//	if (x / 10 != 0)
//	{
//		print(x / 10);
//	}
//	
//	printf("%d ",x%10);
//}
//int main()
//{
//	int n = 0;
//	scanf("%d",&n);
//
//	print(n);
//}
//#include <stdio.h>
//int main()
//{
//	char acX[] = "abcdefg";
//	char acY[] = { 'a','b','c','d','e','f','g'};
//	printf("%d %d",strlen(acX), strlen(acY));
//}