#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
int main()
{
	int i = 0;
	int n = 0;
	scanf("%d",&n);
	for (i = 0; i<=31; i++)
	{
		n >>= i;
		
		printf("%d ", n & 1);
	}
}
//#include <stdio.h>
//int main()
//{
//	int j = 1;
//	int i = 0;
//	int a = 0;
//	int b = 0;
//	int count = 0;
//	scanf("%d%d", &a, &b);
//	for (i = 0; i<32; i++)
//	{
//		if ((a&j) != (b&j))
//		{
//			count++;
//		}
//		a = a >> 1;
//		b = b >> 1;
//	}
//	printf("%d", count);
//}
//#include <stdio.h>
//int main()
//{
//	char a = 'a';
//	char b = 20;
//	char c = b + a;
//	printf("%d ",c);
//}
//void test()
//{
//	static int a = 10;
//	a++;
//	printf("%d\n",a);
//}
//int main()
//{
//	test();
//	test();
////}
//int main()
//{
//	const int a = 20;
//	a++;
//
//}
