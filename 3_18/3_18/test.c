#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <errno.h>
#include <string.h>
#include <stdlib.h>
int main()
{
	int* p = malloc(40);
	if (p == NULL)
	{
		printf("nÄÚ´æ¿ª±ÙÊ§°Ü\n");
		return 1;
	}
	free(p);
}
//int main()
//{
//
//	FILE* pr = fopen("data.txt", "w");
//	if (pr == NULL)
//	{
//		printf("%s",strerror(errno));
//	}
//	fputc('a', pr);
//	fclose
//	
//}
//int main()
//{
//	char str[10];
//	scanf("%s", str);
//	fscanf(stdin, "%s", str);
//}x