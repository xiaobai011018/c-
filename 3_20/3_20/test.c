#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#include <assert.h>
#define  INT_MAX 100000
#define  INT_MIN -100000
int main()
{
	FILE* pr = fopen("data.txt", "r");
	if (pr == NULL)
	{
		return 1;
	}
	fgetc(pr);
	fgetc(pr);
	printf("%d\n", ftell(pr));
	fgetc(pr);
	printf("%d\n", ftell(pr));
	fgetc(pr);
	rewind(pr);
	printf("%d\n", ftell(pr));
	fclose(pr);
	pr = NULL;
	return 0;
}
//int main()
//{
//	FILE* pr = fopen("data.txt", "r");
//	if (pr == NULL)
//	{
//		return 1;
//	}
//	fgetc(pr);
//	fgetc(pr);
//	printf("%d\n", ftell(pr));
//	fgetc(pr);
//	printf("%d\n", ftell(pr));
//	fclose(pr);
//	pr = NULL;
//	return 0;
//}
//int main()
//{
//		FILE* pr = fopen("data.txt", "w");
//			if (pr == NULL)
//			{
//				return 1;
//			}
//			fputs("Hello World!", pr);
//			printf("%d", fseek(pr, 9, SEEK_SET));
//			fclose(pr);
//			pr = NULL;
//			return 0;
//}
//int main()
//{
//	FILE* pr = fopen("data.txt", "w");
//		if (pr == NULL)
//		{
//			return 1;
//		}
//		fputc('a', pr);
//		fclose(pr);
//		pr = NULL;
//		return 0;
//}
//int main()
//{
//	FILE* pr = fopen("data.txt", "w");
//	if (pr == NULL)
//	{
//		return 1;
//	}
//	fclose(pr);
//	pr = NULL;
//	return 0;
//}
//int My_Atoi(char* str)
//{
//	int ret = 0;
//	int flag = 1;
//	assert(str);
//	while (*str == ' ')
//	{
//		str++;
//	}
//	if (*str == '+')
//	{
//		str++;
//	}
//	if (*str == '-')
//	{
//		str++;
//		flag = -1;
//	}
//	while (*str!='\0')
//	{
//		if (isdigit(*str))
//		{
//			ret = ret * 10 + (*str - '0')*flag;
//			if (ret > INT_MAX || ret < INT_MIN)
//			{
//				return 0;
//			}
//			str++;
//		}
//		else
//		{
//			return 0;
//		}
//	}
//	return ret;
//}
//int main()
//{
//	char p[] = "  -123";
//	int ret = My_Atoi(p);
//	printf("%d", ret);
//}