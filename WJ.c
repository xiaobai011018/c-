#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//ͨ�����򴴽������ļ�
void creat_file1(FILE* fp)//�����ļ�
{
	int i, s;
	fp = fopen("C:\\java\\file1.txt", "wb");//���ļ�
	for (i = 1; i < 11; i++)
	{
		s = 2 * i;
		//��sд���ļ���,
		fwrite(&s, sizeof(int), 1, fp);
	}
	printf("�ļ�1�����ɹ�\n");
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
	printf("�ļ�2 �����ɹ�\n");
	fclose(fp);
	fp = NULL;
}
void print(FILE *fp)//��������ļ�
{
	int a;
	while (fread(&a, sizeof(int), 1, fp))//����0��ʾ��ȡ����
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
	creat_file1(f1);//�����ļ�1,ָ���ļ���ָ����f1
	printf("�ļ�1�е�����Ϊ��\n");
	//���ļ�1
	f1 = fopen("C:\\java\\file1.txt", "rb");//�Զ����Ƶķ�ʽ��ȡ
	//���ļ�֮������ļ����������
	print(f1);
	creat_file2(f2);
	printf("�ļ�2�������Ϊ\n");
	f2 = fopen("C:\\java\\file2.txt", "rb");
	print(f2);
	//�������кϲ�
	//�����ļ�3
	f3 = fopen("C:\\java\\file3.txt", "wb");//�Զ����Ƶķ�ʽд��----------------Ҳ����ζ�ź�������Ҫ�Զ����Ƶķ�ʽ����/д��
	//��ʼ���ļ�
	flag1 = fread(&a, sizeof(int), 1, f1);
	flag2 = fread(&b, sizeof(int), 1, f2);

	while (flag1&&flag2)//�ж�ʱ����һ����Ϊ��
	{
		if (a <= b)
		{
			fwrite(&a, sizeof(int), 1, f3);//��aд��f3��
			flag1 = fread(&a, sizeof(int), 1, f1);
		}
		else
		{
			fwrite(&b, sizeof(int), 1, f3);
			fread(&b, sizeof(int), 1, f2);
		}
	}
	//�������ǿ�����һ���ļ��Ƚϳ�����Ҫ����һЩ����
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
	printf("�ϲ�֮�������Ϊ��\n");
	f3 = fopen("C:\\java\\file1.txt", "rb");
	print(f3);
}