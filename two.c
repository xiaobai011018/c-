#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
int main()
{
	int n = 0;
	int i = 0;
	int j = 0;
	int count = 0;
	scanf("%d",&n);
	for (i = 31; i >= 0; i--)
	{
		j = n >> i;
		printf("%d",j&1);
	}
	printf("\n偶数位:");
	for (i = 31; i >= 1; i-=2)
	{
		j = n >> i;
		printf("%d",j&1);
	}
	printf("\n奇数位:");
	for (i = 30; i >= 0; i -= 2)
	{
		j = n >> i;
		printf("%d", j & 1);
	}
}