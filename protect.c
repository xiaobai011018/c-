#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
//int main()
//{
//	double f = 1.0;
//	f++;
//	printf("%.lf",f);
//
//}
#include <stdio.h>
int main()
{
	int i = 0;
	double f = 1.0;
	double sum = 0.0;
	for (i = 1; i <= 100; i++)
	{
		sum = sum + 1.0/i*f;
		f = -f;
	}
	printf("sum=%lf ",sum);
}