#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//通过程序创建三个文件
void creat_file1(FILE* fp)//创建文件
{
	int i, s;
	fp = fopen("C:\\java\\file1.txt", "wb");//打开文件
	for (i = 1; i < 11; i++)
	{
		s = 2 * i;
		//把s写进文件里,
		fwrite(&s, sizeof(int), 1, fp);
	}
	printf("文件1创建成功\n");
	fclose(fp);
	fp = NULL;
}
void creat_file2(FILE *fp)
{
	int i, s;
	fp = fopen("C:\\java\\file2.txt", "wb");
	for (i = 1; i < 11; i++)
	{
		s = 3 * i;
		fwrite(&s, sizeof(int), 1, fp);

	}
	printf("文件2 创建成功\n");
	fclose(fp);
	fp = NULL;
}
void print(FILE *fp)//创建输出文件
{
	int a;
	while (fread(&a, sizeof(int), 1, fp))//返回0表示读取结束
	{
		printf("%d\n", a);
	}
	fclose(fp);
	fp = NULL;
}
int main()
{
	FILE *f1 = NULL, *f2 = NULL, *f3 = NULL;
	int a = 0, b = 0, flag1, flag2;
	creat_file1(f1);//创建文件1,指向文件的指针是f1
	printf("文件1中的数据为：\n");
	//打开文件1
	f1 = fopen("C:\\java\\file1.txt", "rb");//以二进制的方式读取
	//打开文件之后输出文件里面的内容
	print(f1);
	creat_file2(f2);
	printf("文件2里的数据为\n");
	f2 = fopen("C:\\java\\file2.txt", "rb");
	print(f2);
	//后续进行合并
	//创建文件3
	f3 = fopen("C:\\java\\file3.txt", "wb");//以二进制的方式写入----------------也就意味着后期我们要以二进制的方式读出/写入
	//开始读文件
	flag1 = fread(&a, sizeof(int), 1, f1);
	flag2 = fread(&b, sizeof(int), 1, f2);

	while (flag1&&flag2)//判读时候有一个先为空
	{
		if (a <= b)
		{
			fwrite(&a, sizeof(int), 1, f3);//把a写进f3中
			flag1 = fread(&a, sizeof(int), 1, f1);
		}
		else
		{
			fwrite(&b, sizeof(int), 1, f3);
			fread(&b, sizeof(int), 1, f2);
		}
	}
	//后续就是可能有一个文件比较长，需要进行一些处理
	if (flag1)
	{
		do{
			fwrite(&a, sizeof(int), 1, f3);
			flag1 = fread(&a, sizeof(int), 1, f1);
		} while (flag1);

	}
	else
	{
		do{
			fwrite(&b, sizeof(int), 1, f3);
			flag2 = fread(&b, sizeof(int), 1, f2);

		} while (flag2);
	}
	fclose(f1);
	fclose(f2);
	fclose(f3);
	printf("合并之后的数据为：\n");
	f3 = fopen("C:\\java\\file1.txt", "rb");
	print(f3);
}